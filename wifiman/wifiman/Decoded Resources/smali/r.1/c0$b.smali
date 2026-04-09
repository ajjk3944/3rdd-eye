.class public final Lr/c0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:J

.field private b:Lr/v0;

.field private c:Z

.field private d:F

.field private e:Lr/m;

.field private f:Lr/m;

.field private g:J

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/m;-><init>(F)V

    iput-object v0, p0, Lr/c0$b;->e:Lr/m;

    return-void
.end method


# virtual methods
.method public final a()Lr/v0;
    .locals 1

    iget-object v0, p0, Lr/c0$b;->b:Lr/v0;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lr/c0$b;->h:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lr/c0$b;->g:J

    return-wide v0
.end method

.method public final d()Lr/m;
    .locals 1

    iget-object v0, p0, Lr/c0$b;->f:Lr/m;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lr/c0$b;->a:J

    return-wide v0
.end method

.method public final f()Lr/m;
    .locals 1

    iget-object v0, p0, Lr/c0$b;->e:Lr/m;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lr/c0$b;->d:F

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lr/c0$b;->c:Z

    return v0
.end method

.method public final i(Lr/v0;)V
    .locals 0

    iput-object p1, p0, Lr/c0$b;->b:Lr/v0;

    return-void
.end method

.method public final j(J)V
    .locals 0

    iput-wide p1, p0, Lr/c0$b;->h:J

    return-void
.end method

.method public final k(Z)V
    .locals 0

    iput-boolean p1, p0, Lr/c0$b;->c:Z

    return-void
.end method

.method public final l(J)V
    .locals 0

    iput-wide p1, p0, Lr/c0$b;->g:J

    return-void
.end method

.method public final m(Lr/m;)V
    .locals 0

    iput-object p1, p0, Lr/c0$b;->f:Lr/m;

    return-void
.end method

.method public final n(J)V
    .locals 0

    iput-wide p1, p0, Lr/c0$b;->a:J

    return-void
.end method

.method public final o(F)V
    .locals 0

    iput p1, p0, Lr/c0$b;->d:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "progress nanos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lr/c0$b;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/c0$b;->b:Lr/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isComplete: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lr/c0$b;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr/c0$b;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/c0$b;->e:Lr/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialVelocity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/c0$b;->f:Lr/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", durationNanos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lr/c0$b;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpecDuration: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lr/c0$b;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
