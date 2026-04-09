.class final Landroidx/compose/foundation/gestures/b$b$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/d;

.field final synthetic b:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Lz0/d;Landroidx/compose/foundation/gestures/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->a:Lz0/d;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$d;->b:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$d;->a:Lz0/d;

    invoke-static {v0, p1}, Lz0/e;->c(Lz0/d;Ly0/y;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->b:Landroidx/compose/foundation/gestures/b;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v0

    invoke-static {p1, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/w1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/w1;->f()F

    move-result p1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$d;->a:Lz0/d;

    invoke-static {p1, p1}, LY0/z;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lz0/d;->b(J)J

    move-result-wide v0

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->a:Lz0/d;

    invoke-virtual {p1}, Lz0/d;->e()V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->b:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v2, Landroidx/compose/foundation/gestures/a$d;

    invoke-static {v0, v1}, Lw/l;->f(J)J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Landroidx/compose/foundation/gestures/a$d;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v2}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/y;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/b$b$d;->a(Ly0/y;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
