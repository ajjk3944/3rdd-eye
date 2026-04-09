.class Lcom/google/firebase/crashlytics/internal/common/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final t:Ljava/io/FilenameFilter;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/firebase/crashlytics/internal/common/G;

.field private final c:Lcom/google/firebase/crashlytics/internal/common/B;

.field private final d:LM4/o;

.field private final e:LL4/f;

.field private final f:Lcom/google/firebase/crashlytics/internal/common/L;

.field private final g:LQ4/g;

.field private final h:Lcom/google/firebase/crashlytics/internal/common/a;

.field private final i:LM4/f;

.field private final j:LI4/a;

.field private final k:LJ4/a;

.field private final l:Lcom/google/firebase/crashlytics/internal/common/m;

.field private final m:Lcom/google/firebase/crashlytics/internal/common/f0;

.field private n:Lcom/google/firebase/crashlytics/internal/common/E;

.field private o:LS4/j;

.field final p:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final q:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final r:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final s:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/p;

    invoke-direct {v0}, Lcom/google/firebase/crashlytics/internal/common/p;-><init>()V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/q;->t:Ljava/io/FilenameFilter;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/G;LQ4/g;Lcom/google/firebase/crashlytics/internal/common/B;Lcom/google/firebase/crashlytics/internal/common/a;LM4/o;LM4/f;Lcom/google/firebase/crashlytics/internal/common/f0;LI4/a;LJ4/a;Lcom/google/firebase/crashlytics/internal/common/m;LL4/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->o:LS4/j;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->f:Lcom/google/firebase/crashlytics/internal/common/L;

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->b:Lcom/google/firebase/crashlytics/internal/common/G;

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    iput-object p5, p0, Lcom/google/firebase/crashlytics/internal/common/q;->c:Lcom/google/firebase/crashlytics/internal/common/B;

    iput-object p6, p0, Lcom/google/firebase/crashlytics/internal/common/q;->h:Lcom/google/firebase/crashlytics/internal/common/a;

    iput-object p7, p0, Lcom/google/firebase/crashlytics/internal/common/q;->d:LM4/o;

    iput-object p8, p0, Lcom/google/firebase/crashlytics/internal/common/q;->i:LM4/f;

    iput-object p10, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    iput-object p11, p0, Lcom/google/firebase/crashlytics/internal/common/q;->k:LJ4/a;

    iput-object p12, p0, Lcom/google/firebase/crashlytics/internal/common/q;->l:Lcom/google/firebase/crashlytics/internal/common/m;

    iput-object p9, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    iput-object p13, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    return-void
.end method

.method private A()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/f0;->s()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static B()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->E(J)J

    move-result-wide v0

    return-wide v0
.end method

.method static C(LI4/h;Ljava/lang/String;LQ4/g;[B)Ljava/util/List;
    .locals 6

    const-string/jumbo v0, "user-data"

    invoke-virtual {p2, p1, v0}, LQ4/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string/jumbo v1, "keys"

    invoke-virtual {p2, p1, v1}, LQ4/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "rollouts-state"

    invoke-virtual {p2, p1, v3}, LQ4/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/google/firebase/crashlytics/internal/common/g;

    const-string/jumbo v4, "logs_file"

    const-string/jumbo v5, "logs"

    invoke-direct {v3, v4, v5, p3}, Lcom/google/firebase/crashlytics/internal/common/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/J;

    invoke-interface {p0}, LI4/h;->g()Ljava/io/File;

    move-result-object v3

    const-string/jumbo v4, "crash_meta_file"

    const-string/jumbo v5, "metadata"

    invoke-direct {p3, v4, v5, v3}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo v3, "session"

    invoke-interface {p0}, LI4/h;->f()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v5, "session_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo v3, "app"

    invoke-interface {p0}, LI4/h;->a()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v5, "app_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo v3, "device"

    invoke-interface {p0}, LI4/h;->c()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v5, "device_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo v3, "os"

    invoke-interface {p0}, LI4/h;->b()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v5, "os_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->P(LI4/h;)Lcom/google/firebase/crashlytics/internal/common/O;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo p3, "user_meta_file"

    const-string/jumbo v3, "user"

    invoke-direct {p0, p3, v3, v0}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo p3, "keys_file"

    invoke-direct {p0, p3, v1, v2}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/google/firebase/crashlytics/internal/common/J;

    const-string/jumbo p3, "rollouts_file"

    const-string/jumbo v0, "rollouts"

    invoke-direct {p0, p3, v0, p1}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method private D(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v0, "Couldn\'t get Class Loader"

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v0, "No version control information found"

    invoke-virtual {p1, v0}, LI4/g;->g(Ljava/lang/String;)V

    return-object v1

    :cond_1
    return-object p1
.end method

.method private static E(J)J
    .locals 2

    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    return-wide p0
.end method

.method private synthetic J(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->u(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic K(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private M(J)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/q;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, LI4/g;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Logging app exception event to Firebase Analytics"

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/q$e;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/q$e;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;J)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private N()Lcom/google/android/gms/tasks/Task;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->L()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/q;->M(J)Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse app exception timestamp from file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LI4/g;->k(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method private static O(Ljava/lang/String;Ljava/io/File;LN4/F$a;)Z
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->k(Ljava/lang/String;)V

    :cond_1
    if-nez p2, :cond_2

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "No Tombstones data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LI4/g;->g(Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_4

    :cond_3
    if-nez p2, :cond_4

    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static P(LI4/h;)Lcom/google/firebase/crashlytics/internal/common/O;
    .locals 4

    const/4 v0, 0x0

    invoke-interface {p0}, LI4/h;->e()Ljava/io/File;

    move-result-object p0

    const-string/jumbo v1, "minidump"

    const-string/jumbo v2, "minidump_file"

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/J;

    invoke-direct {v0, v2, v1, p0}, Lcom/google/firebase/crashlytics/internal/common/J;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p0, Lcom/google/firebase/crashlytics/internal/common/g;

    const/4 v3, 0x1

    new-array v3, v3, [B

    aput-byte v0, v3, v0

    invoke-direct {p0, v2, v1, v3}, Lcom/google/firebase/crashlytics/internal/common/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    move-object v0, p0

    :goto_1
    return-object v0
.end method

.method private static R(Ljava/io/InputStream;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private X()Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->b:Lcom/google/firebase/crashlytics/internal/common/G;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/G;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Automatic data collection is disabled."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Notifying that unsent reports are available."

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->b:Lcom/google/firebase/crashlytics/internal/common/G;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/G;->j()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/q$c;

    invoke-direct {v1, p0}, Lcom/google/firebase/crashlytics/internal/common/q$c;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v1

    const-string/jumbo v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, LI4/g;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    invoke-static {v0, v1}, LL4/b;->c(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method private Y(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->a:Landroid/content/Context;

    const-string/jumbo v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v2}, Lcom/google/firebase/crashlytics/internal/common/n;->a(Landroid/app/ActivityManager;Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LM4/f;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    invoke-direct {v1, v2, p1}, LM4/f;-><init>(LQ4/g;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    invoke-static {p1, v2, v3}, LM4/o;->k(Ljava/lang/String;LQ4/g;LL4/f;)LM4/o;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {v3, p1, v0, v1, v2}, Lcom/google/firebase/crashlytics/internal/common/f0;->y(Ljava/lang/String;Ljava/util/List;LM4/f;LM4/o;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "No ApplicationExitInfo available. Session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LI4/g;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANR feature enabled, but device is API "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LI4/g;->i(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->K(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/google/firebase/crashlytics/internal/common/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->J(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(J)J
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->E(J)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic d(Lcom/google/firebase/crashlytics/internal/common/q;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->A()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lcom/google/firebase/crashlytics/internal/common/q;)LJ4/a;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->k:LJ4/a;

    return-object p0
.end method

.method static synthetic f(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/B;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->c:Lcom/google/firebase/crashlytics/internal/common/B;

    return-object p0
.end method

.method static synthetic g(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/f0;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    return-object p0
.end method

.method static synthetic h(Lcom/google/firebase/crashlytics/internal/common/q;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/q;->v(J)V

    return-void
.end method

.method static synthetic i(Lcom/google/firebase/crashlytics/internal/common/q;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/q;->u(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic j(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/G;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->b:Lcom/google/firebase/crashlytics/internal/common/G;

    return-object p0
.end method

.method static synthetic k(Lcom/google/firebase/crashlytics/internal/common/q;)LL4/f;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    return-object p0
.end method

.method static synthetic l(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->N()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->q(Ljava/util/List;)V

    return-void
.end method

.method private static n(Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/a;)LN4/G$a;
    .locals 6

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/L;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/google/firebase/crashlytics/internal/common/a;->f:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/firebase/crashlytics/internal/common/a;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/L;->a()Lcom/google/firebase/crashlytics/internal/common/M$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/M$a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p1, Lcom/google/firebase/crashlytics/internal/common/a;->d:Ljava/lang/String;

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/H;->determineFrom(Ljava/lang/String;)Lcom/google/firebase/crashlytics/internal/common/H;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/H;->getId()I

    move-result v4

    iget-object v5, p1, Lcom/google/firebase/crashlytics/internal/common/a;->h:LI4/f;

    invoke-static/range {v0 .. v5}, LN4/G$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILI4/f;)LN4/G$a;

    move-result-object p0

    return-object p0
.end method

.method private static o(Landroid/content/Context;)LN4/G$b;
    .locals 16

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v3, v0

    mul-long v10, v1, v3

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->k()I

    move-result v5

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/crashlytics/internal/common/i;->b(Landroid/content/Context;)J

    move-result-wide v8

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->w()Z

    move-result v12

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->l()I

    move-result v13

    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v5 .. v15}, LN4/G$b;->c(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)LN4/G$b;

    move-result-object v0

    return-object v0
.end method

.method private static p()LN4/G$c;
    .locals 3

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->x()Z

    move-result v2

    invoke-static {v0, v1, v2}, LN4/G$c;->a(Ljava/lang/String;Ljava/lang/String;Z)LN4/G$c;

    move-result-object v0

    return-object v0
.end method

.method private static q(Ljava/util/List;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private t(ZLS4/j;Z)V
    .locals 3

    invoke-static {}, LL4/f;->c()V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/f0;->s()Ljava/util/SortedSet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, LI4/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-interface {p2}, LS4/j;->b()LS4/d;

    move-result-object p2

    iget-object p2, p2, LS4/d;->b:LS4/d$a;

    iget-boolean p2, p2, LS4/d$a;->b:Z

    if-eqz p2, :cond_1

    invoke-direct {p0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->Y(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p2

    const-string v2, "ANR feature disabled."

    invoke-virtual {p2, v2}, LI4/g;->i(Ljava/lang/String;)V

    :goto_0
    if-eqz p3, :cond_2

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    invoke-interface {p2, v1}, LI4/a;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->x(Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->l:Lcom/google/firebase/crashlytics/internal/common/m;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/firebase/crashlytics/internal/common/m;->e(Ljava/lang/String;)V

    move-object p1, p2

    :goto_1
    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/q;->B()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1, p1}, Lcom/google/firebase/crashlytics/internal/common/f0;->m(JLjava/lang/String;)V

    return-void
.end method

.method private u(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 8

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/q;->B()J

    move-result-wide v6

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Opening a new session with ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/A;->n()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->f:Lcom/google/firebase/crashlytics/internal/common/L;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->h:Lcom/google/firebase/crashlytics/internal/common/a;

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->n(Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/a;)LN4/G$a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/q;->p()LN4/G$c;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/firebase/crashlytics/internal/common/q;->o(Landroid/content/Context;)LN4/G$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    invoke-static {v0, v1, v3}, LN4/G;->b(LN4/G$a;LN4/G$c;LN4/G$b;)LN4/G;

    move-result-object v5

    move-object v0, v4

    move-object v1, p1

    move-wide v3, v6

    invoke-interface/range {v0 .. v5}, LI4/a;->d(Ljava/lang/String;Ljava/lang/String;JLN4/G;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->d:LM4/o;

    invoke-virtual {p2, p1}, LM4/o;->p(Ljava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->i:LM4/f;

    invoke-virtual {p2, p1}, LM4/f;->e(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->l:Lcom/google/firebase/crashlytics/internal/common/m;

    invoke-virtual {p2, p1}, Lcom/google/firebase/crashlytics/internal/common/m;->e(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {p2, p1, v6, v7}, Lcom/google/firebase/crashlytics/internal/common/f0;->t(Ljava/lang/String;J)V

    return-void
.end method

.method private v(J)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ".ae"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LQ4/g;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Create new file failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p2

    const-string v0, "Could not create app exception marker file."

    invoke-virtual {p2, v0, p1}, LI4/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private x(Ljava/lang/String;)V
    .locals 7

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    invoke-interface {v0, p1}, LI4/a;->a(Ljava/lang/String;)LI4/h;

    move-result-object v0

    invoke-interface {v0}, LI4/h;->e()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0}, LI4/h;->d()LN4/F$a;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/google/firebase/crashlytics/internal/common/q;->O(Ljava/lang/String;Ljava/io/File;LN4/F$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v0, "No native core present"

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    new-instance v1, LM4/f;

    iget-object v5, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    invoke-direct {v1, v5, p1}, LM4/f;-><init>(LQ4/g;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    invoke-virtual {v5, p1}, LQ4/g;->k(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v0, "Couldn\'t create directory to store native session files, aborting."

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/q;->v(J)V

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    invoke-virtual {v1}, LM4/f;->b()[B

    move-result-object v4

    invoke-static {v0, p1, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/q;->C(LI4/h;Ljava/lang/String;LQ4/g;[B)Ljava/util/List;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/google/firebase/crashlytics/internal/common/P;->b(Ljava/io/File;Ljava/util/List;)V

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v3

    const-string v4, "CrashlyticsController#finalizePreviousNativeSession"

    invoke-virtual {v3, v4}, LI4/g;->b(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {v3, p1, v0, v2}, Lcom/google/firebase/crashlytics/internal/common/f0;->l(Ljava/lang/String;Ljava/util/List;LN4/F$a;)V

    invoke-virtual {v1}, LM4/f;->a()V

    return-void
.end method

.method private static z()Z
    .locals 1

    :try_start_0
    const-string/jumbo v0, "com.google.firebase.crash.FirebaseCrash"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method F()Ljava/lang/String;
    .locals 3

    const-string/jumbo v0, "META-INF/version-control-info.textproto"

    invoke-direct {p0, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->D(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v1

    const-string/jumbo v2, "Read version control info"

    invoke-virtual {v1, v2}, LI4/g;->b(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/q;->R(Ljava/io/InputStream;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method G(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->H(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method declared-synchronized H(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/q$b;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p3

    move-object v7, p2

    move-object v8, p1

    move v9, p4

    invoke-direct/range {v2 .. v9}, Lcom/google/firebase/crashlytics/internal/common/q$b;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;JLjava/lang/Throwable;Ljava/lang/Thread;LS4/j;Z)V

    invoke-virtual {v0, v1}, LL4/e;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p4, :cond_0

    :try_start_1
    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/i0;->b(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p2

    const-string/jumbo p3, "Error handling uncaught exception"

    invoke-virtual {p2, p3, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string p2, "Cannot send reports. Timed out while fetching settings."

    invoke-virtual {p1, p2}, LI4/g;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method I()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->n:Lcom/google/firebase/crashlytics/internal/common/E;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/E;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method L()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->g:LQ4/g;

    sget-object v1, Lcom/google/firebase/crashlytics/internal/common/q;->t:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, LQ4/g;->h(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method Q(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/o;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/crashlytics/internal/common/o;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method S()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->F()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string/jumbo v1, "com.crashlytics.version-control-info"

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->U(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Saved version control info"

    invoke-virtual {v0, v1}, LI4/g;->g(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v1

    const-string/jumbo v2, "Unable to save version control info"

    invoke-virtual {v1, v2, v0}, LI4/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method T(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->d:LM4/o;

    invoke-virtual {v0, p1, p2}, LM4/o;->n(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/i;->u(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, LI4/g;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method U(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->d:LM4/o;

    invoke-virtual {v0, p1, p2}, LM4/o;->o(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/i;->u(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, LI4/g;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method V(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->d:LM4/o;

    invoke-virtual {v0, p1}, LM4/o;->q(Ljava/lang/String;)V

    return-void
.end method

.method W(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/f0;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v0, "No crash reports are available to be sent."

    invoke-virtual {p1, v0}, LI4/g;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crash reports are available to be sent."

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->X()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->e:LL4/f;

    iget-object v1, v1, LL4/f;->a:LL4/e;

    new-instance v2, Lcom/google/firebase/crashlytics/internal/common/q$d;

    invoke-direct {v2, p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q$d;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;Lcom/google/android/gms/tasks/Task;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method Z(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->I()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->E(J)J

    move-result-wide v0

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->A()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo p2, "Tried to write a non-fatal exception while no session was open."

    invoke-virtual {p1, p2}, LI4/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v3, LM4/c;

    invoke-direct {v3, v2, v0, v1, p3}, LM4/c;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    iget-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->m:Lcom/google/firebase/crashlytics/internal/common/f0;

    invoke-virtual {p3, p2, p1, v3}, Lcom/google/firebase/crashlytics/internal/common/f0;->x(Ljava/lang/Throwable;Ljava/lang/Thread;LM4/c;)V

    :cond_1
    return-void
.end method

.method a0(JLjava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->i:LM4/f;

    invoke-virtual {v0, p1, p2, p3}, LM4/f;->g(JLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method r()Z
    .locals 3

    invoke-static {}, LL4/f;->c()V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->c:Lcom/google/firebase/crashlytics/internal/common/B;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/B;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    invoke-interface {v2, v0}, LI4/a;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v2, "Found previous crash marker."

    invoke-virtual {v0, v2}, LI4/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->c:Lcom/google/firebase/crashlytics/internal/common/B;

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/B;->d()Z

    return v1
.end method

.method s(LS4/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->t(ZLS4/j;Z)V

    return-void
.end method

.method w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;LS4/j;)V
    .locals 2

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/q;->o:LS4/j;

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q;->Q(Ljava/lang/String;)V

    new-instance p1, Lcom/google/firebase/crashlytics/internal/common/q$a;

    invoke-direct {p1, p0}, Lcom/google/firebase/crashlytics/internal/common/q$a;-><init>(Lcom/google/firebase/crashlytics/internal/common/q;)V

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/E;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q;->j:LI4/a;

    invoke-direct {v0, p1, p3, p2, v1}, Lcom/google/firebase/crashlytics/internal/common/E;-><init>(Lcom/google/firebase/crashlytics/internal/common/E$a;LS4/j;Ljava/lang/Thread$UncaughtExceptionHandler;LI4/a;)V

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q;->n:Lcom/google/firebase/crashlytics/internal/common/E;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method y(LS4/j;)Z
    .locals 3

    invoke-static {}, LL4/f;->c()V

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v2, "Finalizing previously open sessions."

    invoke-virtual {v0, v2}, LI4/g;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0, p1, v0}, Lcom/google/firebase/crashlytics/internal/common/q;->t(ZLS4/j;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v1, "Closed all previously open sessions."

    invoke-virtual {p1, v1}, LI4/g;->i(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v2, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v2, p1}, LI4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
