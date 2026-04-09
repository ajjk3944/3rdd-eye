.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

.field private final b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

    instance-of p1, p3, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    return-void
.end method

.method static c(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k3;)V
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->f()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->k(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k3;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;[BIILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)V
    .locals 8

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->c()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    :goto_0
    if-ge p3, p4, :cond_9

    invoke-static {p2, p3, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->j([BILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result v4

    iget v2, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->a:I

    const/16 p1, 0xb

    const/4 p3, 0x2

    if-eq v2, p1, :cond_2

    and-int/lit8 p1, v2, 0x7

    if-ne p1, p3, :cond_1

    iget-object p1, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;

    iget-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    ushr-int/lit8 v0, v2, 0x3

    invoke-virtual {p1, p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;I)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z1;

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->i(I[BIILcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result p3

    goto :goto_0

    :cond_1
    invoke-static {v2, p2, v4, p4, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->p(I[BIILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result p3

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_1
    if-ge v4, p4, :cond_6

    invoke-static {p2, v4, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->j([BILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result v2

    iget v3, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->a:I

    ushr-int/lit8 v4, v3, 0x3

    and-int/lit8 v5, v3, 0x7

    if-eq v4, p3, :cond_4

    const/4 v6, 0x3

    if-eq v4, v6, :cond_3

    goto :goto_2

    :cond_3
    if-ne v5, p3, :cond_5

    invoke-static {p2, v2, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->a([BILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result v4

    iget-object p1, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    goto :goto_1

    :cond_4
    if-nez v5, :cond_5

    invoke-static {p2, v2, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->j([BILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result v4

    iget v0, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->a:I

    iget-object v2, p5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;I)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z1;

    goto :goto_1

    :cond_5
    :goto_2
    const/16 v4, 0xc

    if-eq v3, v4, :cond_7

    invoke-static {v3, p2, v2, p4, p5}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q1;->p(I[BIILcom/google/android/gms/internal/mlkit_vision_internal_vkp/p1;)I

    move-result v4

    goto :goto_1

    :cond_6
    move v2, v4

    :cond_7
    if-eqz p1, :cond_8

    shl-int/lit8 v0, v0, 0x3

    or-int/2addr p3, v0

    invoke-virtual {v1, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->j(ILjava/lang/Object;)V

    :cond_8
    move p3, v2

    goto :goto_0

    :cond_9
    if-ne p3, p4, :cond_a

    return-void

    :cond_a
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;

    const-string p2, "Failed to parse the message."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->b()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->c()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;->c()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/y2;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/y2;->s()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final zzg(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L2;->w(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L2;->v(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final zzk(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    move-object v1, p2

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c:Z

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    check-cast p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p2, p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final zzl(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->l()Z

    move-result p1

    return p1
.end method
