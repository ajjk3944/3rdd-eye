.class public final LVf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr/i;

.field private final b:I

.field private final c:F

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/List;

.field private final f:F

.field private final g:Lr/a;

.field private final h:[F

.field private final i:J

.field private final j:J

.field private final k:Lm0/S0;

.field private final l:Lm0/S0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lr/i;IFLjava/util/List;Ljava/util/List;F)V
    .locals 1

    const-string v0, "animationSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shaderColors"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVf/d;->a:Lr/i;

    .line 4
    iput p2, p0, LVf/d;->b:I

    .line 5
    iput p3, p0, LVf/d;->c:F

    .line 6
    iput-object p4, p0, LVf/d;->d:Ljava/util/List;

    .line 7
    iput-object p5, p0, LVf/d;->e:Ljava/util/List;

    .line 8
    iput p6, p0, LVf/d;->f:F

    const/4 p1, 0x0

    const/4 p3, 0x2

    const/4 p4, 0x0

    .line 9
    invoke-static {p1, p1, p3, p4}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object p5

    iput-object p5, p0, LVf/d;->g:Lr/a;

    const/4 p5, 0x1

    .line 10
    invoke-static {p4, p5, p4}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object p4

    iput-object p4, p0, LVf/d;->h:[F

    neg-float p4, p6

    int-to-float p3, p3

    div-float/2addr p4, p3

    .line 11
    invoke-static {p4, p1}, Ll0/h;->a(FF)J

    move-result-wide p3

    iput-wide p3, p0, LVf/d;->i:J

    .line 12
    invoke-static {p3, p4}, Ll0/g;->u(J)J

    move-result-wide p3

    iput-wide p3, p0, LVf/d;->j:J

    .line 13
    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object p1

    .line 14
    invoke-interface {p1, p5}, Lm0/S0;->t(Z)V

    .line 15
    sget-object p3, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {p3}, Lm0/T0$a;->a()I

    move-result p3

    invoke-interface {p1, p3}, Lm0/S0;->H(I)V

    .line 16
    invoke-interface {p1, p2}, Lm0/S0;->v(I)V

    .line 17
    iput-object p1, p0, LVf/d;->k:Lm0/S0;

    .line 18
    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object p1

    iput-object p1, p0, LVf/d;->l:Lm0/S0;

    return-void
.end method

.method public synthetic constructor <init>(Lr/i;IFLjava/util/List;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LVf/d;-><init>(Lr/i;IFLjava/util/List;Ljava/util/List;F)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;LVf/c;)V
    .locals 12

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shimmerArea"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LVf/c;->d()Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, LVf/c;->f()Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, LVf/d;->g:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p2}, LVf/c;->e()F

    move-result v1

    neg-float v1, v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p2}, LVf/c;->e()F

    move-result v2

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    invoke-virtual {p2}, LVf/c;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v0

    add-float/2addr v1, v0

    iget-object v0, p0, LVf/d;->h:[F

    invoke-static {v0}, Lm0/O0;->h([F)V

    invoke-virtual {p2}, LVf/c;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    invoke-virtual {p2}, LVf/c;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lm0/O0;->p([FFFF)V

    iget v2, p0, LVf/d;->c:F

    invoke-static {v0, v2}, Lm0/O0;->k([FF)V

    invoke-virtual {p2}, LVf/c;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    neg-float v2, v2

    invoke-virtual {p2}, LVf/c;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result p2

    neg-float p2, p2

    invoke-static {v0, v2, p2, v4}, Lm0/O0;->p([FFFF)V

    invoke-static {v0, v1, v4, v4}, Lm0/O0;->p([FFFF)V

    iget-object p2, p0, LVf/d;->k:Lm0/S0;

    iget-object v0, p0, LVf/d;->h:[F

    iget-wide v1, p0, LVf/d;->i:J

    invoke-static {v0, v1, v2}, Lm0/O0;->f([FJ)J

    move-result-wide v3

    iget-object v0, p0, LVf/d;->h:[F

    iget-wide v1, p0, LVf/d;->j:J

    invoke-static {v0, v1, v2}, Lm0/O0;->f([FJ)J

    move-result-wide v5

    iget-object v7, p0, LVf/d;->d:Ljava/util/List;

    iget-object v8, p0, LVf/d;->e:Ljava/util/List;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lm0/f1;->b(JJLjava/util/List;Ljava/util/List;IILjava/lang/Object;)Landroid/graphics/Shader;

    move-result-object v0

    invoke-interface {p2, v0}, Lm0/S0;->y(Landroid/graphics/Shader;)V

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/n;->c(J)Ll0/i;

    move-result-object p2

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    iget-object v1, p0, LVf/d;->l:Lm0/S0;

    :try_start_0
    invoke-interface {v0, p2, v1}, Lm0/n0;->l(Ll0/i;Lm0/S0;)V

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object p1, p0, LVf/d;->k:Lm0/S0;

    invoke-interface {v0, p2, p1}, Lm0/n0;->v(Ll0/i;Lm0/S0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lm0/n0;->r()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lm0/n0;->r()V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LVf/d;->g:Lr/a;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, p0, LVf/d;->a:Lr/i;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LVf/d;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LVf/d;

    iget-object v2, p0, LVf/d;->a:Lr/i;

    iget-object v3, p1, LVf/d;->a:Lr/i;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, LVf/d;->b:I

    iget v3, p1, LVf/d;->b:I

    invoke-static {v2, v3}, Lm0/d0;->E(II)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, LVf/d;->c:F

    iget v3, p1, LVf/d;->c:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget-object v2, p0, LVf/d;->d:Ljava/util/List;

    iget-object v3, p1, LVf/d;->d:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, LVf/d;->e:Ljava/util/List;

    iget-object v3, p1, LVf/d;->e:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget v2, p0, LVf/d;->f:F

    iget p1, p1, LVf/d;->f:F

    cmpg-float p1, v2, p1

    if-nez p1, :cond_6

    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LVf/d;->a:Lr/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LVf/d;->b:I

    invoke-static {v1}, Lm0/d0;->F(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LVf/d;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LVf/d;->d:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LVf/d;->e:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LVf/d;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
