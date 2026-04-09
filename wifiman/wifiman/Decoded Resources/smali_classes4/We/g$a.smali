.class final LWe/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWe/g;->e(Landroidx/compose/ui/e;LWe/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LWe/c;

.field final synthetic b:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(LWe/c;Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, LWe/g$a;->a:LWe/c;

    iput-object p2, p0, LWe/g$a;->b:Landroidx/compose/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous> (FloorplanDetailUi.kt:36)"

    const v4, -0x63b68ffb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LWe/g$a;->a:LWe/c;

    invoke-virtual {v1}, LWe/c;->n0()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, p1, v2, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWe/b;

    iget-object v2, v0, LWe/g$a;->b:Landroidx/compose/ui/e;

    const/4 v5, 0x0

    invoke-static {v2, v5, v4, v3}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance v3, LWe/g$a$a;

    iget-object v5, v0, LWe/g$a;->b:Landroidx/compose/ui/e;

    iget-object v6, v0, LWe/g$a;->a:LWe/c;

    invoke-direct {v3, v5, v1, v6}, LWe/g$a$a;-><init>(Landroidx/compose/ui/e;LWe/b;LWe/c;)V

    const/16 v1, 0x36

    const v5, -0xac1b9b7

    invoke-static {v5, v4, v3, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x3e

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move-wide v5, v6

    move-object v7, v8

    move v8, v13

    move-object v10, p1

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

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

    invoke-virtual {p0, p1, p2}, LWe/g$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
