.class final Lcom/google/android/gms/internal/measurement/n1;
.super Lcom/google/android/gms/internal/measurement/i1$a;
.source "SourceFile"


# instance fields
.field private final synthetic e:Landroid/os/Bundle;

.field private final synthetic f:Lcom/google/android/gms/internal/measurement/i1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/i1;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/n1;->e:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n1;->f:Lcom/google/android/gms/internal/measurement/i1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/i1$a;-><init>(Lcom/google/android/gms/internal/measurement/i1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n1;->f:Lcom/google/android/gms/internal/measurement/i1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/i1;->d(Lcom/google/android/gms/internal/measurement/i1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/n1;->e:Landroid/os/Bundle;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/i1$a;->a:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->setConditionalUserProperty(Landroid/os/Bundle;J)V

    return-void
.end method
