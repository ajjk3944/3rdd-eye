.class public final Lcom/google/android/gms/measurement/internal/B;
.super Lcom/google/android/gms/measurement/internal/f1;
.source "SourceFile"


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private d:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/v3;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/f1;-><init>(Lcom/google/android/gms/measurement/internal/v3;)V

    new-instance p1, Lo/a;

    invoke-direct {p1}, Lo/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    new-instance p1, Lo/a;

    invoke-direct {p1}, Lo/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    return-void
.end method

.method private final t(JLcom/google/android/gms/measurement/internal/u5;)V
    .locals 2

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string p2, "Not logging ad exposure. No active activity"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide/16 v0, 0x3e8

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "Not logging ad exposure. Less than 1000 ms. exposure"

    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_xt"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const/4 p1, 0x1

    invoke-static {p3, v0, p1}, Lcom/google/android/gms/measurement/internal/x7;->T(Lcom/google/android/gms/measurement/internal/u5;Landroid/os/Bundle;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object p1

    const-string p2, "am"

    const-string p3, "_xa"

    invoke-virtual {p1, p2, p3, v0}, Lcom/google/android/gms/measurement/internal/r4;->c1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic u(Lcom/google/android/gms/measurement/internal/B;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/B;->y(J)V

    return-void
.end method

.method static synthetic v(Lcom/google/android/gms/measurement/internal/B;Ljava/lang/String;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-static {p1}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/B;->d:J

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    add-int/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v2, 0x64

    if-lt v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p1, "Too many ads visible"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final x(Ljava/lang/String;JLcom/google/android/gms/measurement/internal/u5;)V
    .locals 2

    if-nez p4, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string p2, "Not logging ad unit exposure. No active activity"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide/16 v0, 0x3e8

    cmp-long v0, p2, v0

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Not logging ad unit exposure. Less than 1000 ms. exposure"

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_ai"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "_xt"

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const/4 p1, 0x1

    invoke-static {p4, v0, p1}, Lcom/google/android/gms/measurement/internal/x7;->T(Lcom/google/android/gms/measurement/internal/u5;Landroid/os/Bundle;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object p1

    const-string p2, "am"

    const-string p3, "_xu"

    invoke-virtual {p1, p2, p3, v0}, Lcom/google/android/gms/measurement/internal/r4;->c1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final y(J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/B;->d:J

    :cond_1
    return-void
.end method

.method static synthetic z(Lcom/google/android/gms/measurement/internal/B;Ljava/lang/String;J)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-static {p1}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->p()Lcom/google/android/gms/measurement/internal/x5;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/x5;->z(Z)Lcom/google/android/gms/measurement/internal/u5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string v0, "First ad unit exposure time was never set"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, p2, v2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/B;->x(Ljava/lang/String;JLcom/google/android/gms/measurement/internal/u5;)V

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/B;->d:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p1, "First ad exposure time was never set"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    sub-long/2addr p2, v2

    invoke-direct {p0, p2, p3, v1}, Lcom/google/android/gms/measurement/internal/B;->t(JLcom/google/android/gms/measurement/internal/u5;)V

    iput-wide v4, p0, Lcom/google/android/gms/measurement/internal/B;->d:J

    :cond_2
    return-void

    :cond_3
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/B;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p0

    const-string p2, "Call to endAdUnitExposure for unknown ad unit id"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;J)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/E0;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/E0;-><init>(Lcom/google/android/gms/measurement/internal/B;Ljava/lang/String;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/s3;->z(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string p2, "Ad unit id must be a non-empty string"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic a()Lcom/google/android/gms/measurement/internal/l;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b()Lcom/google/android/gms/measurement/internal/F;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic c()Lcom/google/android/gms/measurement/internal/D2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e()Lcom/google/android/gms/measurement/internal/X2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f()Lcom/google/android/gms/measurement/internal/n5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->f()Lcom/google/android/gms/measurement/internal/n5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic g()Lcom/google/android/gms/measurement/internal/x7;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->h()V

    return-void
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->i()V

    return-void
.end method

.method public final bridge synthetic j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->j()V

    return-void
.end method

.method public final bridge synthetic k()Lcom/google/android/gms/measurement/internal/B;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->k()Lcom/google/android/gms/measurement/internal/B;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic l()Lcom/google/android/gms/measurement/internal/z2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->l()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic m()Lcom/google/android/gms/measurement/internal/C2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->m()Lcom/google/android/gms/measurement/internal/C2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lcom/google/android/gms/measurement/internal/r4;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lcom/google/android/gms/measurement/internal/q5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->o()Lcom/google/android/gms/measurement/internal/q5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic p()Lcom/google/android/gms/measurement/internal/x5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->p()Lcom/google/android/gms/measurement/internal/x5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic q()Lcom/google/android/gms/measurement/internal/C5;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->q()Lcom/google/android/gms/measurement/internal/C5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic r()Lcom/google/android/gms/measurement/internal/w6;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/f1;->r()Lcom/google/android/gms/measurement/internal/w6;

    move-result-object v0

    return-object v0
.end method

.method public final s(J)V
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f1;->p()Lcom/google/android/gms/measurement/internal/x5;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/x5;->z(Z)Lcom/google/android/gms/measurement/internal/u5;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long v3, p1, v3

    invoke-direct {p0, v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/B;->x(Ljava/lang/String;JLcom/google/android/gms/measurement/internal/u5;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/B;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/B;->d:J

    sub-long v1, p1, v1

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/measurement/internal/B;->t(JLcom/google/android/gms/measurement/internal/u5;)V

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/B;->y(J)V

    return-void
.end method

.method public final w(Ljava/lang/String;J)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/a;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/a;-><init>(Lcom/google/android/gms/measurement/internal/B;Ljava/lang/String;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/s3;->z(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    const-string p2, "Ad unit id must be a non-empty string"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic zza()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Lcom/google/android/gms/common/util/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzd()Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzj()Lcom/google/android/gms/measurement/internal/L2;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzl()Lcom/google/android/gms/measurement/internal/s3;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    return-object v0
.end method
