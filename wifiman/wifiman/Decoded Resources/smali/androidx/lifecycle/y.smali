.class public final Landroidx/lifecycle/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/y$a;,
        Landroidx/lifecycle/y$b;
    }
.end annotation


# static fields
.field public static final i:Landroidx/lifecycle/y$b;

.field private static final j:Landroidx/lifecycle/y;


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Landroid/os/Handler;

.field private final f:Landroidx/lifecycle/p;

.field private final g:Ljava/lang/Runnable;

.field private final h:Landroidx/lifecycle/B$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/y$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/y;->i:Landroidx/lifecycle/y$b;

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0}, Landroidx/lifecycle/y;-><init>()V

    sput-object v0, Landroidx/lifecycle/y;->j:Landroidx/lifecycle/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/y;->c:Z

    iput-boolean v0, p0, Landroidx/lifecycle/y;->d:Z

    new-instance v0, Landroidx/lifecycle/p;

    invoke-direct {v0, p0}, Landroidx/lifecycle/p;-><init>(Landroidx/lifecycle/o;)V

    iput-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    new-instance v0, Landroidx/lifecycle/x;

    invoke-direct {v0, p0}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/y;)V

    iput-object v0, p0, Landroidx/lifecycle/y;->g:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/y$d;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y$d;-><init>(Landroidx/lifecycle/y;)V

    iput-object v0, p0, Landroidx/lifecycle/y;->h:Landroidx/lifecycle/B$a;

    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/y;)V
    .locals 0

    invoke-static {p0}, Landroidx/lifecycle/y;->j(Landroidx/lifecycle/y;)V

    return-void
.end method

.method public static final synthetic c(Landroidx/lifecycle/y;)Landroidx/lifecycle/B$a;
    .locals 0

    iget-object p0, p0, Landroidx/lifecycle/y;->h:Landroidx/lifecycle/B$a;

    return-object p0
.end method

.method public static final synthetic d()Landroidx/lifecycle/y;
    .locals 1

    sget-object v0, Landroidx/lifecycle/y;->j:Landroidx/lifecycle/y;

    return-object v0
.end method

.method private static final j(Landroidx/lifecycle/y;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/y;->k()V

    invoke-virtual {p0}, Landroidx/lifecycle/y;->l()V

    return-void
.end method


# virtual methods
.method public O()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    return-object v0
.end method

.method public final e()V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/y;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/y;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/y;->e:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/y;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/y;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/y;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/y;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/y;->c:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/y;->e:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/y;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/y;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/y;->a:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/y;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/y;->d:Z

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/y;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/y;->a:I

    invoke-virtual {p0}, Landroidx/lifecycle/y;->l()V

    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/y;->e:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/y$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y$c;-><init>(Landroidx/lifecycle/y;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/y;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/y;->c:Z

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/y;->a:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/y;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/y;->f:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/y;->d:Z

    :cond_0
    return-void
.end method
