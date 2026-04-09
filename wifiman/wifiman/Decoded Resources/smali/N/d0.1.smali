.class public final LN/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/d0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:LTi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LN/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v0

    iput-object v0, p0, LN/d0;->b:LTi/a;

    return-void
.end method

.method public static final synthetic a(LN/d0;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LN/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic b(LN/d0;)LTi/a;
    .locals 0

    iget-object p0, p0, LN/d0;->b:LTi/a;

    return-object p0
.end method

.method public static final synthetic c(LN/d0;LN/d0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LN/d0;->f(LN/d0$a;)V

    return-void
.end method

.method private final f(LN/d0$a;)V
    .locals 2

    :cond_0
    iget-object v0, p0, LN/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/d0$a;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, LN/d0$a;->a(LN/d0$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Current mutation had a higher priority"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget-object v1, p0, LN/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, p1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LN/d0$a;->b()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final d(Ls/L;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LN/d0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, LN/d0$b;-><init>(Ls/L;LN/d0;Lmh/l;Ldh/e;)V

    invoke-static {v0, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lmh/a;)Z
    .locals 3

    iget-object v0, p0, LN/d0;->b:LTi/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LTi/a$a;->b(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LN/d0;->b:LTi/a;

    invoke-static {p1, v1, v2, v1}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LN/d0;->b:LTi/a;

    invoke-static {v0, v1, v2, v1}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    throw p1

    :cond_0
    :goto_0
    return v0
.end method
