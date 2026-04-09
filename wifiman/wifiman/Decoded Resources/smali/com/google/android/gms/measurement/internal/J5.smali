.class public final synthetic Lcom/google/android/gms/measurement/internal/J5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/C5;

.field private synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field private synthetic c:Lcom/google/android/gms/measurement/internal/t7;

.field private synthetic d:Lcom/google/android/gms/measurement/internal/Q6;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/Q6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/J5;->a:Lcom/google/android/gms/measurement/internal/C5;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/J5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/J5;->c:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/J5;->d:Lcom/google/android/gms/measurement/internal/Q6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/J5;->a:Lcom/google/android/gms/measurement/internal/C5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/J5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/J5;->c:Lcom/google/android/gms/measurement/internal/t7;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/J5;->d:Lcom/google/android/gms/measurement/internal/Q6;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/C5;->O(Lcom/google/android/gms/measurement/internal/C5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/t7;Lcom/google/android/gms/measurement/internal/Q6;)V

    return-void
.end method
