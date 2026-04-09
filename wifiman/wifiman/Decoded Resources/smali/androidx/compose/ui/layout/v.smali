.class public final Landroidx/compose/ui/layout/v;
.super LE0/G$f;
.source "SourceFile"


# static fields
.field public static final b:Landroidx/compose/ui/layout/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/v;

    invoke-direct {v0}, Landroidx/compose/ui/layout/v;-><init>()V

    sput-object v0, Landroidx/compose/ui/layout/v;->b:Landroidx/compose/ui/layout/v;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "Undefined intrinsics block and it is required"

    invoke-direct {p0, v0}, LE0/G$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 11

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v3

    sget-object v5, Landroidx/compose/ui/layout/v$a;->a:Landroidx/compose/ui/layout/v$a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LC0/B;

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-static {p3, p4, v0}, LY0/c;->i(JI)I

    move-result v2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    invoke-static {p3, p4, v0}, LY0/c;->h(JI)I

    move-result v3

    new-instance v5, Landroidx/compose/ui/layout/v$b;

    invoke-direct {v5, p2}, Landroidx/compose/ui/layout/v$b;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    move v1, v2

    move v3, v1

    :goto_1
    if-ge v2, p2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/t;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v5

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v4}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v4

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-static {p3, p4, v1}, LY0/c;->i(JI)I

    move-result v5

    invoke-static {p3, p4, v3}, LY0/c;->h(JI)I

    move-result v6

    new-instance v8, Landroidx/compose/ui/layout/v$c;

    invoke-direct {v8, v0}, Landroidx/compose/ui/layout/v$c;-><init>(Ljava/util/List;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    :goto_2
    return-object p1
.end method
