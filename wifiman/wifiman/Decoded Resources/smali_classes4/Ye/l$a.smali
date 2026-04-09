.class final LYe/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/l;->b(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYe/f;

.field final synthetic b:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(LYe/f;Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, LYe/l$a;->a:LYe/f;

    iput-object p2, p0, LYe/l$a;->b:Landroidx/compose/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUi.<anonymous> (FloorplanMapperUi.kt:16)"

    const v2, 0x54c7e091

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LYe/l$a;->a:LYe/f;

    invoke-virtual {p2}, LYe/f;->o0()LLi/N;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v1, p1, v0, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p2

    invoke-interface {p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, LYe/d;

    iget-object p2, p0, LYe/l$a;->b:Landroidx/compose/ui/e;

    const/4 v0, 0x0

    invoke-static {p2, v0, v2, v1}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance p2, LYe/l$a$a;

    iget-object v0, p0, LYe/l$a;->a:LYe/f;

    invoke-direct {p2, v0}, LYe/l$a$a;-><init>(LYe/f;)V

    const/16 v0, 0x36

    const v1, -0x24f41c99

    invoke-static {v1, v2, p2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0x6c00

    const/4 v10, 0x4

    const/4 v5, 0x0

    const-string v6, "FloorplanMapperUi"

    move-object v8, p1

    invoke-static/range {v3 .. v10}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LYe/l$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
