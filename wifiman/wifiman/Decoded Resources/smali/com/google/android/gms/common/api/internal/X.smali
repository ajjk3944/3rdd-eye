.class final Lcom/google/android/gms/common/api/internal/X;
.super Lcom/google/android/gms/common/api/internal/F;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/Y;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/Y;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/X;->b:Lcom/google/android/gms/common/api/internal/Y;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/X;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/F;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/X;->b:Lcom/google/android/gms/common/api/internal/Y;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/Y;->b:Lcom/google/android/gms/common/api/internal/Z;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/Z;->g(Lcom/google/android/gms/common/api/internal/Z;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/X;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/X;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
