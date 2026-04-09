.class final Lhf/J$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf/J;->l(Landroidx/compose/ui/e;Lhf/t$c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lhf/t$c;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lhf/t$c;)V
    .locals 0

    iput-object p1, p0, Lhf/J$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lhf/J$a;->b:Lhf/t$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lhf/J$a;->i(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz/f;Lhf/t$c;LC0/U;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhf/J$a;->h(Lz/f;Lhf/t$c;LC0/U;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lhf/J$a;->k(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lhf/J$a;->j(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lz/f;Lhf/t$c;LC0/U;LY0/b;)LC0/D;
    .locals 11

    const-string p3, "$this$SubcomposeLayout"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lhf/J$a$a;

    invoke-direct {p3, p1}, Lhf/J$a$a;-><init>(Lhf/t$c;)V

    const v0, -0x1181c949

    const/4 v1, 0x1

    invoke-static {v0, v1, p3}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p3

    const-string v0, "line1"

    invoke-interface {p2, v0, p3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LC0/B;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {p3, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p3

    new-instance v2, Lhf/J$a$c;

    invoke-direct {v2, p1}, Lhf/J$a$c;-><init>(Lhf/t$c;)V

    const v3, 0x28570be0

    invoke-static {v3, v1, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v2

    const-string v3, "line2"

    invoke-interface {p2, v3, v2}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/B;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-interface {p0}, Lz/f;->b()F

    move-result v3

    invoke-virtual {p3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    invoke-interface {p2, v4}, LY0/d;->x(I)F

    move-result v4

    invoke-static {v3, v4}, LY0/h;->h(FF)I

    move-result v3

    if-ltz v3, :cond_0

    invoke-virtual {p3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v5

    invoke-virtual {p3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v6

    new-instance v8, Lhf/G;

    invoke-direct {v8, p3}, Lhf/G;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p2

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lz/f;->b()F

    move-result p0

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p3

    invoke-interface {p2, p3}, LY0/d;->x(I)F

    move-result p3

    invoke-static {p0, p3}, LY0/h;->h(FF)I

    move-result p0

    if-ltz p0, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v5

    new-instance v7, Lhf/H;

    invoke-direct {v7, v2}, Lhf/H;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance p0, Lhf/J$a$b;

    invoke-direct {p0, p1}, Lhf/J$a$b;-><init>(Lhf/t$c;)V

    const p1, -0x7ef8a92f

    invoke-static {p1, v1, p0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    const-string p1, "line3"

    invoke-interface {p2, p1, p0}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC0/B;

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Lhf/I;

    invoke-direct {v4, p0}, Lhf/I;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Lz/f;LT/l;I)V
    .locals 5

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed.<anonymous> (SpeedtestTopology.kt:359)"

    const v3, -0xb5ecbfa

    invoke-static {v3, p3, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lhf/J$a;->a:Landroidx/compose/ui/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const v2, 0x1382bd62

    invoke-interface {p2, v2}, LT/l;->U(I)V

    iget-object v2, p0, Lhf/J$a;->b:Lhf/t$c;

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 p3, p3, 0xe

    const/4 v3, 0x0

    if-ne p3, v1, :cond_5

    goto :goto_2

    :cond_5
    move v4, v3

    :goto_2
    or-int p3, v2, v4

    iget-object v1, p0, Lhf/J$a;->b:Lhf/t$c;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_6

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v2, p3, :cond_7

    :cond_6
    new-instance v2, Lhf/F;

    invoke-direct {v2, p1, v1}, Lhf/F;-><init>(Lz/f;Lhf/t$c;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v0, v2, p2, v3, v3}, Landroidx/compose/ui/layout/w;->a(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lhf/J$a;->f(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
