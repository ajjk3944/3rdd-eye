.class final Landroidx/compose/ui/window/b$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;LT/z1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/k;

    iput-object p2, p0, Landroidx/compose/ui/window/b$j;->b:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)"

    const v2, 0x4da88f2f    # 3.534945E8f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v0, Landroidx/compose/ui/window/b$j$a;->a:Landroidx/compose/ui/window/b$j$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3, v1}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/k;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/k;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Landroidx/compose/ui/window/b$j$b;

    invoke-direct {v4, v1}, Landroidx/compose/ui/window/b$j$b;-><init>(Landroidx/compose/ui/window/k;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/l;

    invoke-static {p2, v4}, Landroidx/compose/ui/layout/q;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/window/b$j;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {v0}, Landroidx/compose/ui/window/k;->getCanCalculatePosition()Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-static {p2, v0}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p2

    new-instance v0, Landroidx/compose/ui/window/b$j$c;

    iget-object v1, p0, Landroidx/compose/ui/window/b$j;->b:LT/z1;

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/b$j$c;-><init>(LT/z1;)V

    const/16 v1, 0x36

    const v4, 0x24266c85

    invoke-static {v4, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/window/c;->a:Landroidx/compose/ui/window/c;

    invoke-static {p1, v2}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_7
    invoke-interface {p1}, LT/l;->I()V

    :goto_2
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, p2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 p2, 0x6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$j;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
