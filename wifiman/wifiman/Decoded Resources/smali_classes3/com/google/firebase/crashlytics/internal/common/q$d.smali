.class Lcom/google/firebase/crashlytics/internal/common/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/crashlytics/internal/common/q;->W(Lcom/google/android/gms/tasks/Task;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/Task;

.field final synthetic b:Lcom/google/firebase/crashlytics/internal/common/q;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/q;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->a:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v0, "Deleting cached crash reports..."

    invoke-virtual {p1, v0}, LI4/g;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/q;->L()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/q;->m(Ljava/util/List;)V

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/q;->g(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/f0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/f0;->z()V

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/q;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "Sending cached crash reports..."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/q;->j(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/G;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/internal/common/G;->c(Z)V

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->a:Lcom/google/android/gms/tasks/Task;

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/q;->k(Lcom/google/firebase/crashlytics/internal/common/q;)LL4/f;

    move-result-object v0

    iget-object v0, v0, LL4/f;->a:LL4/e;

    new-instance v1, Lcom/google/firebase/crashlytics/internal/common/q$d$a;

    invoke-direct {v1, p0}, Lcom/google/firebase/crashlytics/internal/common/q$d$a;-><init>(Lcom/google/firebase/crashlytics/internal/common/q$d;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q$d;->a(Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
