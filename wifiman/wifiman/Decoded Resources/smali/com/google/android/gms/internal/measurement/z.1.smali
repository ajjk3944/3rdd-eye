.class public final Lcom/google/android/gms/internal/measurement/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/Z2;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 0

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Undefined has no function %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/z;

    return p1
.end method

.method public final zzc()Lcom/google/android/gms/internal/measurement/s;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->e0:Lcom/google/android/gms/internal/measurement/s;

    return-object v0
.end method

.method public final zzd()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final zze()Ljava/lang/Double;
    .locals 2

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    const-string v0, "undefined"

    return-object v0
.end method

.method public final zzh()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
