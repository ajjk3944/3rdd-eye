.class final LYe/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe/l$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYe/f;


# direct methods
.method constructor <init>(LYe/f;)V
    .locals 0

    iput-object p1, p0, LYe/l$a$a;->a:LYe/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYe/d;LT/l;I)V
    .locals 6

    const-string v0, "cnt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUi.<anonymous>.<anonymous> (FloorplanMapperUi.kt:22)"

    const v2, -0x24f41c99

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    instance-of p3, p1, LYe/d$a;

    if-eqz p3, :cond_5

    const p1, -0x342acc2b    # -2.7944874E7f

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LYe/l$a$a;->a:LYe/f;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, p1, p2, p3, v0}, LYe/i;->e(Landroidx/compose/ui/e;LYe/f;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p3, p1, LYe/d$b;

    if-eqz p3, :cond_7

    const p3, -0x512d347d

    invoke-interface {p2, p3}, LT/l;->U(I)V

    move-object v1, p1

    check-cast v1, LYe/d$b;

    iget-object v2, p0, LYe/l$a$a;->a:LYe/f;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LYe/n;->b(Landroidx/compose/ui/e;LYe/d$b;LYe/f;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void

    :cond_7
    const p1, -0x342ad448    # -2.794072E7f

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYe/d;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe/l$a$a;->a(LYe/d;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
