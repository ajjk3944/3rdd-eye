.class final Lcom/google/android/gms/common/api/internal/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/internal/O;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/O;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/L;->a:Lcom/google/android/gms/common/api/internal/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/L;->a:Lcom/google/android/gms/common/api/internal/O;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/O;->o0(Lcom/google/android/gms/common/api/internal/O;)Lcom/google/android/gms/common/api/internal/N;

    move-result-object v0

    new-instance v1, Lr3/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lr3/b;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/N;->b(Lr3/b;)V

    return-void
.end method
