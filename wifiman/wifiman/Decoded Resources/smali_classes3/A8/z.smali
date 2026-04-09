.class public final LA8/z;
.super Lh7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/z$a;,
        LA8/z$b;
    }
.end annotation


# static fields
.field public static final r:LA8/z$a;

.field public static final s:I


# instance fields
.field private final j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

.field private final k:Lgc/b;

.field private final l:LA8/r;

.field private final m:LA8/s;

.field private final n:LA8/t;

.field private o:Lmh/l;

.field private p:Lgc/b;

.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA8/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA8/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA8/z;->r:LA8/z$a;

    const/16 v0, 0x8

    sput v0, LA8/z;->s:I

    return-void
.end method

.method public constructor <init>(Lh7/a;)V
    .locals 1

    const-string/jumbo v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lh7/g;-><init>(Lh7/a;)V

    .line 2
    sget-object p1, Lgc/b;->SIGNAL:Lgc/b;

    iput-object p1, p0, LA8/z;->k:Lgc/b;

    .line 3
    new-instance v0, LA8/r;

    invoke-direct {v0}, LA8/r;-><init>()V

    iput-object v0, p0, LA8/z;->l:LA8/r;

    .line 4
    new-instance v0, LA8/s;

    invoke-direct {v0}, LA8/s;-><init>()V

    iput-object v0, p0, LA8/z;->m:LA8/s;

    .line 5
    new-instance v0, LA8/t;

    invoke-direct {v0}, LA8/t;-><init>()V

    iput-object v0, p0, LA8/z;->n:LA8/t;

    .line 6
    invoke-direct {p0, p1}, LA8/z;->o0(Lgc/b;)Lmh/l;

    move-result-object v0

    iput-object v0, p0, LA8/z;->o:Lmh/l;

    .line 7
    iput-object p1, p0, LA8/z;->p:Lgc/b;

    .line 8
    new-instance p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    const v0, 0x3dcccccd    # 0.1f

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;-><init>(F)V

    iput-object p1, p0, LA8/z;->j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    return-void
.end method

.method public constructor <init>(Lh7/a;Lcom/ui/wifiman/model/signalmapper/floorplan/b;Lcom/ubnt/mlkit/product/a;)V
    .locals 8

    const-string/jumbo v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arObjectMatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p1}, Lh7/g;-><init>(Lh7/a;)V

    .line 10
    sget-object v0, Lgc/b;->SIGNAL:Lgc/b;

    iput-object v0, p0, LA8/z;->k:Lgc/b;

    .line 11
    new-instance v1, LA8/r;

    invoke-direct {v1}, LA8/r;-><init>()V

    iput-object v1, p0, LA8/z;->l:LA8/r;

    .line 12
    new-instance v1, LA8/s;

    invoke-direct {v1}, LA8/s;-><init>()V

    iput-object v1, p0, LA8/z;->m:LA8/s;

    .line 13
    new-instance v1, LA8/t;

    invoke-direct {v1}, LA8/t;-><init>()V

    iput-object v1, p0, LA8/z;->n:LA8/t;

    .line 14
    invoke-direct {p0, v0}, LA8/z;->o0(Lgc/b;)Lmh/l;

    move-result-object v1

    iput-object v1, p0, LA8/z;->o:Lmh/l;

    .line 15
    iput-object v0, p0, LA8/z;->p:Lgc/b;

    .line 16
    iput-object p2, p0, LA8/z;->j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    .line 17
    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->d()Ljava/util/LinkedList;

    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    .line 19
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a()LW7/d;

    move-result-object v2

    invoke-virtual {v2}, LW7/d;->a()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v3

    mul-float/2addr v2, v3

    .line 20
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a()LW7/d;

    move-result-object v3

    invoke-virtual {v3}, LW7/d;->b()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v4

    mul-float/2addr v3, v4

    .line 21
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c()LS8/l;

    move-result-object v1

    .line 22
    invoke-direct {p0, v2, v3, v1}, LA8/z;->y0(FFLS8/l;)V

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c()Ljava/util/LinkedList;

    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;

    .line 25
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->a()LW7/d;

    move-result-object v2

    invoke-virtual {v2}, LW7/d;->a()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v3

    mul-float/2addr v2, v3

    .line 26
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->a()LW7/d;

    move-result-object v3

    invoke-virtual {v3}, LW7/d;->b()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v4

    mul-float/2addr v3, v4

    .line 27
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->a()LW7/d;

    move-result-object v4

    .line 28
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->b()Ljava/lang/String;

    move-result-object v5

    .line 29
    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->b()Ljava/lang/String;

    move-result-object v1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-interface {p3, v1, v6}, Lcom/ubnt/mlkit/product/a;->a(Ljava/lang/String;F)Lcom/ubnt/mlkit/product/a$b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LA8/a;->b(Lcom/ubnt/mlkit/product/a$b;)I

    move-result v1

    .line 30
    new-instance v6, Lod/f$a;

    const/16 v7, 0x24

    .line 31
    invoke-virtual {p1, v7}, Lh7/a;->L(I)I

    move-result v7

    .line 32
    invoke-direct {v6, v1, v7}, Lod/f$a;-><init>(II)V

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    .line 33
    :goto_2
    new-instance v1, Lod/f;

    invoke-direct {v1, v4, v5, v6}, Lod/f;-><init>(LW7/d;Ljava/lang/String;Lod/f$a;)V

    .line 34
    invoke-super {p0, v2, v3, v1}, Lh7/g;->K(FFLk7/a;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static synthetic Z(LS8/l;Lod/i$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LA8/z;->z0(LS8/l;Lod/i$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(LA8/z;Ljava/util/List;Lod/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LA8/z;->x0(LA8/z;Ljava/util/List;Lod/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(LA8/z;Lod/i;)I
    .locals 0

    invoke-static {p0, p1}, LA8/z;->p0(LA8/z;Lod/i;)I

    move-result p0

    return p0
.end method

.method public static synthetic c0(LA8/z;Lod/i;)I
    .locals 0

    invoke-static {p0, p1}, LA8/z;->q0(LA8/z;Lod/i;)I

    move-result p0

    return p0
.end method

.method public static synthetic d0(LA8/z;Lod/i;)I
    .locals 0

    invoke-static {p0, p1}, LA8/z;->r0(LA8/z;Lod/i;)I

    move-result p0

    return p0
.end method

.method private final e0(I)I
    .locals 3

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    const/16 v2, 0xd8

    invoke-static {v2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private final f0(LTe/W;F)I
    .locals 3

    invoke-virtual {p1, p2}, LTe/W;->a(F)LTe/X;

    move-result-object p1

    invoke-virtual {p1}, LTe/X;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/x0;->j(J)I

    move-result v0

    invoke-virtual {p1}, LTe/X;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/x0;->j(J)I

    move-result v1

    invoke-virtual {p1, p2}, LTe/X;->d(F)F

    move-result p1

    invoke-direct {p0, v0, v1, p1}, LA8/z;->g0(IIF)I

    move-result p1

    return p1
.end method

.method private final g0(IIF)I
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    const/4 v1, 0x0

    invoke-static {v1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    sub-float/2addr v0, p3

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p3

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr p1, p2

    float-to-int p1, p1

    const/16 p2, 0xff

    invoke-static {p2, v1, v2, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private final i0(Lb8/b;)I
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LUe/r;->a:LUe/r;

    invoke-virtual {v0}, LUe/r;->a()LTe/W;

    move-result-object v0

    invoke-virtual {p1}, Lb8/b;->b()I

    move-result p1

    int-to-float p1, p1

    invoke-direct {p0, v0, p1}, LA8/z;->f0(LTe/W;F)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LA8/z;->q:I

    :goto_0
    return p1
.end method

.method private final l0(LW7/f;)I
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LUe/r;->a:LUe/r;

    invoke-virtual {v0}, LUe/r;->c()LTe/W;

    move-result-object v0

    invoke-virtual {p1}, LW7/f;->b()I

    move-result p1

    int-to-float p1, p1

    invoke-direct {p0, v0, p1}, LA8/z;->f0(LTe/W;F)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LA8/z;->q:I

    :goto_0
    return p1
.end method

.method private final n0(LW7/a;)I
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LUe/r;->a:LUe/r;

    invoke-virtual {v0}, LUe/r;->b()LTe/W;

    move-result-object v0

    invoke-virtual {p1}, LW7/a;->c()F

    move-result p1

    invoke-direct {p0, v0, p1}, LA8/z;->f0(LTe/W;F)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LA8/z;->q:I

    :goto_0
    return p1
.end method

.method private final o0(Lgc/b;)Lmh/l;
    .locals 1

    sget-object v0, LA8/z$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    new-instance p1, LA8/w;

    invoke-direct {p1, p0}, LA8/w;-><init>(LA8/z;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, LA8/v;

    invoke-direct {p1, p0}, LA8/v;-><init>(LA8/z;)V

    goto :goto_0

    :cond_2
    new-instance p1, LA8/u;

    invoke-direct {p1, p0}, LA8/u;-><init>(LA8/z;)V

    :goto_0
    return-object p1
.end method

.method private static final p0(LA8/z;Lod/i;)I
    .locals 1

    const-string/jumbo v0, "tile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/i;->k()LW7/f;

    move-result-object p1

    invoke-direct {p0, p1}, LA8/z;->l0(LW7/f;)I

    move-result p1

    invoke-direct {p0, p1}, LA8/z;->e0(I)I

    move-result p0

    return p0
.end method

.method private static final q0(LA8/z;Lod/i;)I
    .locals 1

    const-string/jumbo v0, "tile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/i;->m()LW7/a;

    move-result-object p1

    invoke-direct {p0, p1}, LA8/z;->n0(LW7/a;)I

    move-result p1

    invoke-direct {p0, p1}, LA8/z;->e0(I)I

    move-result p0

    return p0
.end method

.method private static final r0(LA8/z;Lod/i;)I
    .locals 1

    const-string/jumbo v0, "tile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/i;->j()Lb8/b;

    move-result-object p1

    invoke-direct {p0, p1}, LA8/z;->i0(Lb8/b;)I

    move-result p1

    invoke-direct {p0, p1}, LA8/z;->e0(I)I

    move-result p0

    return p0
.end method

.method private final w0()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LA8/z;->h0()LA8/s;

    move-result-object v1

    new-instance v2, LA8/x;

    invoke-direct {v2, p0, v0}, LA8/x;-><init>(LA8/z;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Ll7/g;->d(Lmh/l;)V

    invoke-virtual {p0}, Lh7/g;->E()Lh7/a;

    move-result-object v1

    invoke-virtual {v1}, Lh7/a;->K()V

    invoke-virtual {p0}, Lh7/g;->E()Lh7/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh7/a;->Q(Ljava/util/List;)V

    return-void
.end method

.method private static final x0(LA8/z;Ljava/util/List;Lod/i;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LA8/z;->o:Lmh/l;

    invoke-virtual {p2, p0}, Lod/i;->p(Lmh/l;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final y0(FFLS8/l;)V
    .locals 1

    new-instance v0, LA8/y;

    invoke-direct {v0, p3}, LA8/y;-><init>(LS8/l;)V

    invoke-super {p0, p1, p2, v0}, Lh7/g;->J(FFLmh/l;)V

    return-void
.end method

.method private static final z0(LS8/l;Lod/i$a;)LYg/J;
    .locals 1

    const-string v0, "$this$onPositionChanged"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/i$a;->c()LW7/f;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lod/i$a;->c()LW7/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LW7/f;->a(LW7/f;)I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    invoke-virtual {p1, p0}, Lod/i$a;->e(LW7/f;)V

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Y(Lk7/a;Lk7/a;)V
    .locals 0

    check-cast p1, Lod/f;

    check-cast p2, Lod/f;

    invoke-virtual {p0, p1, p2}, LA8/z;->v0(Lod/f;Lod/f;)V

    return-void
.end method

.method protected h0()LA8/s;
    .locals 1

    iget-object v0, p0, LA8/z;->m:LA8/s;

    return-object v0
.end method

.method protected j0()LA8/r;
    .locals 1

    iget-object v0, p0, LA8/z;->l:LA8/r;

    return-object v0
.end method

.method protected k0()LA8/t;
    .locals 1

    iget-object v0, p0, LA8/z;->n:LA8/t;

    return-object v0
.end method

.method public final m0()Lcom/ui/wifiman/model/signalmapper/floorplan/b;
    .locals 1

    iget-object v0, p0, LA8/z;->j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    return-object v0
.end method

.method public final s0(FFLS8/l;)V
    .locals 8

    iget-object v0, p0, LA8/z;->j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lod/d$a;->b(Lod/d;FFJLS8/l;ILjava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, LA8/z;->y0(FFLS8/l;)V

    return-void
.end method

.method public t0(FFLod/f;)V
    .locals 9

    const-string/jumbo v0, "obj"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lh7/g;->K(FFLk7/a;)V

    iget-object v1, p0, LA8/z;->j:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-virtual {p3}, Lod/f;->h()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/16 v4, 0x0

    move v2, p1

    move v3, p2

    invoke-static/range {v1 .. v8}, Lod/d$a;->a(Lod/d;FFJLjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final u0(Lgc/b;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/z;->p:Lgc/b;

    invoke-direct {p0, p1}, LA8/z;->o0(Lgc/b;)Lmh/l;

    move-result-object p1

    iput-object p1, p0, LA8/z;->o:Lmh/l;

    invoke-virtual {p0}, LA8/z;->h0()LA8/s;

    move-result-object p1

    iget-object v0, p0, LA8/z;->o:Lmh/l;

    invoke-virtual {p1, v0}, LA8/s;->f(Lmh/l;)V

    invoke-direct {p0}, LA8/z;->w0()V

    return-void
.end method

.method public bridge synthetic v()Ll7/h;
    .locals 1

    invoke-virtual {p0}, LA8/z;->h0()LA8/s;

    move-result-object v0

    return-object v0
.end method

.method protected v0(Lod/f;Lod/f;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "new"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lod/f;->g()Lod/f$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lod/f;->i(Lod/f$a;)V

    invoke-virtual {p2}, Lod/f;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lod/f;->j(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic w()Ll7/h;
    .locals 1

    invoke-virtual {p0}, LA8/z;->j0()LA8/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x()Ll7/h;
    .locals 1

    invoke-virtual {p0}, LA8/z;->k0()LA8/t;

    move-result-object v0

    return-object v0
.end method
