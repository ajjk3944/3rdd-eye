.class final Lj4/k;
.super Lj4/j;
.source "SourceFile"


# direct methods
.method constructor <init>(Lj4/l;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V
    .locals 1

    new-instance p3, Lk4/i;

    const-string/jumbo v0, "OnRequestInstallCallback"

    invoke-direct {p3, v0}, Lk4/i;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2}, Lj4/j;-><init>(Lj4/l;Lk4/i;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final U(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lj4/j;->U(Landroid/os/Bundle;)V

    const-string/jumbo v0, "confirmation_intent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    const-string/jumbo v1, "is_review_no_op"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    new-instance v1, Lj4/d;

    invoke-direct {v1, v0, p1}, Lj4/d;-><init>(Landroid/app/PendingIntent;Z)V

    iget-object p1, p0, Lj4/j;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method
