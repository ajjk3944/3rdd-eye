.class final LN/L0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->e(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/L0$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/L0$i;

    invoke-direct {v0}, LN/L0$i;-><init>()V

    sput-object v0, LN/L0$i;->a:LN/L0$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 15

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    move v5, v2

    move v6, v5

    move v4, v3

    move v7, v4

    :goto_0
    if-ge v4, v1, :cond_4

    move-object/from16 v8, p2

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LC0/B;

    move-wide/from16 v10, p3

    invoke-interface {v9, v10, v11}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v12

    invoke-interface {v9, v12}, LC0/E;->X(LC0/a;)I

    move-result v12

    if-eq v12, v2, :cond_1

    if-eq v5, v2, :cond_0

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v12

    invoke-interface {v9, v12}, LC0/E;->X(LC0/a;)I

    move-result v12

    if-ge v12, v5, :cond_1

    :cond_0
    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v5

    invoke-interface {v9, v5}, LC0/E;->X(LC0/a;)I

    move-result v5

    :cond_1
    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v12

    invoke-interface {v9, v12}, LC0/E;->X(LC0/a;)I

    move-result v12

    if-eq v12, v2, :cond_3

    if-eq v6, v2, :cond_2

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v12

    invoke-interface {v9, v12}, LC0/E;->X(LC0/a;)I

    move-result v12

    if-le v12, v6, :cond_3

    :cond_2
    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v6

    invoke-interface {v9, v6}, LC0/E;->X(LC0/a;)I

    move-result v6

    :cond_3
    invoke-virtual {v9}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    move-wide/from16 v10, p3

    if-eq v5, v2, :cond_5

    if-eq v6, v2, :cond_5

    const/4 v3, 0x1

    :cond_5
    if-eq v5, v6, :cond_7

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {}, LN/L0;->k()F

    move-result v1

    :goto_1
    move-object/from16 v2, p1

    goto :goto_3

    :cond_7
    :goto_2
    invoke-static {}, LN/L0;->j()F

    move-result v1

    goto :goto_1

    :goto_3
    invoke-interface {v2, v1}, LY0/d;->x1(F)I

    move-result v1

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v9

    new-instance v12, LN/L0$i$a;

    invoke-direct {v12, v0, v1}, LN/L0$i$a;-><init>(Ljava/util/ArrayList;I)V

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, p1

    move v10, v1

    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method
