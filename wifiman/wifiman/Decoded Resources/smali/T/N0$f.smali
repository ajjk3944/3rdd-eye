.class final LT/N0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0;-><init>(Ldh/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/N0;


# direct methods
.method constructor <init>(LT/N0;)V
    .locals 0

    iput-object p1, p0, LT/N0$f;->a:LT/N0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "Recomposer effect job completed"

    invoke-static {v0, p1}, LIi/n0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    iget-object v1, p0, LT/N0$f;->a:LT/N0;

    invoke-static {v1}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LT/N0$f;->a:LT/N0;

    monitor-enter v1

    :try_start_0
    invoke-static {v2}, LT/N0;->D(LT/N0;)LIi/y0;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-static {v2}, LT/N0;->J(LT/N0;)LLi/z;

    move-result-object v5

    sget-object v6, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-interface {v5, v6}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-static {v2}, LT/N0;->K(LT/N0;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3, v0}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    invoke-static {v2}, LT/N0;->H(LT/N0;)LIi/n;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v2}, LT/N0;->H(LT/N0;)LIi/n;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v4

    :goto_1
    invoke-static {v2, v4}, LT/N0;->U(LT/N0;LIi/n;)V

    new-instance v4, LT/N0$f$a;

    invoke-direct {v4, v2, p1}, LT/N0$f$a;-><init>(LT/N0;Ljava/lang/Throwable;)V

    invoke-interface {v3, v4}, LIi/y0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    move-object v4, v0

    goto :goto_2

    :cond_2
    invoke-static {v2, v0}, LT/N0;->R(LT/N0;Ljava/lang/Throwable;)V

    invoke-static {v2}, LT/N0;->J(LT/N0;)LLi/z;

    move-result-object p1

    sget-object v0, LT/N0$d;->ShutDown:LT/N0$d;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v1

    if-eqz v4, :cond_3

    sget-object p1, LYg/u;->b:LYg/u$a;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void

    :goto_3
    monitor-exit v1

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LT/N0$f;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
