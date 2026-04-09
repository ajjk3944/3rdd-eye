.class final LL9/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/q;->r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/N;

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/q;

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Lz/N;Lmh/p;Lmh/q;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LL9/q$d;->a:Lz/N;

    iput-object p2, p0, LL9/q$d;->b:Lmh/p;

    iput-object p3, p0, LL9/q$d;->c:Lmh/q;

    iput-object p4, p0, LL9/q$d;->d:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "$this$AppBar"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v2, 0x10

    if-ne p1, v2, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.toolbar.UiToolbarBase.<anonymous> (UiToolbarBase.kt:66)"

    const v3, 0x238313b6

    invoke-static {v3, p3, p1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LL9/q$d;->a:Lz/N;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/t;

    invoke-interface {p1, p3}, Lz/N;->a(LY0/t;)F

    move-result p1

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v2, LL9/q$d$a;

    iget-object v3, p0, LL9/q$d;->b:Lmh/p;

    invoke-direct {v2, v3}, LL9/q$d$a;-><init>(Lmh/p;)V

    const v3, 0x6bae5415

    const/16 v4, 0x36

    invoke-static {v3, v1, v2, p2, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    new-instance v3, LL9/q$d$b;

    iget-object v5, p0, LL9/q$d;->c:Lmh/q;

    invoke-direct {v3, v5}, LL9/q$d$b;-><init>(Lmh/q;)V

    const v5, -0x4cb9b58c

    invoke-static {v5, v1, v3, p2, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    new-instance v5, LL9/q$d$c;

    iget-object v6, p0, LL9/q$d;->d:Lmh/p;

    invoke-direct {v5, v6}, LL9/q$d$c;-><init>(Lmh/p;)V

    const v6, -0x521bf2d

    invoke-static {v6, v1, v5, p2, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lmh/p;

    aput-object v2, v5, v0

    aput-object v3, v5, v1

    const/4 v1, 0x2

    aput-object v4, v5, v1

    invoke-static {v5}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const v2, -0x3b2e780d

    invoke-interface {p2, v2}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->g(F)Z

    move-result v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, LL9/q$d$d;

    invoke-direct {v3, p1}, LL9/q$d$d;-><init>(F)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, LC0/G;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v1}, LC0/w;->b(Ljava/util/List;)Lmh/p;

    move-result-object p1

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    :cond_5
    invoke-static {v3}, LC0/I;->a(LC0/G;)LC0/C;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, LC0/C;

    invoke-static {p2, v0}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p2, p3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p3

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {p2, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_1
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v3, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, p3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LL9/q$d;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
