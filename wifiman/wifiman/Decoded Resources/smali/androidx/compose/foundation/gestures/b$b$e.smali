.class final Landroidx/compose/foundation/gestures/b$b$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/gestures/b;

.field final synthetic b:Lz0/d;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Lz0/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$e;->b:Lz0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;Ly0/y;J)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/b;->T2()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->L2(Landroidx/compose/foundation/gestures/b;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    const v2, 0x7fffffff

    const/4 v3, 0x6

    invoke-static {v2, v1, v1, v3, v1}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/gestures/b;->P2(Landroidx/compose/foundation/gestures/b;LKi/g;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->Q2(Landroidx/compose/foundation/gestures/b;)V

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->b:Lz0/d;

    invoke-static {v0, p1}, Lz0/e;->c(Lz0/d;Ly0/y;)V

    invoke-virtual {p2}, Ly0/y;->h()J

    move-result-wide p1

    invoke-static {p1, p2, p3, p4}, Ll0/g;->q(JJ)J

    move-result-wide p1

    iget-object p3, p0, Landroidx/compose/foundation/gestures/b$b$e;->a:Landroidx/compose/foundation/gestures/b;

    invoke-static {p3}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance p4, Landroidx/compose/foundation/gestures/a$c;

    invoke-direct {p4, p1, p2, v1}, Landroidx/compose/foundation/gestures/a$c;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, p4}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ly0/y;

    check-cast p3, Ll0/g;

    invoke-virtual {p3}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/gestures/b$b$e;->a(Ly0/y;Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
