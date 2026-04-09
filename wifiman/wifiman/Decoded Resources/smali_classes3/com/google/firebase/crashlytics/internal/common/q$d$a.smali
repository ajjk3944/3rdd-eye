.class Lcom/google/firebase/crashlytics/internal/common/q$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/crashlytics/internal/common/q$d;->a(Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/crashlytics/internal/common/q$d;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/q$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a:Lcom/google/firebase/crashlytics/internal/common/q$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LS4/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, LI4/g;->k(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a:Lcom/google/firebase/crashlytics/internal/common/q$d;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/q;->l(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a:Lcom/google/firebase/crashlytics/internal/common/q$d;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/q;->g(Lcom/google/firebase/crashlytics/internal/common/q;)Lcom/google/firebase/crashlytics/internal/common/f0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a:Lcom/google/firebase/crashlytics/internal/common/q$d;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-static {v1}, Lcom/google/firebase/crashlytics/internal/common/q;->k(Lcom/google/firebase/crashlytics/internal/common/q;)LL4/f;

    move-result-object v1

    iget-object v1, v1, LL4/f;->a:LL4/e;

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/internal/common/f0;->A(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a:Lcom/google/firebase/crashlytics/internal/common/q$d;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/q$d;->b:Lcom/google/firebase/crashlytics/internal/common/q;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/q;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, LS4/d;

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/q$d$a;->a(LS4/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
