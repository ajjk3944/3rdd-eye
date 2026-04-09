.class public final Lv4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lv4/i;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv4/i;

    invoke-direct {v0}, Lv4/i;-><init>()V

    sput-object v0, Lv4/i;->b:Lv4/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lv4/r$b;

    invoke-direct {v1}, Lv4/r$b;-><init>()V

    invoke-virtual {v1}, Lv4/r$b;->e()Lv4/r;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()Lv4/i;
    .locals 1

    sget-object v0, Lv4/i;->b:Lv4/i;

    return-object v0
.end method


# virtual methods
.method public b(Lv4/q;)Z
    .locals 1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/r;

    invoke-virtual {v0, p1}, Lv4/r;->e(Lv4/q;)Z

    move-result p1

    return p1
.end method

.method public c(Lv4/q;Lo4/y;)Lo4/g;
    .locals 1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/r;

    invoke-virtual {v0, p1, p2}, Lv4/r;->f(Lv4/q;Lo4/y;)Lo4/g;

    move-result-object p1

    return-object p1
.end method

.method public d(Lv4/o;Lo4/y;)Lo4/g;
    .locals 1

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lv4/i;->b(Lv4/q;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lv4/e;

    invoke-direct {v0, p1, p2}, Lv4/e;-><init>(Lv4/o;Lo4/y;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/crypto/tink/internal/TinkBugException;

    const-string v0, "Creating a LegacyProtoKey failed"

    invoke-direct {p2, v0, p1}, Lcom/google/crypto/tink/internal/TinkBugException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lv4/i;->c(Lv4/q;Lo4/y;)Lo4/g;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "access cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized e(Lv4/b;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/r$b;

    iget-object v1, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/r;

    invoke-direct {v0, v1}, Lv4/r$b;-><init>(Lv4/r;)V

    invoke-virtual {v0, p1}, Lv4/r$b;->f(Lv4/b;)Lv4/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/r$b;->e()Lv4/r;

    move-result-object p1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized f(Lv4/c;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/r$b;

    iget-object v1, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/r;

    invoke-direct {v0, v1}, Lv4/r$b;-><init>(Lv4/r;)V

    invoke-virtual {v0, p1}, Lv4/r$b;->g(Lv4/c;)Lv4/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/r$b;->e()Lv4/r;

    move-result-object p1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized g(Lv4/j;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/r$b;

    iget-object v1, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/r;

    invoke-direct {v0, v1}, Lv4/r$b;-><init>(Lv4/r;)V

    invoke-virtual {v0, p1}, Lv4/r$b;->h(Lv4/j;)Lv4/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/r$b;->e()Lv4/r;

    move-result-object p1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized h(Lv4/k;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/r$b;

    iget-object v1, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/r;

    invoke-direct {v0, v1}, Lv4/r$b;-><init>(Lv4/r;)V

    invoke-virtual {v0, p1}, Lv4/r$b;->i(Lv4/k;)Lv4/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/r$b;->e()Lv4/r;

    move-result-object p1

    iget-object v0, p0, Lv4/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
