.class public abstract LG9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ls9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->z()Ls9/b;

    move-result-object v0

    new-instance v1, Ls9/b$b;

    const-string/jumbo v2, "UiSettingsWidgetInfoDefaultIcon"

    sget-object v3, LG9/h$a;->a:LG9/h$a;

    invoke-direct {v1, v2, v3}, Ls9/b$b;-><init>(Ljava/lang/String;Lmh/p;)V

    invoke-virtual {v0, v1}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v0

    sput-object v0, LG9/h;->a:Ls9/b;

    return-void
.end method

.method public static synthetic a(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LG9/h;->f(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ls9/b;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LG9/h;->g(Ls9/b;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmh/a;)Lmh/q;
    .locals 2

    const-string/jumbo v0, "onClick"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG9/h$b;

    invoke-direct {v0, p0}, LG9/h$b;-><init>(Lmh/a;)V

    const p0, -0x732fe0b

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ls9/b;Lmh/a;)Lmh/q;
    .locals 1

    const-string/jumbo v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG9/h$c;

    invoke-direct {v0, p0, p1}, LG9/h$c;-><init>(Ls9/b;Lmh/a;)V

    const p0, -0x1624db1b

    const/4 p1, 0x1

    invoke-static {p0, p1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ls9/b;Lmh/a;LT/l;II)V
    .locals 10

    const-string/jumbo v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xb6354db

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    :goto_2
    move v9, v2

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v4

    goto :goto_3

    :cond_5
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v2, v3

    goto :goto_2

    :goto_4
    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    sget-object p0, LG9/h;->a:Ls9/b;

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetInfoIcon (UiSettingsWidgetInfo.kt:33)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const v0, -0xa234acd

    invoke-interface {p2, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v9, 0x70

    if-ne v0, v4, :cond_a

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_c

    :cond_b
    new-instance v2, LG9/f;

    invoke-direct {v2, p1}, LG9/f;-><init>(Lmh/a;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v5, v2

    check-cast v5, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v7, 0x6

    const/4 v8, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LM9/i;->f(Landroidx/compose/ui/e;Ly/m;FZLmh/a;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v2

    and-int/lit8 v6, v9, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v0, LG9/g;

    invoke-direct {v0, p0, p1, p3, p4}, LG9/g;-><init>(Ls9/b;Lmh/a;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final f(Lmh/a;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Ls9/b;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LG9/h;->e(Ls9/b;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic h()Ls9/b;
    .locals 1

    sget-object v0, LG9/h;->a:Ls9/b;

    return-object v0
.end method
