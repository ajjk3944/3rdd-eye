.class public final Lcom/google/android/gms/internal/measurement/A2$a;
.super Lcom/google/android/gms/internal/measurement/D4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/A2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A2;->K()Lcom/google/android/gms/internal/measurement/A2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/D4$b;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/O2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/A2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final u(I)Lcom/google/android/gms/internal/measurement/A2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/A2;->G(Lcom/google/android/gms/internal/measurement/A2;I)V

    return-object p0
.end method

.method public final w(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/A2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/A2;->H(Lcom/google/android/gms/internal/measurement/A2;Ljava/lang/Iterable;)V

    return-object p0
.end method
