.class final LCf/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCf/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCf/a$d;

    invoke-direct {v0}, LCf/a$d;-><init>()V

    sput-object v0, LCf/a$d;->a:LCf/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LCf/a$d;->c()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 12

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-4.<anonymous> (WifiNetworkDetailUi.kt:163)"

    const v4, -0x7398101

    invoke-static {v4, p2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v0, Lz/c;->a:Lz/c;

    invoke-virtual {v0}, Lz/c;->g()Lz/c$m;

    move-result-object v1

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v1, v4, p1, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {p1, v5}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {p1, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {p1, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v1, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v10, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v10}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v10, v4, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v10, v7, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    const/16 v1, 0x10

    int-to-float v10, v1

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v11, 0x6

    invoke-static {v1, p1, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    invoke-static {v8, v1, v4, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v0}, Lz/c;->f()Lz/c$e;

    move-result-object v0

    invoke-virtual {v3}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v3

    invoke-static {v0, v3, p1, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {p1, v5}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface {p1}, LT/l;->I()V

    :goto_2
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v5, v0, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v5, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v5, v1, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    invoke-static {v8, v6, p1, v11, v2}, LAf/A;->b(Landroidx/compose/ui/e;LS8/c;LT/l;II)V

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const v0, -0x2867a2d2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_b

    new-instance v0, LCf/b;

    invoke-direct {v0}, LCf/b;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    sget-object v2, LCf/a;->a:LCf/a;

    invoke-virtual {v2}, LCf/a;->c()Lmh/p;

    move-result-object v4

    const/16 v6, 0x6036

    const/16 v7, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p1, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v0, 0xa4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p1, v11}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LCf/a$d;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
