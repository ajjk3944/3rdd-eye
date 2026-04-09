.class public final Lcom/google/android/gms/internal/measurement/T1$a;
.super Lcom/google/android/gms/internal/measurement/D4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/T1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/T1;->I()Lcom/google/android/gms/internal/measurement/T1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/D4$b;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/h2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/T1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/T1$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/T1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/T1;->F(Lcom/google/android/gms/internal/measurement/T1;Ljava/lang/String;)V

    return-object p0
.end method
