.class public final LM/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:I


# instance fields
.field private final a:J

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:LL0/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LL0/M;->g:I

    sput v0, LM/k;->g:I

    return-void
.end method

.method public constructor <init>(JIIIILL0/M;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LM/k;->a:J

    iput p3, p0, LM/k;->b:I

    iput p4, p0, LM/k;->c:I

    iput p5, p0, LM/k;->d:I

    iput p6, p0, LM/k;->e:I

    iput-object p7, p0, LM/k;->f:LL0/M;

    return-void
.end method

.method private final b()LW0/i;
    .locals 2

    iget-object v0, p0, LM/k;->f:LL0/M;

    iget v1, p0, LM/k;->d:I

    invoke-static {v0, v1}, LM/y;->a(LL0/M;I)LW0/i;

    move-result-object v0

    return-object v0
.end method

.method private final j()LW0/i;
    .locals 2

    iget-object v0, p0, LM/k;->f:LL0/M;

    iget v1, p0, LM/k;->c:I

    invoke-static {v0, v1}, LM/y;->a(LL0/M;I)LW0/i;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)LM/l$a;
    .locals 4

    new-instance v0, LM/l$a;

    iget-object v1, p0, LM/k;->f:LL0/M;

    invoke-static {v1, p1}, LM/y;->a(LL0/M;I)LW0/i;

    move-result-object v1

    iget-wide v2, p0, LM/k;->a:J

    invoke-direct {v0, v1, p1, v2, v3}, LM/l$a;-><init>(LW0/i;IJ)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM/k;->f:LL0/M;

    invoke-virtual {v0}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->j()LL0/d;

    move-result-object v0

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()LM/e;
    .locals 2

    iget v0, p0, LM/k;->c:I

    iget v1, p0, LM/k;->d:I

    if-ge v0, v1, :cond_0

    sget-object v0, LM/e;->NOT_CROSSED:LM/e;

    goto :goto_0

    :cond_0
    if-le v0, v1, :cond_1

    sget-object v0, LM/e;->CROSSED:LM/e;

    goto :goto_0

    :cond_1
    sget-object v0, LM/e;->COLLAPSED:LM/e;

    :goto_0
    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LM/k;->d:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LM/k;->e:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LM/k;->c:I

    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, LM/k;->a:J

    return-wide v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LM/k;->b:I

    return v0
.end method

.method public final k()LL0/M;
    .locals 1

    iget-object v0, p0, LM/k;->f:LL0/M;

    return-object v0
.end method

.method public final l()I
    .locals 1

    invoke-virtual {p0}, LM/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final m(LM/k;)Z
    .locals 4

    iget-wide v0, p0, LM/k;->a:J

    iget-wide v2, p1, LM/k;->a:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, LM/k;->c:I

    iget v1, p1, LM/k;->c:I

    if-ne v0, v1, :cond_1

    iget v0, p0, LM/k;->d:I

    iget p1, p1, LM/k;->d:I

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SelectionInfo(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LM/k;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", range=("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM/k;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LM/k;->j()LW0/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, LM/k;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LM/k;->b()LW0/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "), prevOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM/k;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
