.class final Lcom/google/android/gms/internal/measurement/D5;
.super Lcom/google/android/gms/internal/measurement/E5;
.source "SourceFile"


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/measurement/y5;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/y5;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/D5;->b:Lcom/google/android/gms/internal/measurement/y5;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/E5;-><init>(Lcom/google/android/gms/internal/measurement/y5;Lcom/google/android/gms/internal/measurement/G5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/y5;Lcom/google/android/gms/internal/measurement/G5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/D5;-><init>(Lcom/google/android/gms/internal/measurement/y5;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/A5;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/D5;->b:Lcom/google/android/gms/internal/measurement/y5;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/A5;-><init>(Lcom/google/android/gms/internal/measurement/y5;Lcom/google/android/gms/internal/measurement/G5;)V

    return-object v0
.end method
