.class public LD4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/a;


# static fields
.field private static volatile c:LD4/a;


# instance fields
.field private final a:LJ3/a;

.field final b:Ljava/util/Map;


# direct methods
.method private constructor <init>(LJ3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LD4/b;->a:LJ3/a;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LD4/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static c(Lcom/google/firebase/f;Landroid/content/Context;Ld5/d;)LD4/a;
    .locals 5

    invoke-static {p0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LD4/b;->c:LD4/a;

    if-nez v0, :cond_2

    const-class v0, LD4/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, LD4/b;->c:LD4/a;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    invoke-virtual {p0}, Lcom/google/firebase/f;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    const-class v2, Lcom/google/firebase/b;

    new-instance v3, LD4/c;

    invoke-direct {v3}, LD4/c;-><init>()V

    new-instance v4, LD4/d;

    invoke-direct {v4}, LD4/d;-><init>()V

    invoke-interface {p2, v2, v3, v4}, Ld5/d;->a(Ljava/lang/Class;Ljava/util/concurrent/Executor;Ld5/b;)V

    const-string/jumbo p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0}, Lcom/google/firebase/f;->t()Z

    move-result p0

    invoke-virtual {v1, p2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p0, LD4/b;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p2, v1}, Lcom/google/android/gms/internal/measurement/i1;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/i1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/i1;->x()LJ3/a;

    move-result-object p1

    invoke-direct {p0, p1}, LD4/b;-><init>(LJ3/a;)V

    sput-object p0, LD4/b;->c:LD4/a;

    :cond_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_2
    sget-object p0, LD4/b;->c:LD4/a;

    return-object p0
.end method

.method static synthetic d(Ld5/a;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method private final e(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LD4/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LD4/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->c(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-static {p1, p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {p1, p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, LD4/b;->a:LJ3/a;

    invoke-virtual {v0, p1, p2, p3}, LJ3/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Ljava/lang/String;LD4/a$b;)LD4/a$a;
    .locals 3

    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->f(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, LD4/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, LD4/b;->a:LJ3/a;

    const-string/jumbo v2, "fiam"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/google/firebase/analytics/connector/internal/d;

    invoke-direct {v2, v0, p2}, Lcom/google/firebase/analytics/connector/internal/d;-><init>(LJ3/a;LD4/a$b;)V

    goto :goto_0

    :cond_2
    const-string/jumbo v2, "clx"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/google/firebase/analytics/connector/internal/f;

    invoke-direct {v2, v0, p2}, Lcom/google/firebase/analytics/connector/internal/f;-><init>(LJ3/a;LD4/a$b;)V

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_4

    iget-object p2, p0, LD4/b;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, LD4/b$a;

    invoke-direct {p2, p0, p1}, LD4/b$a;-><init>(LD4/b;Ljava/lang/String;)V

    return-object p2

    :cond_4
    return-object v1
.end method
