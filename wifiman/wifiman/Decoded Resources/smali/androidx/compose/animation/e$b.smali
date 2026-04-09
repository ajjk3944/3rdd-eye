.class final Landroidx/compose/animation/e$b;
.super Lq/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lr/o0$a;

.field private final b:LT/z1;

.field final synthetic c:Landroidx/compose/animation/e;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/e;Lr/o0$a;LT/z1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b;->c:Landroidx/compose/animation/e;

    invoke-direct {p0}, Lq/r;-><init>()V

    iput-object p2, p0, Landroidx/compose/animation/e$b;->a:Lr/o0$a;

    iput-object p3, p0, Landroidx/compose/animation/e$b;->b:LT/z1;

    return-void
.end method


# virtual methods
.method public final a()LT/z1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e$b;->b:LT/z1;

    return-object v0
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    iget-object p3, p0, Landroidx/compose/animation/e$b;->a:Lr/o0$a;

    new-instance p4, Landroidx/compose/animation/e$b$b;

    iget-object v0, p0, Landroidx/compose/animation/e$b;->c:Landroidx/compose/animation/e;

    invoke-direct {p4, v0, p0}, Landroidx/compose/animation/e$b$b;-><init>(Landroidx/compose/animation/e;Landroidx/compose/animation/e$b;)V

    new-instance v0, Landroidx/compose/animation/e$b$c;

    iget-object v1, p0, Landroidx/compose/animation/e$b;->c:Landroidx/compose/animation/e;

    invoke-direct {v0, v1}, Landroidx/compose/animation/e$b$c;-><init>(Landroidx/compose/animation/e;)V

    invoke-virtual {p3, p4, v0}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object p3

    iget-object p4, p0, Landroidx/compose/animation/e$b;->c:Landroidx/compose/animation/e;

    invoke-virtual {p4, p3}, Landroidx/compose/animation/e;->u(LT/z1;)V

    invoke-interface {p1}, LC0/o;->a1()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p3

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p4

    invoke-static {p3, p4}, LY0/s;->a(II)J

    move-result-wide p3

    goto :goto_0

    :cond_0
    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/r;

    invoke-virtual {p3}, LY0/r;->j()J

    move-result-wide p3

    :goto_0
    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v2

    new-instance v4, Landroidx/compose/animation/e$b$a;

    iget-object v0, p0, Landroidx/compose/animation/e$b;->c:Landroidx/compose/animation/e;

    invoke-direct {v4, v0, p2, p3, p4}, Landroidx/compose/animation/e$b$a;-><init>(Landroidx/compose/animation/e;Landroidx/compose/ui/layout/t;J)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
