.class final Landroidx/compose/foundation/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/r;
.implements LE0/h0;


# instance fields
.field private n:J

.field private o:Lm0/l0;

.field private p:F

.field private q:Lm0/i1;

.field private r:J

.field private s:LY0/t;

.field private t:Lm0/Q0;

.field private u:Lm0/i1;


# direct methods
.method private constructor <init>(JLm0/l0;FLm0/i1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-wide p1, p0, Landroidx/compose/foundation/c;->n:J

    .line 4
    iput-object p3, p0, Landroidx/compose/foundation/c;->o:Lm0/l0;

    .line 5
    iput p4, p0, Landroidx/compose/foundation/c;->p:F

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    .line 7
    sget-object p1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p1}, Ll0/m$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/c;->r:J

    return-void
.end method

.method public synthetic constructor <init>(JLm0/l0;FLm0/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/c;-><init>(JLm0/l0;FLm0/i1;)V

    return-void
.end method

.method private final D2(Lo0/c;)V
    .locals 11

    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->F2(Lo0/c;)Lm0/Q0;

    move-result-object v10

    iget-wide v0, p0, Landroidx/compose/foundation/c;->n:J

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->e()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v2, p0, Landroidx/compose/foundation/c;->n:J

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, v10

    invoke-static/range {v0 .. v9}, Lm0/R0;->d(Lo0/f;Lm0/Q0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_0
    iget-object v2, p0, Landroidx/compose/foundation/c;->o:Lm0/l0;

    if-eqz v2, :cond_1

    iget v3, p0, Landroidx/compose/foundation/c;->p:F

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, v10

    invoke-static/range {v0 .. v8}, Lm0/R0;->b(Lo0/f;Lm0/Q0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final E2(Lo0/c;)V
    .locals 27

    move-object/from16 v0, p0

    iget-wide v1, v0, Landroidx/compose/foundation/c;->n:J

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->e()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v3, v0, Landroidx/compose/foundation/c;->n:J

    const/16 v13, 0x7e

    const/4 v14, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_0
    iget-object v1, v0, Landroidx/compose/foundation/c;->o:Lm0/l0;

    if-eqz v1, :cond_1

    iget v2, v0, Landroidx/compose/foundation/c;->p:F

    const/16 v25, 0x76

    const/16 v26, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v15, p1

    move-object/from16 v16, v1

    move/from16 v21, v2

    invoke-static/range {v15 .. v26}, Lo0/f;->l0(Lo0/f;Lm0/l0;JJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final F2(Lo0/c;)Lm0/Q0;
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/compose/foundation/c;->r:J

    invoke-static {v1, v2, v3, v4}, Ll0/m;->f(JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/c;->s:LY0/t;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/c;->u:Lm0/i1;

    iget-object v2, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/c;->t:Lm0/Q0;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/foundation/c$a;

    invoke-direct {v1, v0, p0, p1}, Landroidx/compose/foundation/c$a;-><init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/c;Lo0/c;)V

    invoke-static {p0, v1}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    :goto_0
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Lm0/Q0;

    iput-object v1, p0, Landroidx/compose/foundation/c;->t:Lm0/Q0;

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/foundation/c;->r:J

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/c;->s:LY0/t;

    iget-object p1, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    iput-object p1, p0, Landroidx/compose/foundation/c;->u:Lm0/i1;

    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Lm0/Q0;

    return-object p1
.end method


# virtual methods
.method public final G2()Lm0/i1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    return-object v0
.end method

.method public final H2(Lm0/l0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c;->o:Lm0/l0;

    return-void
.end method

.method public final I1(Lm0/i1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    return-void
.end method

.method public final I2(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/c;->n:J

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/c;->q:Lm0/i1;

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->E2(Lo0/c;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->D2(Lo0/c;)V

    :goto_0
    invoke-interface {p1}, Lo0/c;->X1()V

    return-void
.end method

.method public final a(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/c;->p:F

    return-void
.end method

.method public q1()V
    .locals 2

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/c;->r:J

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/c;->s:LY0/t;

    iput-object v0, p0, Landroidx/compose/foundation/c;->t:Lm0/Q0;

    iput-object v0, p0, Landroidx/compose/foundation/c;->u:Lm0/i1;

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method
