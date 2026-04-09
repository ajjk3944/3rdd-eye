.class final Lcom/google/android/gms/measurement/internal/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Ljava/lang/Long;

.field private B:Ljava/lang/Long;

.field private C:J

.field private D:Ljava/lang/String;

.field private E:I

.field private F:I

.field private G:J

.field private H:Ljava/lang/String;

.field private I:[B

.field private J:I

.field private K:J

.field private L:J

.field private M:J

.field private N:J

.field private O:J

.field private P:J

.field private Q:Ljava/lang/String;

.field private R:Z

.field private S:J

.field private T:J

.field private final a:Lcom/google/android/gms/measurement/internal/v3;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:J

.field private h:J

.field private i:J

.field private j:Ljava/lang/String;

.field private k:J

.field private l:Ljava/lang/String;

.field private m:J

.field private n:J

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/Boolean;

.field private s:J

.field private t:Ljava/util/List;

.field private u:Ljava/lang/String;

.field private v:Z

.field private w:J

.field private x:J

.field private y:I

.field private z:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/h2;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->o:Z

    return v0
.end method

.method public final A0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->m:J

    return-wide v0
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    return v0
.end method

.method public final B0(J)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Ls3/p;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    cmp-long v3, v3, p1

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    return-void
.end method

.method public final C()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->v:Z

    return v0
.end method

.method public final C0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->G:J

    return-wide v0
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->z:Z

    return v0
.end method

.method public final D0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->h:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->h:J

    return-void
.end method

.method public final E()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->I:[B

    return-object v0
.end method

.method public final E0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->i:J

    return-wide v0
.end method

.method public final F()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/h2;->J:I

    return v0
.end method

.method public final F0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->x:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->x:J

    return-void
.end method

.method public final G(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget v1, p0, Lcom/google/android/gms/measurement/internal/h2;->J:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput p1, p0, Lcom/google/android/gms/measurement/internal/h2;->J:I

    return-void
.end method

.method public final G0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    return-wide v0
.end method

.method public final H(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->k:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->k:J

    return-void
.end method

.method public final H0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->w:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->w:J

    return-void
.end method

.method public final I(Ljava/lang/Long;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->B:Ljava/lang/Long;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->B:Ljava/lang/Long;

    return-void
.end method

.method public final I0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->h:J

    return-wide v0
.end method

.method public final J(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->c:Ljava/lang/String;

    return-void
.end method

.method public final J0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->x:J

    return-wide v0
.end method

.method public final K(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/h2;->o:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/h2;->o:Z

    return-void
.end method

.method public final K0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->w:J

    return-wide v0
.end method

.method public final L()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/h2;->F:I

    return v0
.end method

.method public final L0()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->r:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final M(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget v1, p0, Lcom/google/android/gms/measurement/internal/h2;->F:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput p1, p0, Lcom/google/android/gms/measurement/internal/h2;->F:I

    return-void
.end method

.method public final M0()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->A:Ljava/lang/Long;

    return-object v0
.end method

.method public final N(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->C:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->C:J

    return-void
.end method

.method public final N0()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->B:Ljava/lang/Long;

    return-object v0
.end method

.method public final O(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->l:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->l:Ljava/lang/String;

    return-void
.end method

.method public final P(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/h2;->v:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/h2;->v:Z

    return-void
.end method

.method public final Q()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/h2;->E:I

    return v0
.end method

.method public final R(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget v1, p0, Lcom/google/android/gms/measurement/internal/h2;->E:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput p1, p0, Lcom/google/android/gms/measurement/internal/h2;->E:I

    return-void
.end method

.method public final S(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->S:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->S:J

    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->j:Ljava/lang/String;

    return-void
.end method

.method public final U(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/h2;->z:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/h2;->z:Z

    return-void
.end method

.method public final V()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->k:J

    return-wide v0
.end method

.method public final W(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->N:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->N:J

    return-void
.end method

.method public final X(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->f:Ljava/lang/String;

    return-void
.end method

.method public final Y()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->C:J

    return-wide v0
.end method

.method public final Z(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->O:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->O:J

    return-void
.end method

.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/h2;->y:I

    return v0
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->d:Ljava/lang/String;

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget v1, p0, Lcom/google/android/gms/measurement/internal/h2;->y:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput p1, p0, Lcom/google/android/gms/measurement/internal/h2;->y:I

    return-void
.end method

.method public final b0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->S:J

    return-wide v0
.end method

.method public final c(J)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    add-long/2addr v0, p1

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x1

    if-lez v4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "Bundle index overflow. appId"

    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sub-long v0, p1, v5

    :cond_0
    iget-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->G:J

    add-long/2addr p1, v5

    cmp-long v2, p1, v2

    if-lez v2, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/v3;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/h2;->b:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string v2, "Delivery index overflow. appId"

    invoke-virtual {p1, v2, p2}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 p1, 0x0

    :cond_1
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->G:J

    return-void
.end method

.method public final c0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->M:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->M:J

    return-void
.end method

.method public final d(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->r:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->r:Ljava/lang/Boolean;

    return-void
.end method

.method public final d0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->Q:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->Q:Ljava/lang/String;

    return-void
.end method

.method public final e(Ljava/lang/Long;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->A:Ljava/lang/Long;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->A:Ljava/lang/Long;

    return-void
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->N:J

    return-wide v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->q:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->q:Ljava/lang/String;

    return-void
.end method

.method public final f0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->L:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->L:J

    return-void
.end method

.method public final g(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->t:Ljava/util/List;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->t:Ljava/util/List;

    :cond_1
    return-void
.end method

.method public final g0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->e:Ljava/lang/String;

    return-void
.end method

.method public final h(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/h2;->p:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/h2;->p:Z

    return-void
.end method

.method public final h0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->O:J

    return-wide v0
.end method

.method public final i([B)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->I:[B

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->I:[B

    return-void
.end method

.method public final i0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->P:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->P:J

    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final j0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->H:Ljava/lang/String;

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->H:Ljava/lang/String;

    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->Q:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/h2;->d0(Ljava/lang/String;)V

    return-object v0
.end method

.method public final k0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->M:J

    return-wide v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final l0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->K:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->K:J

    return-void
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->u:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->u:Ljava/lang/String;

    return-void
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final n0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->L:J

    return-wide v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final o0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->n:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->n:J

    return-void
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final p0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->D:Ljava/lang/String;

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/h2;->D:Ljava/lang/String;

    return-void
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final q0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->P:J

    return-wide v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->Q:Ljava/lang/String;

    return-object v0
.end method

.method public final r0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->s:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->s:J

    return-void
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final s0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->K:J

    return-wide v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->H:Ljava/lang/String;

    return-object v0
.end method

.method public final t0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->T:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->T:J

    return-void
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->u:Ljava/lang/String;

    return-object v0
.end method

.method public final u0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->n:J

    return-wide v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->D:Ljava/lang/String;

    return-object v0
.end method

.method public final v0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->m:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->m:J

    return-void
.end method

.method public final w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->t:Ljava/util/List;

    return-object v0
.end method

.method public final w0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->s:J

    return-wide v0
.end method

.method public final x()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    return-void
.end method

.method public final x0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->G:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->G:J

    return-void
.end method

.method public final y()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/h2;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Bundle index overflow. appId"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->g:J

    return-void
.end method

.method public final y0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/h2;->T:J

    return-wide v0
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->p:Z

    return v0
.end method

.method public final z0(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h2;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v3;->zzl()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h2;->i:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/h2;->R:Z

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h2;->i:J

    return-void
.end method
