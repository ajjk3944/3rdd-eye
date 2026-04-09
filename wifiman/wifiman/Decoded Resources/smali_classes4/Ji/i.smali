.class public abstract LJi/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJi/g;

.field private static volatile choreographer:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYg/u;->b:LYg/u$a;

    new-instance v1, LJi/f;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, LJi/i;->d(Landroid/os/Looper;Z)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3, v0}, LJi/f;-><init>(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {v1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, LYg/u;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    check-cast v0, LJi/g;

    sput-object v0, LJi/i;->a:LJi/g;

    return-void
.end method

.method public static synthetic a(LIi/n;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LJi/i;->i(LIi/n;J)V

    return-void
.end method

.method public static final synthetic b(Landroid/view/Choreographer;LIi/n;)V
    .locals 0

    invoke-static {p0, p1}, LJi/i;->h(Landroid/view/Choreographer;LIi/n;)V

    return-void
.end method

.method public static final synthetic c(LIi/n;)V
    .locals 0

    invoke-static {p0}, LJi/i;->j(LIi/n;)V

    return-void
.end method

.method public static final d(Landroid/os/Looper;Z)Landroid/os/Handler;
    .locals 4

    if-eqz p1, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    const/4 v1, 0x0

    const-class v2, Landroid/os/Looper;

    const-class v3, Landroid/os/Handler;

    if-lt p1, v0, :cond_0

    const-string p1, "createAsync"

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type android.os.Handler"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :cond_0
    :try_start_0
    const-class p1, Landroid/os/Handler$Callback;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, p1, v0}, [Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {p0, v1, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :catch_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object p1

    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object p1
.end method

.method public static final e(Ldh/e;)Ljava/lang/Object;
    .locals 4

    sget-object v0, LJi/i;->choreographer:Landroid/view/Choreographer;

    if-eqz v0, :cond_1

    new-instance v1, LIi/p;

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v1}, LIi/p;->A()V

    invoke-static {v0, v1}, LJi/i;->b(Landroid/view/Choreographer;LIi/n;)V

    invoke-virtual {v1}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object v0

    :cond_1
    invoke-static {p0}, LJi/i;->f(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ldh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LIi/p;

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {v0}, LJi/i;->c(LIi/n;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v1

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v2

    new-instance v3, LJi/i$a;

    invoke-direct {v3, v0}, LJi/i$a;-><init>(LIi/n;)V

    invoke-virtual {v1, v2, v3}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V

    :goto_0
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    return-object v0
.end method

.method public static final g(Landroid/os/Handler;Ljava/lang/String;)LJi/g;
    .locals 1

    new-instance v0, LJi/f;

    invoke-direct {v0, p0, p1}, LJi/f;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final h(Landroid/view/Choreographer;LIi/n;)V
    .locals 1

    new-instance v0, LJi/h;

    invoke-direct {v0, p1}, LJi/h;-><init>(LIi/n;)V

    invoke-virtual {p0, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method private static final i(LIi/n;J)V
    .locals 1

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LIi/n;->J(LIi/J;Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(LIi/n;)V
    .locals 1

    sget-object v0, LJi/i;->choreographer:Landroid/view/Choreographer;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sput-object v0, LJi/i;->choreographer:Landroid/view/Choreographer;

    :cond_0
    invoke-static {v0, p0}, LJi/i;->h(Landroid/view/Choreographer;LIi/n;)V

    return-void
.end method
