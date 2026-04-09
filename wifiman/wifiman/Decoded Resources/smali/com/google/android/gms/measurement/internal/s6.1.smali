.class public final synthetic Lcom/google/android/gms/measurement/internal/s6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/q6;

.field private synthetic b:I

.field private synthetic c:Lcom/google/android/gms/measurement/internal/L2;

.field private synthetic d:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/q6;ILcom/google/android/gms/measurement/internal/L2;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/s6;->a:Lcom/google/android/gms/measurement/internal/q6;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/s6;->b:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/s6;->c:Lcom/google/android/gms/measurement/internal/L2;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/s6;->d:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/s6;->a:Lcom/google/android/gms/measurement/internal/q6;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/s6;->b:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/s6;->c:Lcom/google/android/gms/measurement/internal/L2;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/s6;->d:Landroid/content/Intent;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/q6;->d(Lcom/google/android/gms/measurement/internal/q6;ILcom/google/android/gms/measurement/internal/L2;Landroid/content/Intent;)V

    return-void
.end method
