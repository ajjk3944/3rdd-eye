.class final Lcom/google/android/gms/measurement/internal/k6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lr3/b;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/h6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/h6;Lr3/b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/k6;->a:Lr3/b;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/k6;->b:Lcom/google/android/gms/measurement/internal/h6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k6;->b:Lcom/google/android/gms/measurement/internal/h6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/h6;->c:Lcom/google/android/gms/measurement/internal/C5;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/C5;->L(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/s2;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k6;->b:Lcom/google/android/gms/measurement/internal/h6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/h6;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->p1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k6;->a:Lr3/b;

    invoke-virtual {v0}, Lr3/b;->b()I

    move-result v0

    const/16 v1, 0x1e61

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k6;->b:Lcom/google/android/gms/measurement/internal/h6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/h6;->c:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->s0(Lcom/google/android/gms/measurement/internal/C5;)V

    return-void
.end method
