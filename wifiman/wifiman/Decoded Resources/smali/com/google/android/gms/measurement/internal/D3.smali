.class public final synthetic Lcom/google/android/gms/measurement/internal/D3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/A3;

.field private synthetic b:Lcom/google/android/gms/measurement/internal/t7;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/D3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/D3;->b:Lcom/google/android/gms/measurement/internal/t7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/D3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/D3;->b:Lcom/google/android/gms/measurement/internal/t7;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/A3;->u0(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;)V

    return-void
.end method
