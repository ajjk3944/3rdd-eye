.class final LN/j0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/j0;->a(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:LT/z1;

.field final synthetic c:LT/z1;


# direct methods
.method constructor <init>(LT/q0;LT/z1;LT/z1;)V
    .locals 0

    iput-object p1, p0, LN/j0$a;->a:LT/q0;

    iput-object p2, p0, LN/j0$a;->b:LT/z1;

    iput-object p3, p0, LN/j0$a;->c:LT/z1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    iget-object v0, p0, LN/j0$a;->b:LT/z1;

    invoke-static {v0}, LN/j0;->e(LT/z1;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->i(F)V

    iget-object v0, p0, LN/j0$a;->b:LT/z1;

    invoke-static {v0}, LN/j0;->e(LT/z1;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->g(F)V

    iget-object v0, p0, LN/j0$a;->c:LT/z1;

    invoke-static {v0}, LN/j0;->f(LT/z1;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->a(F)V

    iget-object v0, p0, LN/j0$a;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/f;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->y1(J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LN/j0$a;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
