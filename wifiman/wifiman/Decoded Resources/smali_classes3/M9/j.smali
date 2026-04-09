.class public abstract LM9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lm0/i1;JLT/l;II)Landroidx/compose/ui/e;
    .locals 7

    const-string v0, "$this$uiCard"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1957953c

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    sget-object p1, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {p1, p4, v1}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object p1

    invoke-virtual {p1}, Loa/a;->a()LE/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_1

    sget-object p2, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p2, p4, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->e()Lma/a$e;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$e;->b()J

    move-result-wide p2

    :cond_1
    move-wide v2, p2

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, -0x1

    const-string/jumbo p3, "com.ui.core.ui.component.util.uiCard (UiCardModifier.kt:14)"

    invoke-static {v0, p5, p2, p3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {p0, p1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p4}, LT/l;->J()V

    return-object p0
.end method
