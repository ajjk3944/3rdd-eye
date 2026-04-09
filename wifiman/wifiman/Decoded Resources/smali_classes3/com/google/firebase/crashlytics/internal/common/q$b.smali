.class Lcom/google/firebase/crashlytics/internal/common/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/crashlytics/internal/common/q;->H(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:LS4/j;

.field final synthetic e:Z

.field final synthetic f:Lcom/google/firebase/crashlytics/internal/common/q;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/q;JLjava/lang/Throwable;Ljava/lang/Thread;LS4/j;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    iput-wide p2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->a:J

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->d:LS4/j;

    iput-boolean p7, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 8

    iget-wide v0, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->a:J

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/q;->c(J)J

    move-result-wide v6

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/q;->d(Lcom/google/firebase/crashlytics/internal/common/q;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, LI4/g;->d(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/q;->f(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/B;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/B;->a()Z

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/q;->g(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/f0;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lcom/google/firebase/crashlytics/internal/common/f0;->w(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    iget-wide v3, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->a:J

    invoke-static {v2, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/q;->h(Lcom/google/firebase/crashlytics/internal/common/q;J)V

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->d:LS4/j;

    invoke-virtual {v2, v3}, Lcom/google/firebase/crashlytics/internal/common/q;->s(LS4/j;)V

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    new-instance v3, Lcom/google/firebase/crashlytics/internal/common/h;

    invoke-direct {v3}, Lcom/google/firebase/crashlytics/internal/common/h;-><init>()V

    invoke-virtual {v3}, Lcom/google/firebase/crashlytics/internal/common/h;->c()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->e:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/q;->i(Lcom/google/firebase/crashlytics/internal/common/q;Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/q;->j(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/G;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/G;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->d:LS4/j;

    invoke-interface {v1}, LS4/j;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/q$b;->f:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/q;->k(Lcom/google/firebase/crashlytics/internal/common/q;)LL4/f;

    move-result-object v2

    iget-object v2, v2, LL4/f;->a:LL4/e;

    new-instance v3, Lcom/google/firebase/crashlytics/internal/common/q$b$a;

    invoke-direct {v3, p0, v0}, Lcom/google/firebase/crashlytics/internal/common/q$b$a;-><init>(Lcom/google/firebase/crashlytics/internal/common/q$b;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/crashlytics/internal/common/q$b;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
