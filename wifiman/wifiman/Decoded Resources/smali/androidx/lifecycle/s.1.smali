.class public abstract Landroidx/lifecycle/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/s$d;,
        Landroidx/lifecycle/s$c;,
        Landroidx/lifecycle/s$b;
    }
.end annotation


# static fields
.field static final k:Ljava/lang/Object;


# instance fields
.field final a:Ljava/lang/Object;

.field private b:Ln/b;

.field c:I

.field private d:Z

.field private volatile e:Ljava/lang/Object;

.field volatile f:Ljava/lang/Object;

.field private g:I

.field private h:Z

.field private i:Z

.field private final j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/s;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/s;->a:Ljava/lang/Object;

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/s;->b:Ln/b;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/s;->c:I

    sget-object v0, Landroidx/lifecycle/s;->k:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/s;->f:Ljava/lang/Object;

    new-instance v1, Landroidx/lifecycle/s$a;

    invoke-direct {v1, p0}, Landroidx/lifecycle/s$a;-><init>(Landroidx/lifecycle/s;)V

    iput-object v1, p0, Landroidx/lifecycle/s;->j:Ljava/lang/Runnable;

    iput-object v0, p0, Landroidx/lifecycle/s;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/lifecycle/s;->g:I

    return-void
.end method

.method static b(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lm/c;->g()Lm/c;

    move-result-object v0

    invoke-virtual {v0}, Lm/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot invoke "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d(Landroidx/lifecycle/s$d;)V
    .locals 2

    iget-boolean v0, p1, Landroidx/lifecycle/s$d;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/s$d;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/s$d;->a(Z)V

    return-void

    :cond_1
    iget v0, p1, Landroidx/lifecycle/s$d;->c:I

    iget v1, p0, Landroidx/lifecycle/s;->g:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    iput v1, p1, Landroidx/lifecycle/s$d;->c:I

    iget-object p1, p1, Landroidx/lifecycle/s$d;->a:Landroidx/lifecycle/v;

    iget-object v0, p0, Landroidx/lifecycle/s;->e:Ljava/lang/Object;

    invoke-interface {p1, v0}, Landroidx/lifecycle/v;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method c(I)V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/s;->c:I

    add-int/2addr p1, v0

    iput p1, p0, Landroidx/lifecycle/s;->c:I

    iget-boolean p1, p0, Landroidx/lifecycle/s;->d:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/lifecycle/s;->d:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Landroidx/lifecycle/s;->c:I

    if-eq v0, v2, :cond_5

    if-nez v0, :cond_1

    if-lez v2, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-lez v0, :cond_2

    if-nez v2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Landroidx/lifecycle/s;->j()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/lifecycle/s;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    move v0, v2

    goto :goto_0

    :cond_5
    iput-boolean v1, p0, Landroidx/lifecycle/s;->d:Z

    return-void

    :goto_4
    iput-boolean v1, p0, Landroidx/lifecycle/s;->d:Z

    throw p1
.end method

.method e(Landroidx/lifecycle/s$d;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/lifecycle/s;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/lifecycle/s;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Landroidx/lifecycle/s;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/s;->i:Z

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/s$d;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/lifecycle/s;->b:Ln/b;

    invoke-virtual {v1}, Ln/b;->f()Ln/b$d;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/s$d;

    invoke-direct {p0, v2}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/s$d;)V

    iget-boolean v2, p0, Landroidx/lifecycle/s;->i:Z

    if-eqz v2, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Landroidx/lifecycle/s;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Landroidx/lifecycle/s;->h:Z

    return-void
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/s;->e:Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/s;->k:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget v0, p0, Landroidx/lifecycle/s;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h(Landroidx/lifecycle/o;Landroidx/lifecycle/v;)V
    .locals 2

    const-string v0, "observe"

    invoke-static {v0}, Landroidx/lifecycle/s;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/lifecycle/s$c;

    invoke-direct {v0, p0, p1, p2}, Landroidx/lifecycle/s$c;-><init>(Landroidx/lifecycle/s;Landroidx/lifecycle/o;Landroidx/lifecycle/v;)V

    iget-object v1, p0, Landroidx/lifecycle/s;->b:Ln/b;

    invoke-virtual {v1, p2, v0}, Ln/b;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/s$d;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Landroidx/lifecycle/s$d;->c(Landroidx/lifecycle/o;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    return-void

    :cond_3
    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method

.method public i(Landroidx/lifecycle/v;)V
    .locals 2

    const-string v0, "observeForever"

    invoke-static {v0}, Landroidx/lifecycle/s;->b(Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/s$b;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/s$b;-><init>(Landroidx/lifecycle/s;Landroidx/lifecycle/v;)V

    iget-object v1, p0, Landroidx/lifecycle/s;->b:Ln/b;

    invoke-virtual {v1, p1, v0}, Ln/b;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/s$d;

    instance-of v1, p1, Landroidx/lifecycle/s$c;

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/s$d;->a(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected j()V
    .locals 0

    return-void
.end method

.method protected k()V
    .locals 0

    return-void
.end method

.method protected l(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/s;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/lifecycle/s;->f:Ljava/lang/Object;

    sget-object v2, Landroidx/lifecycle/s;->k:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/s;->f:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lm/c;->g()Lm/c;

    move-result-object p1

    iget-object v0, p0, Landroidx/lifecycle/s;->j:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Lm/c;->c(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m(Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "removeObserver"

    invoke-static {v0}, Landroidx/lifecycle/s;->b(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/s;->b:Ln/b;

    invoke-virtual {v0, p1}, Ln/b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/s$d;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/s$d;->b()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/s$d;->a(Z)V

    return-void
.end method

.method protected n(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "setValue"

    invoke-static {v0}, Landroidx/lifecycle/s;->b(Ljava/lang/String;)V

    iget v0, p0, Landroidx/lifecycle/s;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/lifecycle/s;->g:I

    iput-object p1, p0, Landroidx/lifecycle/s;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/s$d;)V

    return-void
.end method
