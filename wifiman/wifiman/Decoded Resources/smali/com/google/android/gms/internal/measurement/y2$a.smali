.class public final Lcom/google/android/gms/internal/measurement/y2$a;
.super Lcom/google/android/gms/internal/measurement/D4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/y2;->H()Lcom/google/android/gms/internal/measurement/y2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/D4$b;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/O2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/y2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final u(Lcom/google/android/gms/internal/measurement/t2$a;)Lcom/google/android/gms/internal/measurement/y2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/D4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/t2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/y2;->G(Lcom/google/android/gms/internal/measurement/y2;Lcom/google/android/gms/internal/measurement/t2;)V

    return-object p0
.end method
