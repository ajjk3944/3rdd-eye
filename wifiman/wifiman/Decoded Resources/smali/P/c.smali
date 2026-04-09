.class public final LP/c;
.super LP/q;
.source "SourceFile"


# instance fields
.field private final y:Lo/H;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, LP/q;-><init>(Ly/k;ZFLm0/y0;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    new-instance p1, Lo/H;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3}, Lo/H;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LP/c;->y:Lo/H;

    return-void
.end method

.method public synthetic constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LP/c;-><init>(Ly/k;ZFLm0/y0;Lmh/a;)V

    return-void
.end method

.method public static final synthetic R2(LP/c;)Lo/H;
    .locals 0

    iget-object p0, p0, LP/c;->y:Lo/H;

    return-object p0
.end method


# virtual methods
.method public I2(Ly/o$b;JF)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LP/c;->y:Lo/H;

    iget-object v3, v2, Lo/Q;->b:[Ljava/lang/Object;

    iget-object v4, v2, Lo/Q;->c:[Ljava/lang/Object;

    iget-object v2, v2, Lo/Q;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v2, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v3, v13

    aget-object v13, v4, v13

    check-cast v13, LP/h;

    check-cast v14, Ly/o$b;

    invoke-virtual {v13}, LP/h;->h()V

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual/range {p0 .. p0}, LP/q;->K2()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Ly/o$b;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->d(J)Ll0/g;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    new-instance v4, LP/h;

    invoke-virtual/range {p0 .. p0}, LP/q;->K2()Z

    move-result v5

    move/from16 v6, p4

    invoke-direct {v4, v2, v6, v5, v3}, LP/h;-><init>(Ll0/g;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, LP/c;->y:Lo/H;

    invoke-virtual {v2, v1, v4}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v5

    new-instance v8, LP/c$a;

    invoke-direct {v8, v4, v0, v1, v3}, LP/c$a;-><init>(LP/h;LP/c;Ly/o$b;Ldh/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    invoke-static/range {p0 .. p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method public J2(Lo0/f;)V
    .locals 23

    invoke-virtual/range {p0 .. p0}, LP/q;->L2()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/g;

    invoke-virtual {v0}, LP/g;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-nez v1, :cond_0

    move-object/from16 v9, p0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v9, p0

    iget-object v1, v9, LP/c;->y:Lo/H;

    iget-object v10, v1, Lo/Q;->b:[Ljava/lang/Object;

    iget-object v11, v1, Lo/Q;->c:[Ljava/lang/Object;

    iget-object v12, v1, Lo/Q;->a:[J

    array-length v1, v12

    add-int/lit8 v13, v1, -0x2

    if-ltz v13, :cond_4

    const/4 v15, 0x0

    :goto_0
    aget-wide v1, v12, v15

    not-long v3, v1

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    and-long/2addr v3, v1

    const-wide v5, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v3, v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    sub-int v3, v15, v13

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v3, 0x8

    move-wide/from16 v16, v1

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v7, :cond_2

    const-wide/16 v1, 0xff

    and-long v1, v16, v1

    const-wide/16 v3, 0x80

    cmp-long v1, v1, v3

    if-gez v1, :cond_1

    shl-int/lit8 v1, v15, 0x3

    add-int/2addr v1, v6

    aget-object v2, v10, v1

    aget-object v1, v11, v1

    move-object v5, v1

    check-cast v5, LP/h;

    check-cast v2, Ly/o$b;

    invoke-virtual/range {p0 .. p0}, LP/q;->M2()J

    move-result-wide v1

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move v3, v0

    move-object v14, v5

    move/from16 v5, v20

    move/from16 v20, v6

    move/from16 v6, v21

    move/from16 v22, v7

    move/from16 v7, v18

    move/from16 v18, v0

    move v0, v8

    move-object/from16 v8, v19

    invoke-static/range {v1 .. v8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move-object/from16 v3, p1

    invoke-virtual {v14, v3, v1, v2}, LP/h;->e(Lo0/f;J)V

    goto :goto_2

    :cond_1
    move-object/from16 v3, p1

    move/from16 v18, v0

    move/from16 v20, v6

    move/from16 v22, v7

    move v0, v8

    :goto_2
    shr-long v16, v16, v0

    add-int/lit8 v6, v20, 0x1

    move v8, v0

    move/from16 v0, v18

    move/from16 v7, v22

    goto :goto_1

    :cond_2
    move-object/from16 v3, p1

    move/from16 v18, v0

    move v0, v8

    move v8, v7

    if-ne v8, v0, :cond_4

    goto :goto_3

    :cond_3
    move-object/from16 v3, p1

    move/from16 v18, v0

    :goto_3
    if-eq v15, v13, :cond_4

    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v18

    goto/16 :goto_0

    :cond_4
    :goto_4
    return-void
.end method

.method public P2(Ly/o$b;)V
    .locals 1

    iget-object v0, p0, LP/c;->y:Lo/H;

    invoke-virtual {v0, p1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP/h;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LP/h;->h()V

    :cond_0
    return-void
.end method

.method public o2()V
    .locals 1

    iget-object v0, p0, LP/c;->y:Lo/H;

    invoke-virtual {v0}, Lo/H;->i()V

    return-void
.end method
