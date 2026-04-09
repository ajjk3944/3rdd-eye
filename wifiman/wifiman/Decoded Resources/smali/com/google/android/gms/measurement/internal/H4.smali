.class final Lcom/google/android/gms/measurement/internal/H4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/common/util/concurrent/a;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/K6;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;Lcom/google/android/gms/measurement/internal/K6;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/H4;->a:Lcom/google/android/gms/measurement/internal/K6;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->H()Landroid/util/SparseArray;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->a:Lcom/google/android/gms/measurement/internal/K6;

    iget v2, v1, Lcom/google/android/gms/measurement/internal/K6;->c:I

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/K6;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v1

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    new-array v2, v2, [I

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    new-array v3, v3, [J

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    aput v5, v2, v4

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    aput-wide v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v4, "uriSources"

    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v2, "uriTimestamps"

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/X2;->p:Lcom/google/android/gms/measurement/internal/Z2;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/Z2;->b(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->b0(Lcom/google/android/gms/measurement/internal/r4;Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->Z0:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {v0, p1}, Lcom/google/android/gms/measurement/internal/r4;->z(Lcom/google/android/gms/measurement/internal/r4;Ljava/lang/Throwable;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "registerTriggerAsync failed. Dropping URI. App ID, Throwable"

    invoke-virtual {v0, v3, v1, p1}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/H4;->b()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {p1, v2}, Lcom/google/android/gms/measurement/internal/r4;->R(Lcom/google/android/gms/measurement/internal/r4;I)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->I0()V

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r4;->A0()Ljava/util/PriorityQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->a:Lcom/google/android/gms/measurement/internal/K6;

    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/r4;->y(Lcom/google/android/gms/measurement/internal/r4;)I

    move-result v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->v0:Lcom/google/android/gms/measurement/internal/q2;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/q2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/r4;->R(Lcom/google/android/gms/measurement/internal/r4;I)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "registerTriggerAsync failed. May try later. App ID, throwable"

    invoke-virtual {v0, v2, v1, p1}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/r4;->y(Lcom/google/android/gms/measurement/internal/r4;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    invoke-virtual {v0, v4, v1, v3, p1}, Lcom/google/android/gms/measurement/internal/N2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/r4;->y(Lcom/google/android/gms/measurement/internal/r4;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/r4;->R0(Lcom/google/android/gms/measurement/internal/r4;I)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/r4;->y(Lcom/google/android/gms/measurement/internal/r4;)I

    move-result v0

    shl-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/r4;->R(Lcom/google/android/gms/measurement/internal/r4;I)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"

    invoke-virtual {v0, v3, v1, p1}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-static {p1, v2}, Lcom/google/android/gms/measurement/internal/r4;->R(Lcom/google/android/gms/measurement/internal/r4;I)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->A0()Ljava/util/PriorityQueue;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->a:Lcom/google/android/gms/measurement/internal/K6;

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/H4;->b()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/r4;->b0(Lcom/google/android/gms/measurement/internal/r4;Z)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/measurement/internal/r4;->R(Lcom/google/android/gms/measurement/internal/r4;I)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H4;->a:Lcom/google/android/gms/measurement/internal/K6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/K6;->a:Ljava/lang/String;

    const-string v1, "Successfully registered trigger URI"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/H4;->b:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->I0()V

    return-void
.end method
