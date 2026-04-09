.class final LT/h$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/h;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/h;

.field final synthetic b:LT/h$a;


# direct methods
.method constructor <init>(LT/h;LT/h$a;)V
    .locals 0

    iput-object p1, p0, LT/h$b;->a:LT/h;

    iput-object p2, p0, LT/h$b;->b:LT/h$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, LT/h$b;->a:LT/h;

    invoke-static {p1}, LT/h;->f(LT/h;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LT/h$b;->a:LT/h;

    iget-object v1, p0, LT/h$b;->b:LT/h$a;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, LT/h;->c(LT/h;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {v0}, LT/h;->c(LT/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LT/h;->e(LT/h;)LT/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LT/h$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
