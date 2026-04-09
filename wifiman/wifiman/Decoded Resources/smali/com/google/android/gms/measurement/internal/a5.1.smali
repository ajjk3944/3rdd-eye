.class final Lcom/google/android/gms/measurement/internal/a5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/w7;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a5;->a:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "auto"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a5;->a:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {v0, v1, p2, p3, p1}, Lcom/google/android/gms/measurement/internal/r4;->k0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a5;->a:Lcom/google/android/gms/measurement/internal/r4;

    invoke-virtual {p1, v1, p2, p3}, Lcom/google/android/gms/measurement/internal/r4;->W0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
