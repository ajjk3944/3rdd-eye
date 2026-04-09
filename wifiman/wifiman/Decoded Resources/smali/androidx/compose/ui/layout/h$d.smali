.class public final Landroidx/compose/ui/layout/h$d;
.super LE0/G$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/h;->u(Lmh/p;)LC0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/compose/ui/layout/h;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/h;Lmh/p;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    iput-object p2, p0, Landroidx/compose/ui/layout/h$d;->c:Lmh/p;

    invoke-direct {p0, p3}, LE0/G$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 1

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/h$c;->q(LY0/t;)V

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;

    move-result-object p2

    invoke-interface {p1}, LY0/d;->getDensity()F

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/h$c;->b(F)V

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;

    move-result-object p2

    invoke-interface {p1}, LY0/l;->y()F

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/h$c;->p(F)V

    invoke-interface {p1}, LC0/o;->a1()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p1, p2}, Landroidx/compose/ui/layout/h;->r(Landroidx/compose/ui/layout/h;I)V

    iget-object p1, p0, Landroidx/compose/ui/layout/h$d;->c:Lmh/p;

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->e(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$b;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/D;

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->c(Landroidx/compose/ui/layout/h;)I

    move-result p2

    iget-object p3, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    new-instance p4, Landroidx/compose/ui/layout/h$d$a;

    invoke-direct {p4, p1, p3, p2, p1}, Landroidx/compose/ui/layout/h$d$a;-><init>(LC0/D;Landroidx/compose/ui/layout/h;ILC0/D;)V

    return-object p4

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p1, p2}, Landroidx/compose/ui/layout/h;->q(Landroidx/compose/ui/layout/h;I)V

    iget-object p1, p0, Landroidx/compose/ui/layout/h$d;->c:Lmh/p;

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/D;

    iget-object p2, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    invoke-static {p2}, Landroidx/compose/ui/layout/h;->b(Landroidx/compose/ui/layout/h;)I

    move-result p2

    iget-object p3, p0, Landroidx/compose/ui/layout/h$d;->b:Landroidx/compose/ui/layout/h;

    new-instance p4, Landroidx/compose/ui/layout/h$d$b;

    invoke-direct {p4, p1, p3, p2, p1}, Landroidx/compose/ui/layout/h$d$b;-><init>(LC0/D;Landroidx/compose/ui/layout/h;ILC0/D;)V

    return-object p4
.end method
