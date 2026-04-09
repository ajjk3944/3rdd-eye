.class public final Lcom/google/android/gms/measurement/internal/w6;
.super Lcom/google/android/gms/measurement/internal/I2;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;

.field private d:Z

.field protected final e:Lcom/google/android/gms/measurement/internal/E6;

.field protected final f:Lcom/google/android/gms/measurement/internal/C6;

.field private final g:Lcom/google/android/gms/measurement/internal/x6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v3;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/I2;-><init>(Lcom/google/android/gms/measurement/internal/v3;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/w6;->d:Z

    new-instance p1, Lcom/google/android/gms/measurement/internal/E6;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/E6;-><init>(Lcom/google/android/gms/measurement/internal/w6;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w6;->e:Lcom/google/android/gms/measurement/internal/E6;

    new-instance p1, Lcom/google/android/gms/measurement/internal/C6;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/C6;-><init>(Lcom/google/android/gms/measurement/internal/w6;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w6;->f:Lcom/google/android/gms/measurement/internal/C6;

    new-instance p1, Lcom/google/android/gms/measurement/internal/x6;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/x6;-><init>(Lcom/google/android/gms/measurement/internal/w6;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w6;->g:Lcom/google/android/gms/measurement/internal/x6;

    return-void
.end method

.method private final D()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/N0;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/N0;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method static synthetic E(Lcom/google/android/gms/measurement/internal/w6;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/w6;->D()V

    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/measurement/internal/w6;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/w6;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity resumed, time"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->b1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->T()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/w6;->d:Z

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->f:Lcom/google/android/gms/measurement/internal/C6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/C6;->f(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->T()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/X2;->u:Lcom/google/android/gms/measurement/internal/W2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/W2;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->f:Lcom/google/android/gms/measurement/internal/C6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/C6;->f(J)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/w6;->g:Lcom/google/android/gms/measurement/internal/x6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/x6;->a()V

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/w6;->e:Lcom/google/android/gms/measurement/internal/E6;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/E6;->a:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/E6;->a:Lcom/google/android/gms/measurement/internal/w6;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/v3;->n()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/E6;->a:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/measurement/internal/E6;->b(JZ)V

    :cond_4
    return-void
.end method

.method static bridge synthetic y(Lcom/google/android/gms/measurement/internal/w6;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/w6;->c:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic z(Lcom/google/android/gms/measurement/internal/w6;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/w6;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity paused, time"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->g:Lcom/google/android/gms/measurement/internal/x6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/x6;->b(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/w6;->f:Lcom/google/android/gms/measurement/internal/C6;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/C6;->e(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method final A(Z)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/w6;->d:Z

    return-void
.end method

.method public final B(ZZJ)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w6;->f:Lcom/google/android/gms/measurement/internal/C6;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/measurement/internal/C6;->d(ZZJ)Z

    move-result p1

    return p1
.end method

.method final C()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/w6;->d:Z

    return v0
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

.method protected final t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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
