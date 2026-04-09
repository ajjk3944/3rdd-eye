.class final Lcom/google/android/gms/measurement/internal/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/o4;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/v3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v3;Lcom/google/android/gms/measurement/internal/o4;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/x3;->a:Lcom/google/android/gms/measurement/internal/o4;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x3;->b:Lcom/google/android/gms/measurement/internal/v3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x3;->b:Lcom/google/android/gms/measurement/internal/v3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/x3;->a:Lcom/google/android/gms/measurement/internal/o4;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/v3;->e(Lcom/google/android/gms/measurement/internal/v3;Lcom/google/android/gms/measurement/internal/o4;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x3;->b:Lcom/google/android/gms/measurement/internal/v3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/x3;->a:Lcom/google/android/gms/measurement/internal/o4;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/o4;->g:Lcom/google/android/gms/internal/measurement/d1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/v3;->b(Lcom/google/android/gms/internal/measurement/d1;)V

    return-void
.end method
