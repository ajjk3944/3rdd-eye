.class final LF/d0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0;->a(Landroidx/compose/ui/e;Ly/m;ZLmh/l;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Ly/m;


# direct methods
.method constructor <init>(Lmh/l;Ly/m;)V
    .locals 0

    iput-object p1, p0, LF/d0$a;->a:Lmh/l;

    iput-object p2, p0, LF/d0$a;->b:Ly/m;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 7

    const p1, -0x620472b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p1, Ldh/j;->a:Ldh/j;

    invoke-static {p1, p2}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object p1

    new-instance v0, LT/A;

    invoke-direct {v0, p1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_1
    check-cast p1, LT/A;

    invoke-virtual {p1}, LT/A;->a()LIi/N;

    move-result-object v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {v0, v0, p1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p1

    check-cast v2, LT/q0;

    iget-object p1, p0, LF/d0$a;->a:Lmh/l;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v4

    iget-object p1, p0, LF/d0$a;->b:Ly/m;

    iget-object v3, p0, LF/d0$a;->b:Ly/m;

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, p0, LF/d0$a;->b:Ly/m;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_3

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    :cond_3
    new-instance v6, LF/d0$a$a;

    invoke-direct {v6, v2, v5}, LF/d0$a$a;-><init>(LT/q0;Ly/m;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lmh/l;

    invoke-static {p1, v6, p2, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v6, p0, LF/d0$a;->b:Ly/m;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, LF/d0$a;->b:Ly/m;

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {p2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    iget-object v3, p0, LF/d0$a;->b:Ly/m;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_5

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v5, p3, :cond_6

    :cond_5
    new-instance p3, LF/d0$a$b;

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, LF/d0$a$b;-><init>(LIi/N;LT/q0;Ly/m;LT/z1;Ldh/e;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    move-object v5, p3

    :cond_6
    check-cast v5, Lmh/p;

    invoke-static {p1, v6, v5}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/d0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
