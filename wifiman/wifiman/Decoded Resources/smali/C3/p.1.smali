.class final LC3/p;
.super LC3/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, LC3/p;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, LC3/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z(LI3/h;)V
    .locals 2

    invoke-virtual {p1}, LI3/h;->e()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    new-instance v1, LI3/g;

    invoke-direct {v1, p1}, LI3/g;-><init>(LI3/h;)V

    iget-object p1, p0, LC3/p;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/common/api/internal/o;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
