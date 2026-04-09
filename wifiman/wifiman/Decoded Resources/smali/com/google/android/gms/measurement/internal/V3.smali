.class final Lcom/google/android/gms/measurement/internal/V3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/A3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/V3;->a:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/V3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/V3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d7;->K0()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/o;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/V3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/V3;->a:Lcom/google/android/gms/measurement/internal/t7;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/t7;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/d7;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/o;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method
