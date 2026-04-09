.class public final LVf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private c:Ll0/i;

.field private d:J

.field private e:F

.field private f:J

.field private g:Ll0/i;

.field private h:Ll0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LVf/c;->a:F

    invoke-direct {p0, p2}, LVf/c;->g(F)F

    move-result p1

    invoke-direct {p0, p1}, LVf/c;->i(F)F

    move-result p1

    iput p1, p0, LVf/c;->b:F

    sget-object p1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p1}, Ll0/m$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LVf/c;->d:J

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LVf/c;->f:J

    sget-object p1, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p1}, Ll0/i$a;->a()Ll0/i;

    move-result-object p2

    iput-object p2, p0, LVf/c;->g:Ll0/i;

    invoke-virtual {p1}, Ll0/i$a;->a()Ll0/i;

    move-result-object p1

    iput-object p1, p0, LVf/c;->h:Ll0/i;

    return-void
.end method

.method private final a()V
    .locals 4

    iget-object v0, p0, LVf/c;->h:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LVf/c;->c:Ll0/i;

    if-nez v0, :cond_1

    iget-object v0, p0, LVf/c;->h:Ll0/i;

    :cond_1
    iput-object v0, p0, LVf/c;->g:Ll0/i;

    iget-object v0, p0, LVf/c;->h:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->u(J)J

    move-result-wide v0

    iget-object v2, p0, LVf/c;->g:Ll0/i;

    invoke-virtual {v2}, Ll0/i;->i()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    iput-wide v0, p0, LVf/c;->f:J

    iget-object v0, p0, LVf/c;->g:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->m()J

    move-result-wide v0

    iget-wide v2, p0, LVf/c;->d:J

    invoke-static {v2, v3, v0, v1}, Ll0/m;->f(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    iput-wide v0, p0, LVf/c;->d:J

    invoke-direct {p0}, LVf/c;->b()V

    :cond_2
    return-void
.end method

.method private final b()V
    .locals 8

    iget-wide v0, p0, LVf/c;->d:J

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v2, v1

    div-float/2addr v0, v2

    iget-wide v3, p0, LVf/c;->d:J

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v3

    div-float/2addr v3, v2

    float-to-double v4, v0

    int-to-double v6, v1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v1, v4

    float-to-double v3, v3

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v1, v3

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v1, v3

    div-float/2addr v0, v1

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->acos(D)D

    move-result-wide v3

    double-to-float v0, v3

    iget v3, p0, LVf/c;->b:F

    sub-float/2addr v0, v3

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v0, v3

    mul-float/2addr v0, v1

    mul-float/2addr v0, v2

    iget v1, p0, LVf/c;->a:F

    add-float/2addr v0, v1

    iput v0, p0, LVf/c;->e:F

    return-void
.end method

.method private final g(F)F
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/16 v0, 0xb4

    int-to-float v0, v0

    rem-float/2addr p1, v0

    const/16 v0, 0x5a

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    neg-float p1, p1

    add-float/2addr p1, v0

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The shimmer\'s rotation must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final i(F)F
    .locals 1

    const/16 v0, 0xb4

    int-to-float v0, v0

    div-float/2addr p1, v0

    const v0, 0x40490fdb    # (float)Math.PI

    mul-float/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-wide v0, p0, LVf/c;->f:J

    return-wide v0
.end method

.method public final d()Ll0/i;
    .locals 1

    iget-object v0, p0, LVf/c;->g:Ll0/i;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, LVf/c;->e:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LVf/c;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LVf/c;

    iget v2, p0, LVf/c;->a:F

    iget v3, p1, LVf/c;->a:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, LVf/c;->b:F

    iget p1, p1, LVf/c;->b:F

    cmpg-float p1, v2, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final f()Ll0/i;
    .locals 1

    iget-object v0, p0, LVf/c;->h:Ll0/i;

    return-object v0
.end method

.method public final h(Ll0/i;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LVf/c;->h:Ll0/i;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LVf/c;->h:Ll0/i;

    invoke-direct {p0}, LVf/c;->a()V

    return-void
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LVf/c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LVf/c;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final j(Ll0/i;)V
    .locals 1

    iget-object v0, p0, LVf/c;->c:Ll0/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LVf/c;->c:Ll0/i;

    invoke-direct {p0}, LVf/c;->a()V

    return-void
.end method
