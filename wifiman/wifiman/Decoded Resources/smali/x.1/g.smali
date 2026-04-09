.class public final Lx/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/C;


# instance fields
.field private final a:Lx/i;

.field private final b:Lr/z;

.field private final c:Lr/i;

.field private d:Lf0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx/i;Lr/z;Lr/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/g;->a:Lx/i;

    iput-object p2, p0, Lx/g;->b:Lr/z;

    iput-object p3, p0, Lx/g;->c:Lr/i;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->e()Lf0/g;

    move-result-object p1

    iput-object p1, p0, Lx/g;->d:Lf0/g;

    return-void
.end method

.method public static final synthetic d(Lx/g;Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lx/g;->i(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lx/g;)Lr/z;
    .locals 0

    iget-object p0, p0, Lx/g;->b:Lr/z;

    return-object p0
.end method

.method public static final synthetic f(Lx/g;)Lr/i;
    .locals 0

    iget-object p0, p0, Lx/g;->c:Lr/i;

    return-object p0
.end method

.method public static final synthetic g(Lx/g;)Lx/i;
    .locals 0

    iget-object p0, p0, Lx/g;->a:Lx/i;

    return-object p0
.end method

.method public static final synthetic h(Lx/g;Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lx/g;->l(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lx/g$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lx/g$a;

    iget v1, v0, Lx/g$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/g$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/g$a;

    invoke-direct {v0, p0, p4}, Lx/g$a;-><init>(Lx/g;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Lx/g$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/g$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lx/g$a;->a:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lmh/l;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p4, p0, Lx/g;->d:Lf0/g;

    new-instance v2, Lx/g$b;

    const/4 v9, 0x0

    move-object v4, v2

    move-object v5, p0

    move v6, p2

    move-object v7, p3

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, Lx/g$b;-><init>(Lx/g;FLmh/l;Lw/v;Ldh/e;)V

    iput-object p3, v0, Lx/g$a;->a:Ljava/lang/Object;

    iput v3, v0, Lx/g$a;->d:I

    invoke-static {p4, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lx/a;

    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p4
.end method

.method private final j(FF)Z
    .locals 2

    iget-object v0, p0, Lx/g;->b:Lr/z;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Lr/B;->a(Lr/z;FF)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final k(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 8

    invoke-direct {p0, p2, p3}, Lx/g;->j(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lx/c;

    iget-object v1, p0, Lx/g;->b:Lr/z;

    invoke-direct {v0, v1}, Lx/c;-><init>(Lr/z;)V

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lx/l;

    iget-object v1, p0, Lx/g;->c:Lr/i;

    invoke-direct {v0, v1}, Lx/l;-><init>(Lr/i;)V

    goto :goto_0

    :goto_1
    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lx/h;->d(Lw/v;FFLx/b;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p5

    instance-of v1, v0, Lx/g$d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lx/g$d;

    iget v2, v1, Lx/g$d;->c:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lx/g$d;->c:I

    move-object/from16 v8, p0

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lx/g$d;

    move-object/from16 v8, p0

    invoke-direct {v1, v8, v0}, Lx/g$d;-><init>(Lx/g;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lx/g$d;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v7, Lx/g$d;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_4

    :goto_2
    const/16 v16, 0x1c

    const/16 v17, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v9, p2

    move/from16 v10, p3

    invoke-static/range {v9 .. v17}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v0

    goto :goto_4

    :cond_4
    iput v3, v7, Lx/g$d;->c:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lx/g;->k(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    check-cast v0, Lx/a;

    invoke-virtual {v0}, Lx/a;->c()Lr/k;

    move-result-object v0

    :goto_4
    return-object v0
.end method


# virtual methods
.method public c(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lx/g$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lx/g$c;

    iget v1, v0, Lx/g$c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/g$c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/g$c;

    invoke-direct {v0, p0, p4}, Lx/g$c;-><init>(Lx/g;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Lx/g$c;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/g$c;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    iput v3, v0, Lx/g$c;->c:I

    invoke-direct {p0, p1, p2, p3, v0}, Lx/g;->i(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lx/a;

    invoke-virtual {p4}, Lx/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p4}, Lx/a;->b()Lr/k;

    move-result-object p2

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lr/k;->p()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p3

    :goto_2
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lx/g;

    iget-object v0, p1, Lx/g;->c:Lr/i;

    iget-object v2, p0, Lx/g;->c:Lr/i;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lx/g;->b:Lr/z;

    iget-object v2, p0, Lx/g;->b:Lr/z;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lx/g;->a:Lx/i;

    iget-object v0, p0, Lx/g;->a:Lx/i;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lx/g;->c:Lr/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx/g;->b:Lr/z;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx/g;->a:Lx/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
