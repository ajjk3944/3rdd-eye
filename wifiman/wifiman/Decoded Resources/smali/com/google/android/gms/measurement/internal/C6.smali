.class final Lcom/google/android/gms/measurement/internal/C6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field protected b:J

.field private final c:Lcom/google/android/gms/measurement/internal/A;

.field final synthetic d:Lcom/google/android/gms/measurement/internal/w6;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/w6;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/B6;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/measurement/internal/B6;-><init>(Lcom/google/android/gms/measurement/internal/C6;Lcom/google/android/gms/measurement/internal/c4;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->b:J

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/measurement/internal/C6;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/C6;->d(ZZJ)Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f1;->k()Lcom/google/android/gms/measurement/internal/B;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/B;->s(J)V

    return-void
.end method


# virtual methods
.method final a(J)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->b:J

    sub-long v0, p1, v0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/C6;->b:J

    return-wide v0
.end method

.method final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->c1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->b:J

    return-void
.end method

.method public final d(ZZJ)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/I2;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->e()Lcom/google/android/gms/measurement/internal/X2;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/X2;->r:Lcom/google/android/gms/measurement/internal/Y2;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/Y2;->b(J)V

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    sub-long v0, p3, v0

    if-nez p1, :cond_1

    const-wide/16 v2, 0x3e8

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    if-nez p2, :cond_2

    invoke-virtual {p0, p3, p4}, Lcom/google/android/gms/measurement/internal/C6;->a(J)J

    move-result-wide v0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Recording user engagement, ms"

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_et"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->T()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f1;->p()Lcom/google/android/gms/measurement/internal/x5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/x5;->z(Z)Lcom/google/android/gms/measurement/internal/u5;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/measurement/internal/x7;->T(Lcom/google/android/gms/measurement/internal/u5;Landroid/os/Bundle;Z)V

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f1;->n()Lcom/google/android/gms/measurement/internal/r4;

    move-result-object p2

    const-string v0, "auto"

    const-string v2, "_e"

    invoke-virtual {p2, v0, v2, p1}, Lcom/google/android/gms/measurement/internal/r4;->c1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/A;->a()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    sget-object p2, Lcom/google/android/gms/measurement/internal/N;->p0:Lcom/google/android/gms/measurement/internal/q2;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lcom/google/android/gms/measurement/internal/q2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/A;->b(J)V

    return v1
.end method

.method final e(J)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/A;->a()V

    return-void
.end method

.method final f(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->d:Lcom/google/android/gms/measurement/internal/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/C6;->c:Lcom/google/android/gms/measurement/internal/A;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/A;->a()V

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/C6;->a:J

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/C6;->b:J

    return-void
.end method
