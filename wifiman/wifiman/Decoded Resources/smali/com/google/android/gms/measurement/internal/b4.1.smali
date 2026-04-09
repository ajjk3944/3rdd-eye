.class final Lcom/google/android/gms/measurement/internal/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic b:Landroid/os/Bundle;

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/A3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b4;->a:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/b4;->b:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b4;->c:Lcom/google/android/gms/measurement/internal/A3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b4;->c:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d7;->K0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b4;->c:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b4;->a:Lcom/google/android/gms/measurement/internal/t7;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b4;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/d7;->n(Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
