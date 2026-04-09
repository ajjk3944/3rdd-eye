.class public abstract Lcom/google/common/util/concurrent/b;
.super Lcom/google/common/util/concurrent/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/util/concurrent/b$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/google/common/util/concurrent/d;Lcom/google/common/util/concurrent/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-static {p1}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/common/util/concurrent/b$a;

    invoke-direct {v0, p0, p1}, Lcom/google/common/util/concurrent/b$a;-><init>(Ljava/util/concurrent/Future;Lcom/google/common/util/concurrent/a;)V

    invoke-interface {p0, v0, p2}, Lcom/google/common/util/concurrent/d;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string/jumbo v1, "Future was expected to be done: %s"

    invoke-static {v0, v1, p0}, Lm4/h;->p(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/common/util/concurrent/e;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
