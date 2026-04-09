.class public final synthetic Lcom/google/android/gms/measurement/internal/H5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/C5;

.field private synthetic b:Lcom/google/android/gms/measurement/internal/t7;

.field private synthetic c:Lcom/google/android/gms/measurement/internal/h;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/H5;->a:Lcom/google/android/gms/measurement/internal/C5;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/H5;->b:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/H5;->c:Lcom/google/android/gms/measurement/internal/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H5;->a:Lcom/google/android/gms/measurement/internal/C5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H5;->b:Lcom/google/android/gms/measurement/internal/t7;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/H5;->c:Lcom/google/android/gms/measurement/internal/h;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/C5;->M(Lcom/google/android/gms/measurement/internal/C5;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/h;)V

    return-void
.end method
