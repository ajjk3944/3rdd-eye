.class public Le5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/i;
.implements Le5/j;


# instance fields
.field private final a:Lf5/b;

.field private final b:Landroid/content/Context;

.field private final c:Lf5/b;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lf5/b;Ljava/util/concurrent/Executor;)V
    .locals 6

    .line 1
    new-instance v1, Le5/c;

    invoke-direct {v1, p1, p2}, Le5/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v0, p0

    move-object v2, p3

    move-object v3, p5

    move-object v4, p4

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Le5/f;-><init>(Lf5/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lf5/b;Landroid/content/Context;)V

    return-void
.end method

.method constructor <init>(Lf5/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lf5/b;Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le5/f;->a:Lf5/b;

    .line 4
    iput-object p2, p0, Le5/f;->d:Ljava/util/Set;

    .line 5
    iput-object p3, p0, Le5/f;->e:Ljava/util/concurrent/Executor;

    .line 6
    iput-object p4, p0, Le5/f;->c:Lf5/b;

    .line 7
    iput-object p5, p0, Le5/f;->b:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Le5/f;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Le5/f;->h()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/String;)Le5/k;
    .locals 0

    invoke-static {p0, p1}, Le5/f;->i(Landroid/content/Context;Ljava/lang/String;)Le5/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LF4/A;LF4/d;)Le5/f;
    .locals 0

    invoke-static {p0, p1}, Le5/f;->g(LF4/A;LF4/d;)Le5/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Le5/f;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0}, Le5/f;->j()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static f()LF4/c;
    .locals 3

    const-class v0, LE4/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-class v1, Le5/i;

    const-class v2, Le5/j;

    filled-new-array {v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    const-class v2, Le5/f;

    invoke-static {v2, v1}, LF4/c;->f(Ljava/lang/Class;[Ljava/lang/Class;)LF4/c$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    const-class v2, Lcom/google/firebase/f;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    const-class v2, Le5/g;

    invoke-static {v2}, LF4/q;->m(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    const-class v2, Lm5/i;

    invoke-static {v2}, LF4/q;->l(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    invoke-static {v0}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    new-instance v2, Le5/b;

    invoke-direct {v2, v0}, Le5/b;-><init>(LF4/A;)V

    invoke-virtual {v1, v2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic g(LF4/A;LF4/d;)Le5/f;
    .locals 7

    new-instance v6, Le5/f;

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    const-class v0, Lcom/google/firebase/f;

    invoke-interface {p1, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/f;

    invoke-virtual {v0}, Lcom/google/firebase/f;->o()Ljava/lang/String;

    move-result-object v2

    const-class v0, Le5/g;

    invoke-interface {p1, v0}, LF4/d;->g(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v0, Lm5/i;

    invoke-interface {p1, v0}, LF4/d;->e(Ljava/lang/Class;)Lf5/b;

    move-result-object v4

    invoke-interface {p1, p0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le5/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lf5/b;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method

.method private synthetic h()Ljava/lang/String;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le5/f;->a:Lf5/b;

    invoke-interface {v0}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/k;

    invoke-virtual {v0}, Le5/k;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Le5/k;->b()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le5/l;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string/jumbo v5, "agent"

    invoke-virtual {v3}, Le5/l;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v5, "dates"

    new-instance v6, Lorg/json/JSONArray;

    invoke-virtual {v3}, Le5/l;->b()Ljava/util/List;

    move-result-object v3

    invoke-direct {v6, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string/jumbo v2, "heartbeats"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v0, "version"

    const-string v2, "2"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Landroid/util/Base64OutputStream;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v4, "UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V

    const-string/jumbo v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_2
    :try_start_7
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v1

    :try_start_8
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0

    :goto_4
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method private static synthetic i(Landroid/content/Context;Ljava/lang/String;)Le5/k;
    .locals 1

    new-instance v0, Le5/k;

    invoke-direct {v0, p0, p1}, Le5/k;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method private synthetic j()Ljava/lang/Void;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le5/f;->a:Lf5/b;

    invoke-interface {v0}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le5/k;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Le5/f;->c:Lf5/b;

    invoke-interface {v3}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm5/i;

    invoke-interface {v3}, Lm5/i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Le5/k;->g(JLjava/lang/String;)V

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Le5/f;->b:Landroid/content/Context;

    invoke-static {v0}, LA1/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Le5/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Le5/d;

    invoke-direct {v1, p0}, Le5/d;-><init>(Le5/f;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public k()Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Le5/f;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Le5/f;->b:Landroid/content/Context;

    invoke-static {v0}, LA1/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Le5/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Le5/e;

    invoke-direct {v1, p0}, Le5/e;-><init>(Le5/f;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
