.class public final synthetic Lu3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/l;


# instance fields
.field public final synthetic a:Ls3/t;


# direct methods
.method public synthetic constructor <init>(Ls3/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/b;->a:Ls3/t;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lu3/e;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget v0, Lu3/d;->n:I

    invoke-virtual {p1}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lu3/a;

    iget-object v0, p0, Lu3/b;->a:Ls3/t;

    invoke-virtual {p1, v0}, Lu3/a;->n0(Ls3/t;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method
