.class final Lcom/google/android/gms/oss/licenses/h;
.super Lcom/google/android/gms/common/api/internal/n;
.source "SourceFile"


# instance fields
.field final synthetic d:LG3/e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/oss/licenses/j;LG3/e;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/oss/licenses/h;->d:LG3/e;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/n;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic b(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    check-cast p1, LK3/g;

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/h;->d:LG3/e;

    invoke-virtual {p1, v0}, LK3/g;->j0(LG3/e;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method
