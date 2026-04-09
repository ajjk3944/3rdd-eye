.class public final LP/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ll0/g;

.field private final b:F

.field private final c:Z

.field private d:Ljava/lang/Float;

.field private e:Ll0/g;

.field private final f:Lr/a;

.field private final g:Lr/a;

.field private final h:Lr/a;

.field private final i:LIi/x;

.field private final j:LT/q0;

.field private final k:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ll0/g;FZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP/h;->a:Ll0/g;

    .line 4
    iput p2, p0, LP/h;->b:F

    .line 5
    iput-boolean p3, p0, LP/h;->c:Z

    const/4 p1, 0x0

    const/4 p2, 0x2

    const/4 p3, 0x0

    .line 6
    invoke-static {p1, p1, p2, p3}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v0

    iput-object v0, p0, LP/h;->f:Lr/a;

    .line 7
    invoke-static {p1, p1, p2, p3}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v0

    iput-object v0, p0, LP/h;->g:Lr/a;

    .line 8
    invoke-static {p1, p1, p2, p3}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object p1

    iput-object p1, p0, LP/h;->h:Lr/a;

    .line 9
    invoke-static {p3}, LIi/z;->a(LIi/y0;)LIi/x;

    move-result-object p1

    iput-object p1, p0, LP/h;->i:LIi/x;

    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p3, p2, p3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LP/h;->j:LT/q0;

    .line 11
    invoke-static {p1, p3, p2, p3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LP/h;->k:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(Ll0/g;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LP/h;-><init>(Ll0/g;FZ)V

    return-void
.end method

.method public static final synthetic a(LP/h;)Lr/a;
    .locals 0

    iget-object p0, p0, LP/h;->f:Lr/a;

    return-object p0
.end method

.method public static final synthetic b(LP/h;)Lr/a;
    .locals 0

    iget-object p0, p0, LP/h;->h:Lr/a;

    return-object p0
.end method

.method public static final synthetic c(LP/h;)Lr/a;
    .locals 0

    iget-object p0, p0, LP/h;->g:Lr/a;

    return-object p0
.end method

.method private final f(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LP/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LP/h$b;-><init>(LP/h;Ldh/e;)V

    invoke-static {v0, p1}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final g(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LP/h$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LP/h$c;-><init>(LP/h;Ldh/e;)V

    invoke-static {v0, p1}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final i()Z
    .locals 1

    iget-object v0, p0, LP/h;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 1

    iget-object v0, p0, LP/h;->j:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final k(Z)V
    .locals 1

    iget-object v0, p0, LP/h;->k:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final l(Z)V
    .locals 1

    iget-object v0, p0, LP/h;->j:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, LP/h$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LP/h$a;

    iget v1, v0, LP/h$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LP/h$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LP/h$a;

    invoke-direct {v0, p0, p1}, LP/h$a;-><init>(LP/h;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LP/h$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LP/h$a;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LP/h$a;->a:Ljava/lang/Object;

    check-cast v2, LP/h;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v2, v0, LP/h$a;->a:Ljava/lang/Object;

    check-cast v2, LP/h;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LP/h$a;->a:Ljava/lang/Object;

    iput v5, v0, LP/h$a;->d:I

    invoke-direct {p0, v0}, LP/h;->f(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    invoke-direct {v2, v5}, LP/h;->l(Z)V

    iget-object p1, v2, LP/h;->i:LIi/x;

    iput-object v2, v0, LP/h$a;->a:Ljava/lang/Object;

    iput v4, v0, LP/h$a;->d:I

    invoke-interface {p1, v0}, LIi/V;->await(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, LP/h$a;->a:Ljava/lang/Object;

    iput v3, v0, LP/h$a;->d:I

    invoke-direct {v2, v0}, LP/h;->g(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final e(Lo0/f;J)V
    .locals 19

    move-object/from16 v1, p0

    iget-object v0, v1, LP/h;->d:Ljava/lang/Float;

    if-nez v0, :cond_0

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LP/i;->b(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, v1, LP/h;->d:Ljava/lang/Float;

    :cond_0
    iget-object v0, v1, LP/h;->a:Ll0/g;

    if-nez v0, :cond_1

    invoke-interface/range {p1 .. p1}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    iput-object v0, v1, LP/h;->a:Ll0/g;

    :cond_1
    iget-object v0, v1, LP/h;->e:Ll0/g;

    if-nez v0, :cond_2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v3

    div-float/2addr v3, v2

    invoke-static {v0, v3}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    iput-object v0, v1, LP/h;->e:Ll0/g;

    :cond_2
    invoke-direct/range {p0 .. p0}, LP/h;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct/range {p0 .. p0}, LP/h;->j()Z

    move-result v0

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_3
    iget-object v0, v1, LP/h;->f:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    :goto_0
    iget-object v2, v1, LP/h;->d:Ljava/lang/Float;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget v3, v1, LP/h;->b:F

    iget-object v4, v1, LP/h;->g:Lr/a;

    invoke-virtual {v4}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v2, v3, v4}, La1/b;->b(FFF)F

    move-result v8

    iget-object v2, v1, LP/h;->a:Ll0/g;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll0/g;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    iget-object v3, v1, LP/h;->e:Ll0/g;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll0/g;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v3

    iget-object v4, v1, LP/h;->h:Lr/a;

    invoke-virtual {v4}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v2, v3, v4}, La1/b;->b(FFF)F

    move-result v2

    iget-object v3, v1, LP/h;->a:Ll0/g;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll0/g;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    iget-object v4, v1, LP/h;->e:Ll0/g;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ll0/g;->v()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->n(J)F

    move-result v4

    iget-object v5, v1, LP/h;->h:Lr/a;

    invoke-virtual {v5}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v3, v4, v5}, La1/b;->b(FFF)F

    move-result v3

    invoke-static {v2, v3}, Ll0/h;->a(FF)J

    move-result-wide v9

    invoke-static/range {p2 .. p3}, Lm0/v0;->n(J)F

    move-result v2

    mul-float v13, v2, v0

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v11, p2

    invoke-static/range {v11 .. v18}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    iget-boolean v0, v1, LP/h;->c:Z

    if-eqz v0, :cond_4

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v14

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v15

    sget-object v0, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->b()I

    move-result v16

    invoke-interface/range {p1 .. p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2}, Lo0/d;->c()J

    move-result-wide v3

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v2}, Lo0/d;->e()Lo0/h;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-interface/range {v11 .. v16}, Lo0/h;->b(FFFFI)V

    const/16 v15, 0x78

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v16}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v2, v3, v4}, Lo0/d;->f(J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Lo0/d;->d()Lm0/n0;

    move-result-object v5

    invoke-interface {v5}, Lm0/n0;->r()V

    invoke-interface {v2, v3, v4}, Lo0/d;->f(J)V

    throw v0

    :cond_4
    const/16 v15, 0x78

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v16}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final h()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LP/h;->k(Z)V

    iget-object v0, p0, LP/h;->i:LIi/x;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1}, LIi/x;->S(Ljava/lang/Object;)Z

    return-void
.end method
