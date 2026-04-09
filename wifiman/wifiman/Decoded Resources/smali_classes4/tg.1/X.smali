.class public final Ltg/X;
.super LBg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/X$h;,
        Ltg/X$f;,
        Ltg/X$j;,
        Ltg/X$i;,
        Ltg/X$a;,
        Ltg/X$d;,
        Ltg/X$k;,
        Ltg/X$e;,
        Ltg/X$c;,
        Ltg/X$g;,
        Ltg/X$b;
    }
.end annotation


# static fields
.field static final e:Ltg/X$b;


# instance fields
.field final a:Lgg/v;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ltg/X$b;

.field final d:Lgg/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/X$j;

    invoke-direct {v0}, Ltg/X$j;-><init>()V

    sput-object v0, Ltg/X;->e:Ltg/X$b;

    return-void
.end method

.method private constructor <init>(Lgg/v;Lgg/v;Ljava/util/concurrent/atomic/AtomicReference;Ltg/X$b;)V
    .locals 0

    invoke-direct {p0}, LBg/a;-><init>()V

    iput-object p1, p0, Ltg/X;->d:Lgg/v;

    iput-object p2, p0, Ltg/X;->a:Lgg/v;

    iput-object p3, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ltg/X;->c:Ltg/X$b;

    return-void
.end method

.method public static p1(Lgg/v;IZ)LBg/a;
    .locals 1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Ltg/X;->r1(Lgg/v;)LBg/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ltg/X$f;

    invoke-direct {v0, p1, p2}, Ltg/X$f;-><init>(IZ)V

    invoke-static {p0, v0}, Ltg/X;->q1(Lgg/v;Ltg/X$b;)LBg/a;

    move-result-object p0

    return-object p0
.end method

.method static q1(Lgg/v;Ltg/X$b;)LBg/a;
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Ltg/X$h;

    invoke-direct {v1, v0, p1}, Ltg/X$h;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ltg/X$b;)V

    new-instance v2, Ltg/X;

    invoke-direct {v2, v1, p0, v0, p1}, Ltg/X;-><init>(Lgg/v;Lgg/v;Ljava/util/concurrent/atomic/AtomicReference;Ltg/X$b;)V

    invoke-static {v2}, LEg/a;->m(LBg/a;)LBg/a;

    move-result-object p0

    return-object p0
.end method

.method public static r1(Lgg/v;)LBg/a;
    .locals 1

    sget-object v0, Ltg/X;->e:Ltg/X$b;

    invoke-static {p0, v0}, Ltg/X;->q1(Lgg/v;Ltg/X$b;)LBg/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Ltg/X;->d:Lgg/v;

    invoke-interface {v0, p1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

.method public k1(Lkg/f;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg/X$g;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Ltg/X;->c:Ltg/X$b;

    invoke-interface {v1}, Ltg/X$b;->call()Ltg/X$e;

    move-result-object v1

    new-instance v2, Ltg/X$g;

    iget-object v3, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1, v3}, Ltg/X$g;-><init>(Ltg/X$e;Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v1, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    iget-object v1, v0, Ltg/X$g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Ltg/X$g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    :try_start_0
    invoke-interface {p1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    iget-object p1, p0, Ltg/X;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    if-eqz v1, :cond_5

    iget-object v0, v0, Ltg/X$g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    :cond_5
    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public o1()V
    .locals 3

    iget-object v0, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg/X$g;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ltg/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
