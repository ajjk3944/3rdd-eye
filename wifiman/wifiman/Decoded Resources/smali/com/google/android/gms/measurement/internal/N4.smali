.class final Lcom/google/android/gms/measurement/internal/N4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/N4;->a:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/N4;->a:Lcom/google/android/gms/measurement/internal/r4;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/r4;->r:Lcom/google/android/gms/measurement/internal/D7;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/D7;->a()V

    return-void
.end method
