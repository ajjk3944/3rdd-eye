.class public final Lqg/g0;
.super Ljg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/g0$b;,
        Lqg/g0$g;,
        Lqg/g0$f;,
        Lqg/g0$i;,
        Lqg/g0$a;,
        Lqg/g0$d;,
        Lqg/g0$j;,
        Lqg/g0$e;,
        Lqg/g0$c;,
        Lqg/g0$h;
    }
.end annotation


# static fields
.field static final f:Lkg/q;


# instance fields
.field final b:Lgg/i;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;

.field final d:Lkg/q;

.field final e:LDj/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqg/g0$b;

    invoke-direct {v0}, Lqg/g0$b;-><init>()V

    sput-object v0, Lqg/g0;->f:Lkg/q;

    return-void
.end method

.method private constructor <init>(LDj/a;Lgg/i;Ljava/util/concurrent/atomic/AtomicReference;Lkg/q;)V
    .locals 0

    invoke-direct {p0}, Ljg/a;-><init>()V

    iput-object p1, p0, Lqg/g0;->e:LDj/a;

    iput-object p2, p0, Lqg/g0;->b:Lgg/i;

    iput-object p3, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lqg/g0;->d:Lkg/q;

    return-void
.end method

.method public static m2(Lgg/i;IZ)Ljg/a;
    .locals 1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Lqg/g0;->o2(Lgg/i;)Ljg/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lqg/g0$f;

    invoke-direct {v0, p1, p2}, Lqg/g0$f;-><init>(IZ)V

    invoke-static {p0, v0}, Lqg/g0;->n2(Lgg/i;Lkg/q;)Ljg/a;

    move-result-object p0

    return-object p0
.end method

.method static n2(Lgg/i;Lkg/q;)Ljg/a;
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Lqg/g0$g;

    invoke-direct {v1, v0, p1}, Lqg/g0$g;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lkg/q;)V

    new-instance v2, Lqg/g0;

    invoke-direct {v2, v1, p0, v0, p1}, Lqg/g0;-><init>(LDj/a;Lgg/i;Ljava/util/concurrent/atomic/AtomicReference;Lkg/q;)V

    invoke-static {v2}, LEg/a;->s(Ljg/a;)Ljg/a;

    move-result-object p0

    return-object p0
.end method

.method public static o2(Lgg/i;)Ljg/a;
    .locals 1

    sget-object v0, Lqg/g0;->f:Lkg/q;

    invoke-static {p0, v0}, Lqg/g0;->n2(Lgg/i;Lkg/q;)Ljg/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 1

    iget-object v0, p0, Lqg/g0;->e:LDj/a;

    invoke-interface {v0, p1}, LDj/a;->b(LDj/b;)V

    return-void
.end method

.method public h2(Lkg/f;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg/g0$h;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    :try_start_0
    iget-object v1, p0, Lqg/g0;->d:Lkg/q;

    invoke-interface {v1}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqg/g0$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    new-instance v2, Lqg/g0$h;

    iget-object v3, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1, v3}, Lqg/g0$h;-><init>(Lqg/g0$e;Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v1, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    iget-object v1, v0, Lqg/g0$h;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Lqg/g0$h;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    :try_start_1
    invoke-interface {p1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_4

    iget-object p1, p0, Lqg/g0;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    if-eqz v1, :cond_5

    iget-object v0, v0, Lqg/g0$h;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    :cond_5
    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public l2()V
    .locals 3

    iget-object v0, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg/g0$h;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqg/g0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
