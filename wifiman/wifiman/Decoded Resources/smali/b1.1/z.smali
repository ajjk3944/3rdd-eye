.class public Lb1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/b$b;
.implements Lb1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/z$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Lj1/f;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Lb1/B;

.field private final g:[I

.field private final h:[I

.field private i:F

.field private j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lb1/z;->a:Ljava/lang/String;

    new-instance v0, Lj1/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lj1/f;-><init>(II)V

    invoke-virtual {v0, p0}, Lj1/f;->D1(Lk1/b$b;)V

    iput-object v0, p0, Lb1/z;->b:Lj1/f;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/z;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/z;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/z;->e:Ljava/util/Map;

    new-instance v0, Lb1/B;

    invoke-direct {v0, p1}, Lb1/B;-><init>(LY0/d;)V

    iput-object v0, p0, Lb1/z;->f:Lb1/B;

    const/4 p1, 0x2

    new-array v0, p1, [I

    iput-object v0, p0, Lb1/z;->g:[I

    new-array p1, p1, [I

    iput-object p1, p0, Lb1/z;->h:[I

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lb1/z;->i:F

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb1/z;->j:Ljava/util/ArrayList;

    return-void
.end method

.method private final e([Ljava/lang/Integer;Lk1/b$a;)V
    .locals 2

    iget v0, p2, Lk1/b$a;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget v0, p2, Lk1/b$a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    iget p2, p2, Lk1/b$a;->g:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x2

    aput-object p2, p1, v0

    return-void
.end method

.method private final f(Lj1/e;J)J
    .locals 5

    invoke-virtual {p1}, Lj1/e;->p()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lj1/e;->o:Ljava/lang/String;

    instance-of v2, p1, Lj1/l;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-static {p2, p3}, LY0/b;->j(J)Z

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {p2, p3}, LY0/b;->i(J)Z

    move-result v4

    if-eqz v4, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    invoke-static {p2, p3}, LY0/b;->g(J)Z

    move-result v2

    if-eqz v2, :cond_3

    move v3, v1

    :cond_3
    :goto_1
    check-cast p1, Lj1/l;

    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result v1

    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    invoke-virtual {p1, v0, v1, v3, p2}, Lj1/l;->k1(IIII)V

    invoke-virtual {p1}, Lj1/l;->f1()I

    move-result p2

    invoke-virtual {p1}, Lj1/l;->e1()I

    move-result p1

    invoke-static {p2, p1}, Lo/j;->b(II)J

    move-result-wide p1

    goto :goto_2

    :cond_4
    instance-of p1, v0, LC0/B;

    if-eqz p1, :cond_5

    move-object p1, v0

    check-cast p1, LC0/B;

    invoke-interface {p1, p2, p3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p1

    iget-object p2, p0, Lb1/z;->c:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p2

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p1

    invoke-static {p2, p1}, Lo/j;->b(II)J

    move-result-wide p1

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Nothing to measure for widget: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CCL"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3, v3}, Lo/j;->b(II)J

    move-result-wide p1

    :goto_2
    return-wide p1
.end method

.method private final g(Lj1/e$b;IIIZZI[I)Z
    .locals 4

    sget-object v0, Lb1/z$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_a

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 p2, 0x4

    if-ne v0, p2, :cond_1

    aput p7, p8, v2

    aput p7, p8, v1

    :cond_0
    :goto_0
    move v1, v2

    goto/16 :goto_5

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {}, Lb1/j;->a()Z

    move-result p1

    const-string v0, "CCL"

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Measure strategy "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DW "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ODR "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IRH "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    if-nez p6, :cond_6

    sget p1, Lk1/b$a;->l:I

    if-eq p4, p1, :cond_4

    sget p1, Lk1/b$a;->m:I

    if-ne p4, p1, :cond_5

    :cond_4
    sget p1, Lk1/b$a;->m:I

    if-eq p4, p1, :cond_6

    if-ne p3, v1, :cond_6

    if-eqz p5, :cond_5

    goto :goto_1

    :cond_5
    move p1, v2

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v1

    :goto_2
    invoke-static {}, Lb1/j;->a()Z

    move-result p3

    if-eqz p3, :cond_7

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "UD "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    if-eqz p1, :cond_8

    move p3, p2

    goto :goto_3

    :cond_8
    move p3, v2

    :goto_3
    aput p3, p8, v2

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    move p2, p7

    :goto_4
    aput p2, p8, v1

    if-nez p1, :cond_0

    goto :goto_5

    :cond_a
    aput v2, p8, v2

    aput p7, p8, v1

    goto :goto_5

    :cond_b
    aput p2, p8, v2

    aput p2, p8, v1

    goto/16 :goto_0

    :goto_5
    return v1
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lj1/e;Lk1/b$a;)V
    .locals 19

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    iget-object v12, v10, Lj1/e;->o:Ljava/lang/String;

    invoke-static {}, Lb1/j;->a()Z

    move-result v0

    const-string v13, "Measuring "

    const-string v14, "CCL"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p1}, Lb1/j;->b(Lj1/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v9, Lb1/z;->d:Ljava/util/Map;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, [Ljava/lang/Integer;

    iget-object v1, v11, Lk1/b$a;->a:Lj1/e$b;

    iget v2, v11, Lk1/b$a;->c:I

    iget v3, v10, Lj1/e;->w:I

    iget v4, v11, Lk1/b$a;->j:I

    const/16 v16, 0x1

    const/4 v8, 0x0

    if-eqz v15, :cond_1

    aget-object v0, v15, v16

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v8

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lj1/e;->u()I

    move-result v5

    if-ne v0, v5, :cond_2

    move/from16 v5, v16

    goto :goto_1

    :cond_2
    move v5, v8

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lj1/e;->e0()Z

    move-result v6

    iget-object v0, v9, Lb1/z;->f:Lb1/B;

    invoke-virtual {v0}, Lb1/B;->F()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, LY0/b;->l(J)I

    move-result v7

    iget-object v0, v9, Lb1/z;->g:[I

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    move-object/from16 v18, v14

    move v14, v8

    move-object/from16 v8, v17

    invoke-direct/range {v0 .. v8}, Lb1/z;->g(Lj1/e$b;IIIZZI[I)Z

    iget-object v1, v11, Lk1/b$a;->b:Lj1/e$b;

    iget v2, v11, Lk1/b$a;->d:I

    iget v3, v10, Lj1/e;->x:I

    iget v4, v11, Lk1/b$a;->j:I

    if-eqz v15, :cond_3

    aget-object v0, v15, v14

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_2

    :cond_3
    move v8, v14

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lj1/e;->O()I

    move-result v0

    if-ne v8, v0, :cond_4

    move/from16 v5, v16

    goto :goto_3

    :cond_4
    move v5, v14

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lj1/e;->f0()Z

    move-result v6

    iget-object v0, v9, Lb1/z;->f:Lb1/B;

    invoke-virtual {v0}, Lb1/B;->F()J

    move-result-wide v7

    invoke-static {v7, v8}, LY0/b;->k(J)I

    move-result v7

    iget-object v8, v9, Lb1/z;->h:[I

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v8}, Lb1/z;->g(Lj1/e$b;IIIZZI[I)Z

    iget-object v0, v9, Lb1/z;->g:[I

    aget v1, v0, v14

    aget v0, v0, v16

    iget-object v2, v9, Lb1/z;->h:[I

    aget v3, v2, v14

    aget v2, v2, v16

    invoke-static {v1, v0, v3, v2}, LY0/c;->a(IIII)J

    move-result-wide v0

    iget v2, v11, Lk1/b$a;->j:I

    sget v3, Lk1/b$a;->l:I

    if-eq v2, v3, :cond_5

    sget v3, Lk1/b$a;->m:I

    if-eq v2, v3, :cond_5

    iget-object v2, v11, Lk1/b$a;->a:Lj1/e$b;

    sget-object v3, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    if-ne v2, v3, :cond_5

    iget v2, v10, Lj1/e;->w:I

    if-nez v2, :cond_5

    iget-object v2, v11, Lk1/b$a;->b:Lj1/e$b;

    if-ne v2, v3, :cond_5

    iget v2, v10, Lj1/e;->x:I

    if-eqz v2, :cond_f

    :cond_5
    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    const-string v3, " with "

    if-eqz v2, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v18

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_6
    move-object/from16 v4, v18

    :goto_4
    invoke-direct {v9, v10, v0, v1}, Lb1/z;->f(Lj1/e;J)J

    move-result-wide v5

    invoke-virtual {v10, v14}, Lj1/e;->J0(Z)V

    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " is size "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lo/j;->e(J)I

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v5, v6}, Lo/j;->f(J)I

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-static {v5, v6}, Lo/j;->e(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v7, v10, Lj1/e;->z:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v8

    const/4 v13, 0x0

    if-lez v8, :cond_8

    goto :goto_5

    :cond_8
    move-object v7, v13

    :goto_5
    iget v8, v10, Lj1/e;->A:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v15

    if-lez v15, :cond_9

    goto :goto_6

    :cond_9
    move-object v8, v13

    :goto_6
    invoke-static {v2, v7, v8}, Lsh/m;->n(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v5, v6}, Lo/j;->f(J)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v8, v10, Lj1/e;->C:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v15

    if-lez v15, :cond_a

    goto :goto_7

    :cond_a
    move-object v8, v13

    :goto_7
    iget v15, v10, Lj1/e;->D:I

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v17

    if-lez v17, :cond_b

    move-object v13, v15

    :cond_b
    invoke-static {v7, v8, v13}, Lsh/m;->n(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v5, v6}, Lo/j;->e(J)I

    move-result v8

    if-eq v2, v8, :cond_c

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v8

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v0

    invoke-static {v2, v2, v8, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    move/from16 v8, v16

    goto :goto_8

    :cond_c
    move v8, v14

    :goto_8
    invoke-static {v5, v6}, Lo/j;->f(J)I

    move-result v2

    if-eq v7, v2, :cond_d

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v0

    invoke-static {v2, v0, v7, v7}, LY0/c;->a(IIII)J

    move-result-wide v0

    move/from16 v8, v16

    :cond_d
    if-eqz v8, :cond_f

    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Remeasuring coerced "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    invoke-direct {v9, v10, v0, v1}, Lb1/z;->f(Lj1/e;J)J

    invoke-virtual {v10, v14}, Lj1/e;->J0(Z)V

    :cond_f
    iget-object v0, v9, Lb1/z;->c:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lj1/e;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/t;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    goto :goto_9

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lj1/e;->O()I

    move-result v1

    :goto_9
    iput v1, v11, Lk1/b$a;->e:I

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    goto :goto_a

    :cond_11
    invoke-virtual/range {p1 .. p1}, Lj1/e;->u()I

    move-result v1

    :goto_a
    iput v1, v11, Lk1/b$a;->f:I

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_12

    iget-object v2, v9, Lb1/z;->f:Lb1/B;

    invoke-virtual {v2, v10}, Lg1/g;->q(Lj1/e;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v2

    invoke-interface {v0, v2}, LC0/E;->X(LC0/a;)I

    move-result v0

    goto :goto_b

    :cond_12
    move v0, v1

    :goto_b
    if-eq v0, v1, :cond_13

    move/from16 v8, v16

    goto :goto_c

    :cond_13
    move v8, v14

    :goto_c
    iput-boolean v8, v11, Lk1/b$a;->h:Z

    iput v0, v11, Lk1/b$a;->g:I

    iget-object v0, v9, Lb1/z;->d:Ljava/util/Map;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_14

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Integer;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v2, v3

    invoke-interface {v0, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    check-cast v2, [Ljava/lang/Integer;

    invoke-direct {v9, v2, v11}, Lb1/z;->e([Ljava/lang/Integer;Lk1/b$a;)V

    iget v0, v11, Lk1/b$a;->e:I

    iget v1, v11, Lk1/b$a;->c:I

    if-ne v0, v1, :cond_15

    iget v0, v11, Lk1/b$a;->f:I

    iget v1, v11, Lk1/b$a;->d:I

    if-eq v0, v1, :cond_16

    :cond_15
    move/from16 v14, v16

    :cond_16
    iput-boolean v14, v11, Lk1/b$a;->i:Z

    return-void
.end method

.method protected final c(J)V
    .locals 2

    iget-object v0, p0, Lb1/z;->b:Lj1/f;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lj1/e;->U0(I)V

    iget-object v0, p0, Lb1/z;->b:Lj1/f;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    invoke-virtual {v0, p1}, Lj1/e;->z0(I)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lb1/z;->i:F

    return-void
.end method

.method public d()V
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  root: {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "interpolated: { left:  0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  top:  0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "  right:   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v2}, Lj1/e;->O()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " ,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  bottom:  "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v3}, Lj1/e;->u()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " } }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1}, Lj1/m;->c1()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, " }"

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/e;

    invoke-virtual {v2}, Lj1/e;->p()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, LC0/B;

    const-string v6, "}, "

    const-string v7, ": {"

    const/16 v8, 0x20

    if-nez v5, :cond_2

    instance-of v4, v2, Lj1/h;

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v5, v2, Lj1/e;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v2, Lj1/h;

    invoke-virtual {v2}, Lj1/h;->b1()I

    move-result v4

    if-nez v4, :cond_1

    const-string v4, " type: \'hGuideline\', "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v4, " type: \'vGuideline\', "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v4, " interpolated: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " { left: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lj1/e;->P()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", top: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lj1/e;->Q()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", right: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lj1/e;->P()I

    move-result v5

    invoke-virtual {v2}, Lj1/e;->O()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", bottom: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lj1/e;->Q()I

    move-result v5

    invoke-virtual {v2}, Lj1/e;->u()I

    move-result v2

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_2
    iget-object v3, v2, Lj1/e;->o:Ljava/lang/String;

    const/4 v5, 0x0

    if-nez v3, :cond_5

    move-object v3, v4

    check-cast v3, LC0/B;

    invoke-static {v3}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3

    invoke-static {v3}, Lb1/m;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v9

    :cond_3
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v5

    :goto_2
    iput-object v3, v2, Lj1/e;->o:Ljava/lang/String;

    :cond_5
    iget-object v3, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h;

    if-eqz v3, :cond_6

    iget-object v3, v3, Lg1/h;->a:Lj1/e;

    if-eqz v3, :cond_6

    iget-object v5, v3, Lj1/e;->n:Lg1/h;

    :cond_6
    if-nez v5, :cond_7

    goto/16 :goto_0

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lj1/e;->o:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " interpolated : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v5, v0, v2}, Lg1/h;->e(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lb1/z;->a:Ljava/lang/String;

    return-void
.end method

.method public final h(Landroidx/compose/ui/layout/t$a;Ljava/util/List;)V
    .locals 12

    iget-object v0, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v0}, Lj1/m;->c1()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj1/e;

    invoke-virtual {v4}, Lj1/e;->p()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, LC0/B;

    if-eqz v6, :cond_0

    new-instance v6, Lg1/h;

    iget-object v4, v4, Lj1/e;->n:Lg1/h;

    invoke-virtual {v4}, Lg1/h;->j()Lg1/h;

    move-result-object v4

    invoke-direct {v6, v4}, Lg1/h;-><init>(Lg1/h;)V

    iget-object v4, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_9

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/B;

    iget-object v3, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LC0/B;

    invoke-static {v5}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v5}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    check-cast v4, LC0/B;

    if-nez v4, :cond_5

    goto :goto_3

    :cond_4
    move-object v4, v2

    :cond_5
    iget-object v3, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lg1/h;

    if-nez v7, :cond_6

    return-void

    :cond_6
    iget-object v3, p0, Lb1/z;->c:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/compose/ui/layout/t;

    if-nez v6, :cond_7

    return-void

    :cond_7
    iget-object v3, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    sget-object v3, LY0/b;->b:LY0/b$a;

    invoke-virtual {v6}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    invoke-virtual {v6}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v5

    invoke-virtual {v3, v4, v5}, LY0/b$a;->c(II)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v11}, Lb1/j;->f(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;Lg1/h;JILjava/lang/Object;)V

    goto :goto_3

    :cond_8
    const/4 v10, 0x4

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v11}, Lb1/j;->f(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;Lg1/h;JILjava/lang/Object;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_9
    sget-object p1, Lb1/w;->BOUNDS:Lb1/w;

    if-nez p1, :cond_a

    invoke-virtual {p0}, Lb1/z;->d()V

    :cond_a
    return-void
.end method

.method public final i(JLY0/t;Lb1/n;Ljava/util/List;I)J
    .locals 13

    move-object v0, p0

    move-object/from16 v1, p5

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p1, p2}, LY0/b;->m(J)I

    move-result v2

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    return-wide v1

    :cond_0
    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    invoke-static {p1, p2}, LY0/b;->j(J)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v3

    invoke-static {v3}, Lg1/d;->b(I)Lg1/d;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {}, Lg1/d;->h()Lg1/d;

    move-result-object v3

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result v4

    invoke-virtual {v3, v4}, Lg1/d;->n(I)Lg1/d;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Lg1/g;->C(Lg1/d;)Lg1/g;

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    invoke-static {p1, p2}, LY0/b;->i(J)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v3

    invoke-static {v3}, Lg1/d;->b(I)Lg1/d;

    move-result-object v3

    goto :goto_1

    :cond_2
    invoke-static {}, Lg1/d;->h()Lg1/d;

    move-result-object v3

    invoke-static {p1, p2}, LY0/b;->m(J)I

    move-result v4

    invoke-virtual {v3, v4}, Lg1/d;->n(I)Lg1/d;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Lg1/g;->m(Lg1/d;)Lg1/g;

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    iget-object v2, v2, Lg1/g;->f:Lg1/a;

    invoke-virtual {v2}, Lg1/a;->E()Lg1/d;

    move-result-object v2

    iget-object v3, v0, Lb1/z;->f:Lb1/B;

    iget-object v4, v0, Lb1/z;->b:Lj1/f;

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lg1/d;->a(Lg1/g;Lj1/e;I)V

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    iget-object v2, v2, Lg1/g;->f:Lg1/a;

    invoke-virtual {v2}, Lg1/a;->C()Lg1/d;

    move-result-object v2

    iget-object v3, v0, Lb1/z;->f:Lb1/B;

    iget-object v4, v0, Lb1/z;->b:Lj1/f;

    const/4 v6, 0x1

    invoke-virtual {v2, v3, v4, v6}, Lg1/d;->a(Lg1/g;Lj1/e;I)V

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    move-wide v3, p1

    invoke-virtual {v2, p1, p2}, Lb1/B;->G(J)V

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    sget-object v7, LY0/t;->Rtl:LY0/t;

    move-object/from16 v8, p3

    if-ne v8, v7, :cond_3

    goto :goto_2

    :cond_3
    move v6, v5

    :goto_2
    invoke-virtual {v2, v6}, Lg1/g;->x(Z)V

    invoke-virtual {p0}, Lb1/z;->j()V

    invoke-interface/range {p4 .. p5}, Lb1/n;->a(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    invoke-virtual {v2}, Lg1/g;->u()V

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    move-object/from16 v6, p4

    invoke-interface {v6, v2, v1}, Lb1/n;->e(Lb1/B;Ljava/util/List;)V

    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    invoke-static {v2, v1}, Lb1/j;->c(Lb1/B;Ljava/util/List;)V

    iget-object v1, v0, Lb1/z;->f:Lb1/B;

    iget-object v2, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1, v2}, Lg1/g;->a(Lj1/f;)V

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lb1/z;->f:Lb1/B;

    invoke-static {v2, v1}, Lb1/j;->c(Lb1/B;Ljava/util/List;)V

    :goto_3
    invoke-virtual {p0, p1, p2}, Lb1/z;->c(J)V

    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1}, Lj1/f;->H1()V

    invoke-static {}, Lb1/j;->a()Z

    move-result v1

    const-string v2, "CCL"

    if-eqz v1, :cond_9

    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    const-string v6, "ConstraintLayout"

    invoke-virtual {v1, v6}, Lj1/e;->q0(Ljava/lang/String;)V

    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1}, Lj1/m;->c1()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    move v7, v5

    :goto_4
    if-ge v7, v6, :cond_8

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj1/e;

    invoke-virtual {v8}, Lj1/e;->p()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, LC0/B;

    if-eqz v10, :cond_5

    check-cast v9, LC0/B;

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :goto_5
    if-eqz v9, :cond_6

    invoke-static {v9}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    :cond_6
    const-string v9, "NOTAG"

    :cond_7
    invoke-virtual {v8, v9}, Lj1/e;->q0(Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ConstraintLayout is asked to measure with "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    invoke-static {v1}, Lb1/j;->b(Lj1/e;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1}, Lj1/m;->c1()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_6
    if-ge v5, v3, :cond_9

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj1/e;

    invoke-static {v4}, Lb1/j;->b(Lj1/e;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    move/from16 v3, p6

    invoke-virtual {v1, v3}, Lj1/f;->E1(I)V

    iget-object v3, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v3}, Lj1/f;->u1()I

    move-result v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v3 .. v12}, Lj1/f;->z1(IIIIIIIII)J

    invoke-static {}, Lb1/j;->a()Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ConstraintLayout is at the end "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v3}, Lj1/e;->O()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v3}, Lj1/e;->u()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-object v1, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v1}, Lj1/e;->O()I

    move-result v1

    iget-object v2, v0, Lb1/z;->b:Lj1/f;

    invoke-virtual {v2}, Lj1/e;->u()I

    move-result v2

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    return-wide v1
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lb1/z;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lb1/z;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lb1/z;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
