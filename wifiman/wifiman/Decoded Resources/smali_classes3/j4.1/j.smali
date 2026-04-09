.class abstract Lj4/j;
.super Lk4/g;
.source "SourceFile"


# instance fields
.field final a:Lk4/i;

.field final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lj4/l;


# direct methods
.method constructor <init>(Lj4/l;Lk4/i;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lj4/j;->c:Lj4/l;

    invoke-direct {p0}, Lk4/g;-><init>()V

    iput-object p2, p0, Lj4/j;->a:Lk4/i;

    iput-object p3, p0, Lj4/j;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public U(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lj4/j;->c:Lj4/l;

    iget-object p1, p1, Lj4/l;->a:Lk4/t;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj4/j;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lk4/t;->u(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    :cond_0
    iget-object p1, p0, Lj4/j;->a:Lk4/i;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, Lk4/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
