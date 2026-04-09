.class public LQ2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ2/o$b;
    }
.end annotation


# static fields
.field private static final f:LQ2/o$b;


# instance fields
.field private volatile a:Lcom/bumptech/glide/j;

.field private final b:LQ2/o$b;

.field private final c:Lo/a;

.field private final d:LQ2/i;

.field private final e:LQ2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ2/o$a;

    invoke-direct {v0}, LQ2/o$a;-><init>()V

    sput-object v0, LQ2/o;->f:LQ2/o$b;

    return-void
.end method

.method public constructor <init>(LQ2/o$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo/a;

    invoke-direct {v0}, Lo/a;-><init>()V

    iput-object v0, p0, LQ2/o;->c:Lo/a;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LQ2/o;->f:LQ2/o$b;

    :goto_0
    iput-object p1, p0, LQ2/o;->b:LQ2/o$b;

    new-instance v0, LQ2/m;

    invoke-direct {v0, p1}, LQ2/m;-><init>(LQ2/o$b;)V

    iput-object v0, p0, LQ2/o;->e:LQ2/m;

    invoke-static {}, LQ2/o;->b()LQ2/i;

    move-result-object p1

    iput-object p1, p0, LQ2/o;->d:LQ2/i;

    return-void
.end method

.method private static a(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b()LQ2/i;
    .locals 1

    sget-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/p;->f:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/p;->e:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LQ2/h;

    invoke-direct {v0}, LQ2/h;-><init>()V

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, LQ2/f;

    invoke-direct {v0}, LQ2/f;-><init>()V

    return-object v0
.end method

.method private static c(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LQ2/o;->c(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private f(Landroid/content/Context;)Lcom/bumptech/glide/j;
    .locals 4

    iget-object v0, p0, LQ2/o;->a:Lcom/bumptech/glide/j;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LQ2/o;->a:Lcom/bumptech/glide/j;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    iget-object v1, p0, LQ2/o;->b:LQ2/o$b;

    new-instance v2, LQ2/a;

    invoke-direct {v2}, LQ2/a;-><init>()V

    new-instance v3, LQ2/g;

    invoke-direct {v3}, LQ2/g;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v1, v0, v2, v3, p1}, LQ2/o$b;->a(Lcom/bumptech/glide/b;LQ2/j;LQ2/p;Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object p1

    iput-object p1, p0, LQ2/o;->a:Lcom/bumptech/glide/j;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    iget-object p1, p0, LQ2/o;->a:Lcom/bumptech/glide/j;

    return-object p1
.end method

.method private static g(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, LQ2/o;->c(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public d(Landroid/content/Context;)Lcom/bumptech/glide/j;
    .locals 2

    if-eqz p1, :cond_2

    invoke-static {}, LW2/l;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_1

    instance-of v0, p1, Landroidx/fragment/app/j;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/j;

    invoke-virtual {p0, p1}, LQ2/o;->e(Landroidx/fragment/app/j;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LQ2/o;->d(Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, LQ2/o;->f(Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Landroidx/fragment/app/j;)Lcom/bumptech/glide/j;
    .locals 7

    invoke-static {}, LW2/l;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LQ2/o;->d(Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LQ2/o;->a(Landroid/app/Activity;)V

    iget-object v0, p0, LQ2/o;->d:LQ2/i;

    invoke-interface {v0, p1}, LQ2/i;->a(Landroid/app/Activity;)V

    invoke-static {p1}, LQ2/o;->g(Landroid/content/Context;)Z

    move-result v6

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v3

    iget-object v1, p0, LQ2/o;->e:LQ2/m;

    invoke-virtual {p1}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v4

    invoke-virtual {p1}, Landroidx/fragment/app/j;->v0()Landroidx/fragment/app/w;

    move-result-object v5

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, LQ2/m;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/k;Landroidx/fragment/app/w;Z)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
