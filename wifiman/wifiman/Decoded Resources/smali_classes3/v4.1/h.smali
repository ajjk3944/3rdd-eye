.class public final Lv4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lv4/h;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv4/h;

    invoke-direct {v0}, Lv4/h;-><init>()V

    sput-object v0, Lv4/h;->b:Lv4/h;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lv4/n$b;

    invoke-direct {v1}, Lv4/n$b;-><init>()V

    invoke-virtual {v1}, Lv4/n$b;->c()Lv4/n;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static c()Lv4/h;
    .locals 1

    sget-object v0, Lv4/h;->b:Lv4/h;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/n;

    invoke-virtual {v0, p1}, Lv4/n;->c(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public b(Lo4/g;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/n;

    invoke-virtual {v0, p1, p2}, Lv4/n;->d(Lo4/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized d(Lv4/l;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/n$b;

    iget-object v1, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/n;

    invoke-direct {v0, v1}, Lv4/n$b;-><init>(Lv4/n;)V

    invoke-virtual {v0, p1}, Lv4/n$b;->d(Lv4/l;)Lv4/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/n$b;->c()Lv4/n;

    move-result-object p1

    iget-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public declared-synchronized e(Lo4/w;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lv4/n$b;

    iget-object v1, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv4/n;

    invoke-direct {v0, v1}, Lv4/n$b;-><init>(Lv4/n;)V

    invoke-virtual {v0, p1}, Lv4/n$b;->e(Lo4/w;)Lv4/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lv4/n$b;->c()Lv4/n;

    move-result-object p1

    iget-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public f(Lo4/v;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv4/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/n;

    invoke-virtual {v0, p1, p2}, Lv4/n;->e(Lo4/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
