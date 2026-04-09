.class final LB/w$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/w;->a(Lmh/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lmh/p;

.field final synthetic d:LT/z1;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;Landroidx/compose/ui/e;Lmh/p;LT/z1;)V
    .locals 0

    iput-object p1, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    iput-object p2, p0, LB/w$a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LB/w$a;->c:Lmh/p;

    iput-object p4, p0, LB/w$a;->d:LT/z1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/e;LT/l;I)V
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)"

    const v2, -0x58c04be3

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LB/w$a;->d:LT/z1;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    new-instance v0, LB/r;

    new-instance v2, LB/w$a$c;

    invoke-direct {v2, p3}, LB/w$a$c;-><init>(LT/z1;)V

    invoke-direct {v0, p1, v2}, LB/r;-><init>(Lc0/e;Lmh/a;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LB/r;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    new-instance p1, Landroidx/compose/ui/layout/x;

    new-instance p3, LB/v;

    invoke-direct {p3, v0}, LB/v;-><init>(LB/r;)V

    invoke-direct {p1, p3}, Landroidx/compose/ui/layout/x;-><init>(Landroidx/compose/ui/layout/y;)V

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/layout/x;

    iget-object p1, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    if-eqz p1, :cond_6

    const p1, 0xc3c1857

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/d;->d()LB/Q;

    move-result-object p1

    const/4 p3, 0x0

    if-nez p1, :cond_3

    const p1, 0x650ec3

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {p2, p3}, LB/S;->a(LT/l;I)LB/Q;

    move-result-object p1

    :goto_0
    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const v3, 0x650a86

    invoke-interface {p2, v3}, LT/l;->U(I)V

    goto :goto_0

    :goto_1
    iget-object v3, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    filled-new-array {v3, v0, v2, p1}, [Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_4

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_5

    :cond_4
    new-instance v6, LB/w$a$a;

    invoke-direct {v6, v5, v0, v2, p1}, LB/w$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;LB/r;Landroidx/compose/ui/layout/x;LB/Q;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lmh/l;

    invoke-static {v3, v6, p2, p3}, LT/O;->d([Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_6
    const p1, 0xc452841

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    iget-object p1, p0, LB/w$a;->b:Landroidx/compose/ui/e;

    iget-object p3, p0, LB/w$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    invoke-static {p1, p3}, Landroidx/compose/foundation/lazy/layout/e;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LB/w$a;->c:Lmh/p;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    iget-object p3, p0, LB/w$a;->c:Lmh/p;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez p1, :cond_7

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v4, p1, :cond_8

    :cond_7
    new-instance v4, LB/w$a$b;

    invoke-direct {v4, v0, p3}, LB/w$a$b;-><init>(LB/r;Lmh/p;)V

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lmh/p;

    sget v6, Landroidx/compose/ui/layout/x;->f:I

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/layout/w;->b(Landroidx/compose/ui/layout/x;Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LB/w$a;->a(Lc0/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
