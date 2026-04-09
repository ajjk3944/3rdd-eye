.class public final Landroidx/compose/foundation/text/modifiers/a;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/r;
.implements LE0/t;


# instance fields
.field private p:LL/g;

.field private q:Lmh/l;

.field private final r:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)V
    .locals 18

    move-object/from16 v0, p0

    .line 4
    invoke-direct/range {p0 .. p0}, LE0/m;-><init>()V

    move-object/from16 v1, p13

    .line 5
    iput-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->q:Lmh/l;

    .line 6
    new-instance v15, Landroidx/compose/foundation/text/modifiers/b;

    .line 7
    iget-object v12, v0, Landroidx/compose/foundation/text/modifiers/a;->p:LL/g;

    .line 8
    iget-object v14, v0, Landroidx/compose/foundation/text/modifiers/a;->q:Lmh/l;

    const/16 v16, 0x0

    move-object v1, v15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    .line 9
    invoke-direct/range {v1 .. v15}, Landroidx/compose/foundation/text/modifiers/b;-><init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    .line 10
    invoke-virtual {v0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/text/modifiers/b;

    iput-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    .line 11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Do not use SelectionCapableStaticTextModifier unless selectionController != null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    .line 2
    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->a()I

    move-result v1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    move v9, v3

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const v1, 0x7fffffff

    move v10, v1

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v11, v3

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    const/16 v17, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    .line 3
    invoke-direct/range {v3 .. v17}, Landroidx/compose/foundation/text/modifiers/a;-><init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Landroidx/compose/foundation/text/modifiers/a;-><init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->R2(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public B(LC0/r;)V
    .locals 0

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b;->L2(Lo0/c;)V

    return-void
.end method

.method public final J2(LL0/d;LL0/U;Ljava/util/List;IIZLQ0/k$b;ILmh/l;Lmh/l;LL/g;Lm0/y0;)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    move-object v3, p2

    move-object/from16 v2, p12

    invoke-virtual {v1, v2, p2}, Landroidx/compose/foundation/text/modifiers/b;->X2(Lm0/y0;LL0/U;)Z

    move-result v10

    iget-object v2, v0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    move-object v4, p1

    invoke-virtual {v2, p1}, Landroidx/compose/foundation/text/modifiers/b;->Z2(LL0/d;)Z

    move-result v11

    iget-object v2, v0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-virtual/range {v2 .. v9}, Landroidx/compose/foundation/text/modifiers/b;->Y2(LL0/U;Ljava/util/List;IIZLQ0/k$b;I)Z

    move-result v2

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    iget-object v4, v0, Landroidx/compose/foundation/text/modifiers/a;->q:Lmh/l;

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    invoke-virtual {v3, v5, v6, v7, v4}, Landroidx/compose/foundation/text/modifiers/b;->W2(Lmh/l;Lmh/l;LL/g;Lmh/l;)Z

    move-result v3

    invoke-virtual {v1, v10, v11, v2, v3}, Landroidx/compose/foundation/text/modifiers/b;->K2(ZZZZ)V

    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/modifiers/b;->S2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->T2(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->U2(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->r:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->Q2(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method
