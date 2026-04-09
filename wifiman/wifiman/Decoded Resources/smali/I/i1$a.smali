.class final LI/i1$a;
.super Landroidx/compose/runtime/snapshots/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/CharSequence;

.field private d:LL0/S;

.field private e:LL0/U;

.field private f:Z

.field private g:Z

.field private h:F

.field private i:F

.field private j:LY0/t;

.field private k:LQ0/k$b;

.field private l:J

.field private m:LL0/M;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/n;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, LI/i1$a;->h:F

    iput v0, p0, LI/i1$a;->i:F

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, LI/i1$a;->l:J

    return-void
.end method


# virtual methods
.method public final A(Z)V
    .locals 0

    iput-boolean p1, p0, LI/i1$a;->f:Z

    return-void
.end method

.method public final B(Z)V
    .locals 0

    iput-boolean p1, p0, LI/i1$a;->g:Z

    return-void
.end method

.method public final C(LL0/U;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->e:LL0/U;

    return-void
.end method

.method public final D(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->c:Ljava/lang/CharSequence;

    return-void
.end method

.method public c(Landroidx/compose/runtime/snapshots/n;)V
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LI/i1$a;

    iget-object v0, p1, LI/i1$a;->c:Ljava/lang/CharSequence;

    iput-object v0, p0, LI/i1$a;->c:Ljava/lang/CharSequence;

    iget-object v0, p1, LI/i1$a;->d:LL0/S;

    iput-object v0, p0, LI/i1$a;->d:LL0/S;

    iget-object v0, p1, LI/i1$a;->e:LL0/U;

    iput-object v0, p0, LI/i1$a;->e:LL0/U;

    iget-boolean v0, p1, LI/i1$a;->f:Z

    iput-boolean v0, p0, LI/i1$a;->f:Z

    iget-boolean v0, p1, LI/i1$a;->g:Z

    iput-boolean v0, p0, LI/i1$a;->g:Z

    iget v0, p1, LI/i1$a;->h:F

    iput v0, p0, LI/i1$a;->h:F

    iget v0, p1, LI/i1$a;->i:F

    iput v0, p0, LI/i1$a;->i:F

    iget-object v0, p1, LI/i1$a;->j:LY0/t;

    iput-object v0, p0, LI/i1$a;->j:LY0/t;

    iget-object v0, p1, LI/i1$a;->k:LQ0/k$b;

    iput-object v0, p0, LI/i1$a;->k:LQ0/k$b;

    iget-wide v0, p1, LI/i1$a;->l:J

    iput-wide v0, p0, LI/i1$a;->l:J

    iget-object p1, p1, LI/i1$a;->m:LL0/M;

    iput-object p1, p0, LI/i1$a;->m:LL0/M;

    return-void
.end method

.method public d()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    new-instance v0, LI/i1$a;

    invoke-direct {v0}, LI/i1$a;-><init>()V

    return-object v0
.end method

.method public final i()LL0/S;
    .locals 1

    iget-object v0, p0, LI/i1$a;->d:LL0/S;

    return-object v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, LI/i1$a;->l:J

    return-wide v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, LI/i1$a;->h:F

    return v0
.end method

.method public final l()LQ0/k$b;
    .locals 1

    iget-object v0, p0, LI/i1$a;->k:LQ0/k$b;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, LI/i1$a;->i:F

    return v0
.end method

.method public final n()LY0/t;
    .locals 1

    iget-object v0, p0, LI/i1$a;->j:LY0/t;

    return-object v0
.end method

.method public final o()LL0/M;
    .locals 1

    iget-object v0, p0, LI/i1$a;->m:LL0/M;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, LI/i1$a;->f:Z

    return v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, LI/i1$a;->g:Z

    return v0
.end method

.method public final r()LL0/U;
    .locals 1

    iget-object v0, p0, LI/i1$a;->e:LL0/U;

    return-object v0
.end method

.method public final s()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LI/i1$a;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final t(LL0/S;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->d:LL0/S;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CacheRecord(visualText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->d:LL0/S;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->e:LL0/U;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", singleLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LI/i1$a;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", softWrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LI/i1$a;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", densityValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI/i1$a;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI/i1$a;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", layoutDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->j:LY0/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFamilyResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->k:LQ0/k$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LI/i1$a;->l:J

    invoke-static {v1, v2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutResult="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$a;->m:LL0/M;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(J)V
    .locals 0

    iput-wide p1, p0, LI/i1$a;->l:J

    return-void
.end method

.method public final v(F)V
    .locals 0

    iput p1, p0, LI/i1$a;->h:F

    return-void
.end method

.method public final w(LQ0/k$b;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->k:LQ0/k$b;

    return-void
.end method

.method public final x(F)V
    .locals 0

    iput p1, p0, LI/i1$a;->i:F

    return-void
.end method

.method public final y(LY0/t;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->j:LY0/t;

    return-void
.end method

.method public final z(LL0/M;)V
    .locals 0

    iput-object p1, p0, LI/i1$a;->m:LL0/M;

    return-void
.end method
