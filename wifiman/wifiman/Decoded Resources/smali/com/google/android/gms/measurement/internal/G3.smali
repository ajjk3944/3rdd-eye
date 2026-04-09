.class public final synthetic Lcom/google/android/gms/measurement/internal/G3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/A3;

.field private synthetic b:Landroid/os/Bundle;

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Lcom/google/android/gms/measurement/internal/t7;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/G3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G3;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/G3;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/G3;->d:Lcom/google/android/gms/measurement/internal/t7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G3;->b:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/G3;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/G3;->d:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/A3;->f(Lcom/google/android/gms/measurement/internal/A3;Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t7;)V

    return-void
.end method
