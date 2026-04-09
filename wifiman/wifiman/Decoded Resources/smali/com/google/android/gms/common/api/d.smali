.class public abstract Lcom/google/android/gms/common/api/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/d$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/common/api/a;

.field private final d:Lcom/google/android/gms/common/api/a$d;

.field private final e:Lcom/google/android/gms/common/api/internal/b;

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lcom/google/android/gms/common/api/e;

.field private final i:Lcom/google/android/gms/common/api/internal/m;

.field protected final j:Lcom/google/android/gms/common/api/internal/e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/d$a;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/d;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/d$a;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/d$a;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 3
    invoke-static {p3, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 4
    invoke-static {p5, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 6
    invoke-static {v0, v1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/common/api/d;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/api/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/d;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/common/api/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/common/api/d;->c:Lcom/google/android/gms/common/api/a;

    iput-object p4, p0, Lcom/google/android/gms/common/api/d;->d:Lcom/google/android/gms/common/api/a$d;

    .line 10
    iget-object v1, p5, Lcom/google/android/gms/common/api/d$a;->b:Landroid/os/Looper;

    iput-object v1, p0, Lcom/google/android/gms/common/api/d;->f:Landroid/os/Looper;

    .line 11
    invoke-static {p3, p4, p1}, Lcom/google/android/gms/common/api/internal/b;->a(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/d;->e:Lcom/google/android/gms/common/api/internal/b;

    .line 12
    new-instance p3, Lcom/google/android/gms/common/api/internal/E;

    invoke-direct {p3, p0}, Lcom/google/android/gms/common/api/internal/E;-><init>(Lcom/google/android/gms/common/api/d;)V

    iput-object p3, p0, Lcom/google/android/gms/common/api/d;->h:Lcom/google/android/gms/common/api/e;

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/e;->t(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/e;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/common/api/d;->j:Lcom/google/android/gms/common/api/internal/e;

    .line 14
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/e;->k()I

    move-result p4

    iput p4, p0, Lcom/google/android/gms/common/api/d;->g:I

    .line 15
    iget-object p4, p5, Lcom/google/android/gms/common/api/d$a;->a:Lcom/google/android/gms/common/api/internal/m;

    iput-object p4, p0, Lcom/google/android/gms/common/api/d;->i:Lcom/google/android/gms/common/api/internal/m;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    .line 16
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    .line 17
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/r;->j(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/e;Lcom/google/android/gms/common/api/internal/b;)V

    .line 18
    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/e;->D(Lcom/google/android/gms/common/api/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/d$a;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/d;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/d$a;)V

    return-void
.end method

.method private final o(ILcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    new-instance v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v5, p0, Lcom/google/android/gms/common/api/d;->i:Lcom/google/android/gms/common/api/internal/m;

    iget-object v0, p0, Lcom/google/android/gms/common/api/d;->j:Lcom/google/android/gms/common/api/internal/e;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/e;->z(Lcom/google/android/gms/common/api/d;ILcom/google/android/gms/common/api/internal/n;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/common/api/internal/m;)V

    invoke-virtual {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected e()Ls3/d$a;
    .locals 2

    new-instance v0, Ls3/d$a;

    invoke-direct {v0}, Ls3/d$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls3/d$a;->d(Landroid/accounts/Account;)Ls3/d$a;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/d$a;->c(Ljava/util/Collection;)Ls3/d$a;

    iget-object v1, p0, Lcom/google/android/gms/common/api/d;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/d$a;->e(Ljava/lang/String;)Ls3/d$a;

    iget-object v1, p0, Lcom/google/android/gms/common/api/d;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/d$a;->b(Ljava/lang/String;)Ls3/d$a;

    return-object v0
.end method

.method public f(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/d;->o(ILcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/d;->o(ILcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/d;->o(ILcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method protected i(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final j()Lcom/google/android/gms/common/api/internal/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/d;->e:Lcom/google/android/gms/common/api/internal/b;

    return-object v0
.end method

.method protected k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/d;->g:I

    return v0
.end method

.method public final m(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/z;)Lcom/google/android/gms/common/api/a$f;
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/d;->e()Ls3/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ls3/d$a;->a()Ls3/d;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/common/api/d;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->a()Lcom/google/android/gms/common/api/a$a;

    move-result-object v0

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/a$a;

    iget-object v5, p0, Lcom/google/android/gms/common/api/d;->d:Lcom/google/android/gms/common/api/a$d;

    iget-object v2, p0, Lcom/google/android/gms/common/api/d;->a:Landroid/content/Context;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/common/api/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Ls3/d;Ljava/lang/Object;Lcom/google/android/gms/common/api/e$a;Lcom/google/android/gms/common/api/e$b;)Lcom/google/android/gms/common/api/a$f;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/d;->k()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Ls3/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls3/c;

    invoke-virtual {v0, p2}, Ls3/c;->N(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_2

    instance-of p2, p1, Lcom/google/android/gms/common/api/internal/j;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final n(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/O;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/internal/O;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/d;->e()Ls3/d$a;

    move-result-object v1

    invoke-virtual {v1}, Ls3/d$a;->a()Ls3/d;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/common/api/internal/O;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls3/d;)V

    return-object v0
.end method
