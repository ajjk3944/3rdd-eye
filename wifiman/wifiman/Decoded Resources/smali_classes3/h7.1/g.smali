.class public abstract Lh7/g;
.super Lm7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/g$a;
    }
.end annotation


# static fields
.field public static final i:Lh7/g$a;


# instance fields
.field private final a:Lh7/a;

.field private b:Li7/a;

.field private c:I

.field private d:Z

.field private e:Z

.field private final f:LFg/c;

.field private final g:Lgg/i;

.field private h:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh7/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh7/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh7/g;->i:Lh7/g$a;

    return-void
.end method

.method public constructor <init>(Lh7/a;)V
    .locals 1

    const-string/jumbo v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm7/b;-><init>()V

    iput-object p1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {p1}, Lh7/a;->O()Ll7/b;

    move-result-object p1

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-virtual {p1, v0}, Ll7/b;->k(F)V

    const/16 p1, 0xff

    invoke-static {p1, p1, p1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Lh7/g;->c:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh7/g;->d:Z

    iput-boolean p1, p0, Lh7/g;->e:Z

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh7/g;->f:LFg/c;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh7/g;->g:Lgg/i;

    new-instance p1, Lh7/b;

    invoke-direct {p1}, Lh7/b;-><init>()V

    iput-object p1, p0, Lh7/g;->h:Lmh/a;

    return-void
.end method

.method private final D(FFFLmh/l;)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    div-float/2addr v2, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v0, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v0, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v11, Landroid/graphics/Point;

    sub-float v4, v3, v0

    invoke-static {v4}, Loh/b;->e(F)I

    move-result v4

    sub-float v5, v10, v0

    invoke-static {v5}, Loh/b;->e(F)I

    move-result v5

    invoke-direct {v11, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    new-instance v12, Landroid/graphics/Point;

    add-float v4, v3, v0

    invoke-static {v4}, Loh/b;->e(F)I

    move-result v4

    add-float v5, v10, v0

    invoke-static {v5}, Loh/b;->e(F)I

    move-result v5

    invoke-direct {v12, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    iget v4, v11, Landroid/graphics/Point;->x:I

    iget v13, v12, Landroid/graphics/Point;->x:I

    move v14, v4

    :goto_0
    if-ge v14, v13, :cond_2

    iget v4, v11, Landroid/graphics/Point;->y:I

    iget v15, v12, Landroid/graphics/Point;->y:I

    move v9, v4

    :goto_1
    if-ge v9, v15, :cond_1

    int-to-float v4, v14

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v2, v5

    add-float v8, v4, v5

    int-to-float v4, v9

    add-float v16, v4, v5

    move-object/from16 v4, p0

    move v5, v3

    move v6, v10

    move v7, v0

    move/from16 p1, v0

    move v0, v9

    move/from16 v9, v16

    invoke-direct/range {v4 .. v9}, Lh7/g;->G(FFFFF)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, LW7/d;

    invoke-direct {v4, v14, v0}, LW7/d;-><init>(II)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v9, v0, 0x1

    move/from16 v0, p1

    goto :goto_1

    :cond_1
    move/from16 p1, v0

    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private final G(FFFFF)Z
    .locals 4

    float-to-double v0, p4

    float-to-double v2, p1

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    float-to-double p4, p5

    float-to-double p1, p2

    sub-double/2addr p4, p1

    invoke-static {p4, p5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    float-to-double p1, p3

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    cmpg-double p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final H()V
    .locals 1

    invoke-virtual {p0}, Lh7/g;->A()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final I()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final L(Lh7/g;Lk7/a;Lk7/a;)LYg/J;
    .locals 1

    const-string/jumbo v0, "o"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lh7/g;->Y(Lk7/a;Lk7/a;)V

    iget-object p0, p0, Lh7/g;->a:Lh7/a;

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh7/a;->R(Ljava/util/List;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final M(F)F
    .locals 2

    invoke-direct {p0, p1}, Lh7/g;->N(F)F

    move-result p1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->r()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v1}, Lh7/a;->N()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    mul-float/2addr p1, v0

    return p1
.end method

.method private final N(F)F
    .locals 1

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method private final O(F)F
    .locals 1

    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr p1, v0

    return p1
.end method

.method private final S(FFLjava/lang/Float;Lmh/l;)V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, LW7/d;

    invoke-direct {p0, p1}, Lh7/g;->M(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->rint(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    invoke-direct {p0, p2}, Lh7/g;->M(F)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->rint(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-direct {v1, v2, v3}, LW7/d;-><init>(II)V

    invoke-virtual {p0}, Lh7/g;->v()Ll7/h;

    move-result-object v2

    new-instance v3, Lh7/d;

    invoke-direct {v3, p4, v0}, Lh7/d;-><init>(Lmh/l;Ljava/util/List;)V

    invoke-interface {v2, v1, v3}, Ll7/h;->b(LW7/d;Lmh/l;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    new-instance v2, Lh7/g$d;

    invoke-direct {v2, p0}, Lh7/g$d;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3, v2}, Lh7/g;->D(FFFLmh/l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/d;

    invoke-virtual {p0}, Lh7/g;->v()Ll7/h;

    move-result-object p3

    new-instance v2, Lh7/e;

    invoke-direct {v2, v1, p4, v0}, Lh7/e;-><init>(LW7/d;Lmh/l;Ljava/util/List;)V

    invoke-interface {p3, p2, v2}, Ll7/h;->b(LW7/d;Lmh/l;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {p1, v0}, Lh7/a;->Q(Ljava/util/List;)V

    return-void
.end method

.method private static final T(Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;
    .locals 1

    const-string/jumbo v0, "tile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lj7/b;->f(Lmh/l;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final U(LW7/d;Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;
    .locals 1

    const-string/jumbo v0, "tile"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ll7/i;->c()LW7/d;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p3, p0, p1}, Lj7/b;->d(LW7/d;Lmh/l;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic i(Lh7/g;Lk7/a;Lk7/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lh7/g;->L(Lh7/g;Lk7/a;Lk7/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()LYg/J;
    .locals 1

    invoke-static {}, Lh7/g;->I()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(LW7/d;Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh7/g;->U(LW7/d;Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lh7/g;->T(Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lh7/g;Ljava/util/List;Ll7/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lh7/g;->r(Lh7/g;Ljava/util/List;Ll7/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lh7/g;F)F
    .locals 0

    invoke-direct {p0, p1}, Lh7/g;->M(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lh7/g;F)F
    .locals 0

    invoke-direct {p0, p1}, Lh7/g;->N(F)F

    move-result p0

    return p0
.end method

.method private final q(FFF)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lh7/g$b;

    invoke-direct {v1, p0}, Lh7/g$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3, v1}, Lh7/g;->D(FFFLmh/l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/d;

    invoke-virtual {p0}, Lh7/g;->w()Ll7/h;

    move-result-object p3

    new-instance v1, Lh7/f;

    invoke-direct {v1, p0, v0}, Lh7/f;-><init>(Lh7/g;Ljava/util/List;)V

    invoke-interface {p3, p2, v1}, Ll7/h;->b(LW7/d;Lmh/l;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {p1, v0}, Lh7/a;->S(Ljava/util/List;)V

    return-void
.end method

.method private static final r(Lh7/g;Ljava/util/List;Ll7/c;)LYg/J;
    .locals 2

    const-string/jumbo v0, "tile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ll7/c;->a()Ll7/c$b;

    move-result-object v0

    invoke-interface {v0}, Ll7/c$b;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Ll7/c;->a()Ll7/c$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ll7/c$b;->d(Z)V

    invoke-interface {p2}, Ll7/c;->a()Ll7/c$b;

    move-result-object v0

    iget p0, p0, Lh7/g;->c:I

    invoke-interface {v0, p0}, Ll7/c$b;->a(I)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public A()Lmh/a;
    .locals 1

    iget-object v0, p0, Lh7/g;->h:Lmh/a;

    return-object v0
.end method

.method public B()Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v1}, Lh7/a;->O()Ll7/b;

    move-result-object v1

    invoke-virtual {v1}, Ll7/b;->d()F

    move-result v1

    invoke-direct {p0, v1}, Lh7/g;->O(F)F

    move-result v1

    iget-object v2, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v2}, Lh7/a;->O()Ll7/b;

    move-result-object v2

    invoke-virtual {v2}, Ll7/b;->e()F

    move-result v2

    invoke-direct {p0, v2}, Lh7/g;->O(F)F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public C()F
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->O()Ll7/b;

    move-result-object v0

    invoke-virtual {v0}, Ll7/b;->f()F

    move-result v0

    return v0
.end method

.method public final E()Lh7/a;
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    return-object v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lh7/g;->e:Z

    return v0
.end method

.method public final J(FFLmh/l;)V
    .locals 1

    const-string/jumbo v0, "update"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ecccccd    # 0.4f

    invoke-direct {p0, p1, p2, v0}, Lh7/g;->q(FFF)V

    const v0, 0x40533333    # 3.3f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p3}, Lh7/g;->S(FFLjava/lang/Float;Lmh/l;)V

    return-void
.end method

.method public K(FFLk7/a;)V
    .locals 3

    const-string/jumbo v0, "obj"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW7/d;

    invoke-direct {p0, p1}, Lh7/g;->N(F)F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->rint(D)D

    move-result-wide v1

    double-to-float p1, v1

    float-to-int p1, p1

    invoke-direct {p0, p2}, Lh7/g;->N(F)F

    move-result p2

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->rint(D)D

    move-result-wide v1

    double-to-float p2, v1

    float-to-int p2, p2

    invoke-direct {v0, p1, p2}, LW7/d;-><init>(II)V

    invoke-virtual {p0}, Lh7/g;->x()Ll7/h;

    move-result-object p1

    new-instance p2, Lh7/c;

    invoke-direct {p2, p0, p3}, Lh7/c;-><init>(Lh7/g;Lk7/a;)V

    invoke-interface {p1, v0, p2}, Ll7/h;->b(LW7/d;Lmh/l;)V

    return-void
.end method

.method public final P(Li7/a;)V
    .locals 0

    iput-object p1, p0, Lh7/g;->b:Li7/a;

    return-void
.end method

.method public Q(Landroid/graphics/PointF;)V
    .locals 2

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v1}, Lh7/g;->N(F)F

    move-result v1

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, p1}, Lh7/g;->N(F)F

    move-result p1

    invoke-virtual {v0, v1, p1}, Lm7/a;->z(FF)V

    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public final R(I)V
    .locals 0

    iput p1, p0, Lh7/g;->c:I

    return-void
.end method

.method public V(Lmh/a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh7/g;->h:Lmh/a;

    return-void
.end method

.method public W(Landroid/graphics/PointF;)V
    .locals 4

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->O()Ll7/b;

    move-result-object v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v1}, Lh7/g;->N(F)F

    move-result v1

    iget v2, p1, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v2}, Lh7/g;->N(F)F

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ll7/b;->h(FFZ)V

    invoke-virtual {p0}, Lh7/g;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lh7/g;->Q(Landroid/graphics/PointF;)V

    :cond_0
    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public X(F)V
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->O()Ll7/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll7/b;->j(F)V

    invoke-virtual {p0}, Lh7/g;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0, p1}, Lm7/a;->E(F)V

    :cond_0
    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method protected abstract Y(Lk7/a;Lk7/a;)V
.end method

.method public a()Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v1}, Lm7/a;->f()F

    move-result v1

    iget-object v2, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v2}, Lm7/a;->g()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lm7/a;->h()F

    move-result v0

    return v0
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->t()F

    move-result v0

    return v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lh7/g;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lh7/g;->B()Landroid/graphics/PointF;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh7/g;->Q(Landroid/graphics/PointF;)V

    :cond_0
    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public e(Landroid/graphics/PointF;)V
    .locals 2

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, p1}, Lm7/a;->z(FF)V

    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lh7/g;->e:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lh7/g;->C()F

    move-result p1

    invoke-virtual {p0, p1}, Lh7/g;->g(F)V

    :cond_0
    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public g(F)V
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0, p1}, Lm7/a;->A(F)V

    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public h(F)V
    .locals 1

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0, p1}, Lm7/a;->B(F)V

    invoke-direct {p0}, Lh7/g;->H()V

    return-void
.end method

.method public p()V
    .locals 8

    iget-object v0, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v0}, Lh7/a;->O()Ll7/b;

    move-result-object v1

    invoke-virtual {v1}, Ll7/b;->d()F

    move-result v1

    iget-object v2, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v2}, Lh7/a;->O()Ll7/b;

    move-result-object v2

    invoke-virtual {v2}, Ll7/b;->e()F

    move-result v2

    iget-object v3, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v3}, Lh7/a;->O()Ll7/b;

    move-result-object v3

    invoke-virtual {v3}, Ll7/b;->f()F

    move-result v3

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v7}, Lm7/a;->j(Lm7/a;FFFJILjava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lh7/g;->d(Z)V

    invoke-virtual {p0, v0}, Lh7/g;->f(Z)V

    return-void
.end method

.method public s()Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v1}, Lm7/a;->f()F

    move-result v1

    invoke-direct {p0, v1}, Lh7/g;->O(F)F

    move-result v1

    iget-object v2, p0, Lh7/g;->a:Lh7/a;

    invoke-virtual {v2}, Lm7/a;->g()F

    move-result v2

    invoke-direct {p0, v2}, Lh7/g;->O(F)F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lh7/g;->d:Z

    return v0
.end method

.method public final u()LFg/c;
    .locals 1

    iget-object v0, p0, Lh7/g;->f:LFg/c;

    return-object v0
.end method

.method protected abstract v()Ll7/h;
.end method

.method protected abstract w()Ll7/h;
.end method

.method protected abstract x()Ll7/h;
.end method

.method public final y()Lgg/i;
    .locals 1

    iget-object v0, p0, Lh7/g;->g:Lgg/i;

    return-object v0
.end method

.method public final z(FFF)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lh7/g$c;

    invoke-direct {v1, p0}, Lh7/g$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3, v1}, Lh7/g;->D(FFFLmh/l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/d;

    invoke-virtual {p0}, Lh7/g;->x()Ll7/h;

    move-result-object p3

    invoke-interface {p3, p2}, Ll7/h;->a(LW7/d;)Ll7/i;

    move-result-object p2

    check-cast p2, Lk7/a;

    if-eqz p2, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
