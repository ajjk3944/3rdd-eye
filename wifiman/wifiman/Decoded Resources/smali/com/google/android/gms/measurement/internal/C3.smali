.class public final synthetic Lcom/google/android/gms/measurement/internal/C3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/A3;

.field private synthetic b:Lcom/google/android/gms/measurement/internal/t7;

.field private synthetic c:Landroid/os/Bundle;

.field private synthetic d:Lcom/google/android/gms/measurement/internal/t2;

.field private synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/t2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/C3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/C3;->b:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/C3;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/C3;->d:Lcom/google/android/gms/measurement/internal/t2;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/C3;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/C3;->b:Lcom/google/android/gms/measurement/internal/t7;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/C3;->c:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/C3;->d:Lcom/google/android/gms/measurement/internal/t2;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/C3;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/A3;->o0(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/t2;Ljava/lang/String;)V

    return-void
.end method
