.class final Lqg/g0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:Lkg/q;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lkg/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/g0$g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lqg/g0$g;->b:Lkg/q;

    return-void
.end method


# virtual methods
.method public b(LDj/b;)V
    .locals 3

    :goto_0
    iget-object v0, p0, Lqg/g0$g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$h;

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lqg/g0$g;->b:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lqg/g0$h;

    iget-object v2, p0, Lqg/g0$g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v0, v2}, Lqg/g0$h;-><init>(Lqg/g0$e;Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v0, p0, Lqg/g0$g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void

    :cond_1
    :goto_1
    new-instance v1, Lqg/g0$c;

    invoke-direct {v1, v0, p1}, Lqg/g0$c;-><init>(Lqg/g0$h;LDj/b;)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0, v1}, Lqg/g0$h;->c(Lqg/g0$c;)Z

    invoke-virtual {v1}, Lqg/g0$c;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Lqg/g0$h;->g(Lqg/g0$c;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lqg/g0$h;->d()V

    iget-object p1, v0, Lqg/g0$h;->a:Lqg/g0$e;

    invoke-interface {p1, v1}, Lqg/g0$e;->S(Lqg/g0$c;)V

    return-void
.end method
