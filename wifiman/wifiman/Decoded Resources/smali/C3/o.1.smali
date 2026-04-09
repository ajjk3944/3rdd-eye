.class final synthetic LC3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/l;


# instance fields
.field private final synthetic a:LI3/f;


# direct methods
.method synthetic constructor <init>(LI3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC3/o;->a:LI3/f;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    check-cast p1, LC3/s;

    iget-object v0, p0, LC3/o;->a:LI3/f;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "locationSettingsRequest can\'t be null"

    invoke-static {v1, v2}, Ls3/p;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LC3/L;

    new-instance v1, LC3/p;

    invoke-direct {v1, p2}, LC3/p;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    const/4 p2, 0x0

    invoke-interface {p1, v0, v1, p2}, LC3/L;->S(LI3/f;LC3/c;Ljava/lang/String;)V

    return-void
.end method
