.class final Lcom/google/android/gms/common/api/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/c$e;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/internal/z;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/y;->a:Lcom/google/android/gms/common/api/internal/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->a:Lcom/google/android/gms/common/api/internal/z;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/z;->p:Lcom/google/android/gms/common/api/internal/e;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/e;->n(Lcom/google/android/gms/common/api/internal/e;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/internal/x;

    invoke-direct {v1, p0}, Lcom/google/android/gms/common/api/internal/x;-><init>(Lcom/google/android/gms/common/api/internal/y;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
