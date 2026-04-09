.class public final Lr/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/I;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:Lr/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lr/K;->a:F

    .line 3
    iput p2, p0, Lr/K;->b:F

    .line 4
    iput p3, p0, Lr/K;->c:F

    .line 5
    new-instance p3, Lr/f0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p3, v0}, Lr/f0;-><init>(F)V

    .line 6
    invoke-virtual {p3, p1}, Lr/f0;->d(F)V

    .line 7
    invoke-virtual {p3, p2}, Lr/f0;->f(F)V

    .line 8
    iput-object p3, p0, Lr/K;->d:Lr/f0;

    return-void
.end method

.method public synthetic constructor <init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const p2, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const p3, 0x3c23d70a    # 0.01f

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lr/K;-><init>(FFF)V

    return-void
.end method


# virtual methods
.method public b(JFFF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    iget-object v0, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {v0, p4}, Lr/f0;->e(F)V

    iget-object p4, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {p4, p3, p5, p1, p2}, Lr/f0;->g(FFJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Lr/V;->c(J)F

    move-result p1

    return p1
.end method

.method public c(FFF)J
    .locals 2

    iget-object v0, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {v0}, Lr/f0;->b()F

    move-result v0

    iget-object v1, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {v1}, Lr/f0;->a()F

    move-result v1

    sub-float/2addr p1, p2

    iget p2, p0, Lr/K;->c:F

    div-float/2addr p1, p2

    div-float/2addr p3, p2

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, p3, p1, p2}, Lr/e0;->b(FFFFF)J

    move-result-wide p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public d(FFF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e(JFFF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    iget-object v0, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {v0, p4}, Lr/f0;->e(F)V

    iget-object p4, p0, Lr/K;->d:Lr/f0;

    invoke-virtual {p4, p3, p5, p1, p2}, Lr/f0;->g(FFJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Lr/V;->b(J)F

    move-result p1

    return p1
.end method
