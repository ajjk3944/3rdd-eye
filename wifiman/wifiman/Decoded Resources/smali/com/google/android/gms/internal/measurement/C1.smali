.class final Lcom/google/android/gms/internal/measurement/C1;
.super Lcom/google/android/gms/internal/measurement/i1$a;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/internal/measurement/Q0;

.field private final synthetic f:Lcom/google/android/gms/internal/measurement/i1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/i1;Lcom/google/android/gms/internal/measurement/Q0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/C1;->e:Lcom/google/android/gms/internal/measurement/Q0;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/C1;->f:Lcom/google/android/gms/internal/measurement/i1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/i1$a;-><init>(Lcom/google/android/gms/internal/measurement/i1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/C1;->f:Lcom/google/android/gms/internal/measurement/i1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/i1;->d(Lcom/google/android/gms/internal/measurement/i1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/C1;->e:Lcom/google/android/gms/internal/measurement/Q0;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/P0;->getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/U0;)V

    return-void
.end method

.method protected final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/C1;->e:Lcom/google/android/gms/internal/measurement/Q0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/Q0;->a(Landroid/os/Bundle;)V

    return-void
.end method
