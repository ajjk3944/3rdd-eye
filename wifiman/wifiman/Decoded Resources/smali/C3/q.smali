.class final LC3/q;
.super LC3/O;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, LC3/q;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, LC3/O;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(Lcom/google/android/gms/common/api/Status;Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, LC3/q;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/common/api/internal/o;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
