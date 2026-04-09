.class public Lcom/google/firebase/crashlytics/internal/common/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/firebase/f;

.field private final c:Lcom/google/firebase/crashlytics/internal/common/G;

.field private final d:Lcom/google/firebase/crashlytics/internal/common/Q;

.field private final e:J

.field private f:Lcom/google/firebase/crashlytics/internal/common/B;

.field private g:Lcom/google/firebase/crashlytics/internal/common/B;

.field private h:Z

.field private i:Lcom/google/firebase/crashlytics/internal/common/q;

.field private final j:Lcom/google/firebase/crashlytics/internal/common/L;

.field private final k:LQ4/g;

.field public final l:LK4/b;

.field private final m:LJ4/a;

.field private final n:Lcom/google/firebase/crashlytics/internal/common/m;

.field private final o:LI4/a;

.field private final p:LI4/l;

.field private final q:LL4/f;


# direct methods
.method public constructor <init>(Lcom/google/firebase/f;Lcom/google/firebase/crashlytics/internal/common/L;LI4/a;Lcom/google/firebase/crashlytics/internal/common/G;LK4/b;LJ4/a;LQ4/g;Lcom/google/firebase/crashlytics/internal/common/m;LI4/l;LL4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->b:Lcom/google/firebase/f;

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/A;->c:Lcom/google/firebase/crashlytics/internal/common/G;

    invoke-virtual {p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/A;->j:Lcom/google/firebase/crashlytics/internal/common/L;

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/A;->o:LI4/a;

    iput-object p5, p0, Lcom/google/firebase/crashlytics/internal/common/A;->l:LK4/b;

    iput-object p6, p0, Lcom/google/firebase/crashlytics/internal/common/A;->m:LJ4/a;

    iput-object p7, p0, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    iput-object p8, p0, Lcom/google/firebase/crashlytics/internal/common/A;->n:Lcom/google/firebase/crashlytics/internal/common/m;

    iput-object p9, p0, Lcom/google/firebase/crashlytics/internal/common/A;->p:LI4/l;

    iput-object p10, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->e:J

    new-instance p1, Lcom/google/firebase/crashlytics/internal/common/Q;

    invoke-direct {p1}, Lcom/google/firebase/crashlytics/internal/common/Q;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->d:Lcom/google/firebase/crashlytics/internal/common/Q;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/A;->t(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/crashlytics/internal/common/A;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/A;->p()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/A;->w(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/A;->s(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/A;->r(LS4/j;)V

    return-void
.end method

.method public static synthetic f(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/A;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/A;->u(Ljava/lang/Throwable;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic h(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/A;->q(LS4/j;)V

    return-void
.end method

.method private i()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    invoke-virtual {v0}, LL4/e;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/s;

    invoke-direct {v1, p0}, Lcom/google/firebase/crashlytics/internal/common/s;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->h:Z

    return-void
.end method

.method private k(LS4/j;)V
    .locals 3

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-static {}, LL4/f;->c()V

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/A;->A()V

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->l:LK4/b;

    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/u;

    invoke-direct {v2, p0}, Lcom/google/firebase/crashlytics/internal/common/u;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;)V

    invoke-interface {v1, v2}, LK4/b;->a(LK4/a;)V

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/q;->S()V

    invoke-interface {p1}, LS4/j;->b()LS4/d;

    move-result-object v1

    iget-object v1, v1, LS4/d;->b:LS4/d$a;

    iget-boolean v1, v1, LS4/d$a;->a:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->y(LS4/j;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, LI4/g;->k(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-interface {p1}, LS4/j;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->W(Lcom/google/android/gms/tasks/Task;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/A;->z()V

    goto :goto_3

    :cond_1
    :try_start_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    invoke-virtual {p1, v0}, LI4/g;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    :try_start_2
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/A;->z()V

    throw p1
.end method

.method private m(LS4/j;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    invoke-virtual {v0}, LL4/e;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/t;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/crashlytics/internal/common/t;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    invoke-virtual {v0, v1, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    invoke-virtual {v0, v1, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    invoke-virtual {v0, v1, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :goto_3
    return-void
.end method

.method public static n()Ljava/lang/String;
    .locals 1

    const-string v0, "19.4.1"

    return-object v0
.end method

.method static o(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, LI4/g;->i(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string/jumbo p0, "FirebaseCrashlytics"

    const-string p1, "."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  | "

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  |"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   \\ |  | /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    \\    /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     \\  /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      \\/"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string/jumbo v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      /\\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     /  \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    /    \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   / |  | \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method

.method private synthetic p()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/q;->r()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic q(LS4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/A;->k(LS4/j;)V

    return-void
.end method

.method private synthetic r(LS4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/A;->k(LS4/j;)V

    return-void
.end method

.method private synthetic s(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/q;->a0(JLjava/lang/String;)V

    return-void
.end method

.method private synthetic t(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->b:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/y;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/y;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private synthetic u(Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/q;->Z(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/util/Map;)V

    return-void
.end method

.method private synthetic v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/q;->T(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->V(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A()V
    .locals 2

    invoke-static {}, LL4/f;->c()V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->f:Lcom/google/firebase/crashlytics/internal/common/B;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/B;->a()Z

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public B(Lcom/google/firebase/crashlytics/internal/common/a;LS4/j;)Z
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v13, 0x0

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->a:Landroid/content/Context;

    const-string/jumbo v3, "com.crashlytics.RequireBuildId"

    const/4 v14, 0x1

    invoke-static {v2, v3, v14}, Lcom/google/firebase/crashlytics/internal/common/i;->i(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Lcom/google/firebase/crashlytics/internal/common/a;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/google/firebase/crashlytics/internal/common/A;->o(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/h;

    invoke-direct {v2}, Lcom/google/firebase/crashlytics/internal/common/h;-><init>()V

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/h;->c()Ljava/lang/String;

    move-result-object v12

    :try_start_0
    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/B;

    const-string/jumbo v3, "crash_marker"

    iget-object v4, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    invoke-direct {v2, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/B;-><init>(Ljava/lang/String;LQ4/g;)V

    iput-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->g:Lcom/google/firebase/crashlytics/internal/common/B;

    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/B;

    const-string/jumbo v3, "initialization_marker"

    iget-object v4, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    invoke-direct {v2, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/B;-><init>(Ljava/lang/String;LQ4/g;)V

    iput-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->f:Lcom/google/firebase/crashlytics/internal/common/B;

    new-instance v11, LM4/o;

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    iget-object v3, v1, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    invoke-direct {v11, v12, v2, v3}, LM4/o;-><init>(Ljava/lang/String;LQ4/g;LL4/f;)V

    new-instance v10, LM4/f;

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    invoke-direct {v10, v2}, LM4/f;-><init>(LQ4/g;)V

    new-instance v8, LT4/a;

    new-instance v2, LT4/c;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, LT4/c;-><init>(I)V

    new-array v3, v14, [LT4/d;

    aput-object v2, v3, v13

    const/16 v2, 0x400

    invoke-direct {v8, v2, v3}, LT4/a;-><init>(I[LT4/d;)V

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->p:LI4/l;

    invoke-virtual {v2, v11}, LI4/l;->c(LM4/o;)V

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->a:Landroid/content/Context;

    iget-object v3, v1, Lcom/google/firebase/crashlytics/internal/common/A;->j:Lcom/google/firebase/crashlytics/internal/common/L;

    iget-object v4, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    iget-object v9, v1, Lcom/google/firebase/crashlytics/internal/common/A;->d:Lcom/google/firebase/crashlytics/internal/common/Q;

    iget-object v7, v1, Lcom/google/firebase/crashlytics/internal/common/A;->n:Lcom/google/firebase/crashlytics/internal/common/m;

    iget-object v6, v1, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    move-object/from16 v5, p1

    move-object/from16 v16, v6

    move-object v6, v10

    move-object/from16 v17, v7

    move-object v7, v11

    move-object/from16 v18, v9

    move-object/from16 v9, p2

    move-object/from16 v23, v10

    move-object/from16 v10, v18

    move-object/from16 v22, v11

    move-object/from16 v11, v17

    move-object v14, v12

    move-object/from16 v12, v16

    invoke-static/range {v2 .. v12}, Lcom/google/firebase/crashlytics/internal/common/f0;->j(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;LQ4/g;Lcom/google/firebase/crashlytics/internal/common/a;LM4/f;LM4/o;LT4/d;LS4/j;Lcom/google/firebase/crashlytics/internal/common/Q;Lcom/google/firebase/crashlytics/internal/common/m;LL4/f;)Lcom/google/firebase/crashlytics/internal/common/f0;

    move-result-object v24

    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/q;

    iget-object v3, v1, Lcom/google/firebase/crashlytics/internal/common/A;->a:Landroid/content/Context;

    iget-object v4, v1, Lcom/google/firebase/crashlytics/internal/common/A;->j:Lcom/google/firebase/crashlytics/internal/common/L;

    iget-object v5, v1, Lcom/google/firebase/crashlytics/internal/common/A;->c:Lcom/google/firebase/crashlytics/internal/common/G;

    iget-object v6, v1, Lcom/google/firebase/crashlytics/internal/common/A;->k:LQ4/g;

    iget-object v7, v1, Lcom/google/firebase/crashlytics/internal/common/A;->g:Lcom/google/firebase/crashlytics/internal/common/B;

    iget-object v8, v1, Lcom/google/firebase/crashlytics/internal/common/A;->o:LI4/a;

    iget-object v9, v1, Lcom/google/firebase/crashlytics/internal/common/A;->m:LJ4/a;

    iget-object v10, v1, Lcom/google/firebase/crashlytics/internal/common/A;->n:Lcom/google/firebase/crashlytics/internal/common/m;

    iget-object v11, v1, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    move-object v15, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, p1

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    invoke-direct/range {v15 .. v28}, Lcom/google/firebase/crashlytics/internal/common/q;-><init>(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/G;LQ4/g;Lcom/google/firebase/crashlytics/internal/common/B;Lcom/google/firebase/crashlytics/internal/common/a;LM4/o;LM4/f;Lcom/google/firebase/crashlytics/internal/common/f0;LI4/a;LJ4/a;Lcom/google/firebase/crashlytics/internal/common/m;LL4/f;)V

    iput-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual/range {p0 .. p0}, Lcom/google/firebase/crashlytics/internal/common/A;->j()Z

    move-result v2

    invoke-direct/range {p0 .. p0}, Lcom/google/firebase/crashlytics/internal/common/A;->i()V

    iget-object v3, v1, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v4

    invoke-virtual {v3, v14, v4, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;LS4/j;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/google/firebase/crashlytics/internal/common/A;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/i;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, LI4/g;->b(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lcom/google/firebase/crashlytics/internal/common/A;->m(LS4/j;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v13

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, LI4/g;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :goto_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/google/firebase/crashlytics/internal/common/A;->i:Lcom/google/firebase/crashlytics/internal/common/q;

    return v13

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public C(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->c:Lcom/google/firebase/crashlytics/internal/common/G;

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/internal/common/G;->h(Ljava/lang/Boolean;)V

    return-void
.end method

.method public D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/x;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/x;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public E(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/w;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/crashlytics/internal/common/w;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method j()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->f:Lcom/google/firebase/crashlytics/internal/common/B;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/B;->c()Z

    move-result v0

    return v0
.end method

.method public l(LS4/j;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/r;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/crashlytics/internal/common/r;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/firebase/crashlytics/internal/common/A;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v2, v2, LL4/f;->a:LL4/e;

    new-instance v3, Lcom/google/firebase/crashlytics/internal/common/v;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/google/firebase/crashlytics/internal/common/v;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V

    invoke-virtual {v2, v3}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public y(Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->q:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/z;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/z;-><init>(Lcom/google/firebase/crashlytics/internal/common/A;Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method z()V
    .locals 3

    invoke-static {}, LL4/f;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/A;->f:Lcom/google/firebase/crashlytics/internal/common/B;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/B;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Initialization marker file was not properly removed."

    invoke-virtual {v0, v1}, LI4/g;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v1

    const-string/jumbo v2, "Problem encountered deleting Crashlytics initialization marker."

    invoke-virtual {v1, v2, v0}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
