.class final Lcom/google/android/gms/common/api/internal/P;
.super Lcom/google/android/gms/common/api/internal/n;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/google/android/gms/common/api/internal/n$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/n$a;[Lr3/d;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/P;->d:Lcom/google/android/gms/common/api/internal/n$a;

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/common/api/internal/n;-><init>([Lr3/d;ZI)V

    return-void
.end method


# virtual methods
.method protected final b(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/P;->d:Lcom/google/android/gms/common/api/internal/n$a;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/n$a;->f(Lcom/google/android/gms/common/api/internal/n$a;)Lcom/google/android/gms/common/api/internal/l;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/common/api/internal/l;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
