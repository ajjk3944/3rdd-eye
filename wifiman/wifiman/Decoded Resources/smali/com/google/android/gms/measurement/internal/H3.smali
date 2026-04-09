.class final Lcom/google/android/gms/measurement/internal/H3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/t7;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/A3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/t7;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/H3;->a:Lcom/google/android/gms/measurement/internal/t7;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/H3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d7;->K0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/H3;->b:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->c(Lcom/google/android/gms/measurement/internal/A3;)Lcom/google/android/gms/measurement/internal/d7;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/H3;->a:Lcom/google/android/gms/measurement/internal/t7;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/d7;->r0(Lcom/google/android/gms/measurement/internal/t7;)V

    return-void
.end method
