.class LS4/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS4/g;->p(LS4/e;LL4/f;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LL4/f;

.field final synthetic b:LS4/g;


# direct methods
.method constructor <init>(LS4/g;LL4/f;)V
    .locals 0

    iput-object p1, p0, LS4/g$a;->b:LS4/g;

    iput-object p2, p0, LS4/g$a;->a:LL4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LS4/g$a;)Lorg/json/JSONObject;
    .locals 0

    invoke-direct {p0}, LS4/g$a;->b()Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private synthetic b()Lorg/json/JSONObject;
    .locals 3

    iget-object v0, p0, LS4/g$a;->b:LS4/g;

    invoke-static {v0}, LS4/g;->j(LS4/g;)LS4/l;

    move-result-object v0

    iget-object v1, p0, LS4/g$a;->b:LS4/g;

    invoke-static {v1}, LS4/g;->f(LS4/g;)LS4/k;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, LS4/l;->a(LS4/k;Z)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/Void;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    iget-object p1, p0, LS4/g$a;->a:LL4/f;

    iget-object p1, p1, LL4/f;->d:LL4/e;

    invoke-virtual {p1}, LL4/e;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, LS4/f;

    invoke-direct {v0, p0}, LS4/f;-><init>(LS4/g$a;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    iget-object v0, p0, LS4/g$a;->b:LS4/g;

    invoke-static {v0}, LS4/g;->c(LS4/g;)LS4/h;

    move-result-object v0

    invoke-virtual {v0, p1}, LS4/h;->b(Lorg/json/JSONObject;)LS4/d;

    move-result-object v0

    iget-object v1, p0, LS4/g$a;->b:LS4/g;

    invoke-static {v1}, LS4/g;->d(LS4/g;)LS4/a;

    move-result-object v1

    iget-wide v2, v0, LS4/d;->c:J

    invoke-virtual {v1, v2, v3, p1}, LS4/a;->c(JLorg/json/JSONObject;)V

    iget-object v1, p0, LS4/g$a;->b:LS4/g;

    const-string/jumbo v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, LS4/g;->e(LS4/g;Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p1, p0, LS4/g$a;->b:LS4/g;

    invoke-static {p1}, LS4/g;->f(LS4/g;)LS4/k;

    move-result-object v1

    iget-object v1, v1, LS4/k;->f:Ljava/lang/String;

    invoke-static {p1, v1}, LS4/g;->g(LS4/g;Ljava/lang/String;)Z

    iget-object p1, p0, LS4/g$a;->b:LS4/g;

    invoke-static {p1}, LS4/g;->h(LS4/g;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, LS4/g$a;->b:LS4/g;

    invoke-static {p1}, LS4/g;->i(LS4/g;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LS4/g$a;->c(Ljava/lang/Void;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
