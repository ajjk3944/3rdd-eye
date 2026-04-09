.class final LYe/i$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/i$a;->a(ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, LYe/i$a$b;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:210)"

    const v2, 0x2035a7b2

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, LYe/i$a$b;->a:Z

    const/16 v0, 0x30

    if-eqz p2, :cond_3

    const p2, -0x36746306

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->x()Ls9/b;

    move-result-object v1

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->c()Lma/a$c;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$c;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v6, 0x36

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const p2, -0x3670c1a1

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->y()Ls9/b;

    move-result-object v1

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->c()Lma/a$c;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$c;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v6, 0x36

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LYe/i$a$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
