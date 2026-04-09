.class final Lq/d$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Lr/o0;


# direct methods
.method constructor <init>(Lmh/l;Lr/o0;)V
    .locals 0

    iput-object p1, p0, Lq/d$j;->a:Lmh/l;

    iput-object p2, p0, Lq/d$j;->b:Lr/o0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->a1()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lq/d$j;->a:Lmh/l;

    iget-object p4, p0, Lq/d$j;->b:Lr/o0;

    invoke-virtual {p4}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, p4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, LY0/r;->b:LY0/r$a;

    invoke-virtual {p3}, LY0/r$a;->a()J

    move-result-wide p3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p3

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p4

    invoke-static {p3, p4}, LY0/s;->a(II)J

    move-result-wide p3

    :goto_0
    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v2

    new-instance v4, Lq/d$j$a;

    invoke-direct {v4, p2}, Lq/d$j$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/m;

    check-cast p2, LC0/B;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lq/d$j;->a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
