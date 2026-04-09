.class public final Lr/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/I;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lr/E;

.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILr/E;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr/L;->a:I

    iput p2, p0, Lr/L;->b:I

    iput-object p3, p0, Lr/L;->c:Lr/E;

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lr/L;->d:J

    int-to-long p1, p2

    mul-long/2addr p1, v2

    iput-wide p1, p0, Lr/L;->e:J

    return-void
.end method

.method private final f(J)J
    .locals 8

    iget-wide v0, p0, Lr/L;->e:J

    sub-long v2, p1, v0

    const-wide/16 v4, 0x0

    iget-wide v6, p0, Lr/L;->d:J

    invoke-static/range {v2 .. v7}, Lsh/m;->m(JJJ)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public b(JFFF)F
    .locals 9

    invoke-direct {p0, p1, p2}, Lr/L;->f(J)J

    move-result-wide v1

    const-wide/16 p1, 0x0

    cmp-long p1, v1, p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-nez p1, :cond_1

    return p5

    :cond_1
    const-wide/32 p1, 0xf4240

    sub-long v4, v1, p1

    move-object v3, p0

    move v6, p3

    move v7, p4

    move v8, p5

    invoke-virtual/range {v3 .. v8}, Lr/L;->e(JFFF)F

    move-result p1

    move-object v0, p0

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/L;->e(JFFF)F

    move-result p2

    sub-float/2addr p2, p1

    const/high16 p1, 0x447a0000    # 1000.0f

    mul-float/2addr p2, p1

    return p2
.end method

.method public c(FFF)J
    .locals 2

    iget p1, p0, Lr/L;->b:I

    iget p2, p0, Lr/L;->a:I

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public e(JFFF)F
    .locals 3

    invoke-direct {p0, p1, p2}, Lr/L;->f(J)J

    move-result-wide p1

    iget p5, p0, Lr/L;->a:I

    const/high16 v0, 0x3f800000    # 1.0f

    if-nez p5, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    long-to-float p1, p1

    iget-wide v1, p0, Lr/L;->d:J

    long-to-float p2, v1

    div-float/2addr p1, p2

    :goto_0
    iget-object p2, p0, Lr/L;->c:Lr/E;

    const/4 p5, 0x0

    cmpg-float v1, p1, p5

    if-gez v1, :cond_1

    move p1, p5

    :cond_1
    cmpl-float p5, p1, v0

    if-lez p5, :cond_2

    goto :goto_1

    :cond_2
    move v0, p1

    :goto_1
    invoke-interface {p2, v0}, Lr/E;->a(F)F

    move-result p1

    invoke-static {p3, p4, p1}, Lr/u0;->k(FFF)F

    move-result p1

    return p1
.end method
