.class public abstract LM9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LM9/i;->a:F

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;LJ0/w;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LM9/i;->i(Ljava/lang/String;LJ0/w;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk0/e;Landroidx/compose/ui/focus/o;Landroid/view/MotionEvent;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LM9/i;->e(Lk0/e;Landroidx/compose/ui/focus/o;Landroid/view/MotionEvent;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ZLJ0/w;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LM9/i;->j(Ljava/lang/String;ZLJ0/w;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Lk0/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "focusManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "focusRequester"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM9/f;

    invoke-direct {v0, p1, p2}, LM9/f;-><init>(Lk0/e;Landroidx/compose/ui/focus/o;)V

    invoke-static {p0, v0}, Ly0/I;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lk0/e;Landroidx/compose/ui/focus/o;Landroid/view/MotionEvent;)LYg/J;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p2, v0}, Lk0/e;->c(Lk0/e;ZILjava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/focus/o;->f()V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;Ly/m;FZLmh/a;LT/l;II)Landroidx/compose/ui/e;
    .locals 15

    move-object/from16 v0, p5

    const-string v1, "$this$roundedClickable"

    move-object v2, p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "onClick"

    move-object/from16 v8, p4

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x2af0bfb2

    invoke-interface {v0, v1}, LT/l;->U(I)V

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_1

    const v3, 0x4f4bb55f

    invoke-interface {v0, v3}, LT/l;->U(I)V

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_0

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v3

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_0
    check-cast v3, Ly/m;

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    goto :goto_0

    :cond_1
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_2

    sget v4, LM9/i;->a:F

    move v10, v4

    goto :goto_1

    :cond_2
    move/from16 v10, p2

    :goto_1
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    move v5, v4

    goto :goto_2

    :cond_3
    move/from16 v5, p3

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v6, "com.ui.core.ui.component.util.roundedClickable (Modifier.kt:34)"

    move/from16 v7, p6

    invoke-static {v1, v7, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v9 .. v14}, LN/A0;->f(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v4

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object/from16 v8, p4

    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    return-object v1
.end method

.method public static final g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM9/g;

    invoke-direct {v0, p1}, LM9/g;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM9/h;

    invoke-direct {v0, p1, p2}, LM9/h;-><init>(Ljava/lang/String;Z)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1, p2}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljava/lang/String;LJ0/w;)LYg/J;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, LJ0/t;->n0(LJ0/w;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p1, p0}, LJ0/u;->a(LJ0/w;Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;ZLJ0/w;)LYg/J;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p0}, LJ0/t;->n0(LJ0/w;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p2, p0}, LJ0/u;->a(LJ0/w;Z)V

    invoke-static {p2, p1}, LJ0/t;->j0(LJ0/w;Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/e;Lk0/e;)Landroidx/compose/ui/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "focusManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM9/i$a;

    invoke-direct {v0, p1}, LM9/i$a;-><init>(Lk0/e;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
