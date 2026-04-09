.class public abstract LO5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLE6/d;LE6/c;Lr/i;LT/l;II)LO5/a;
    .locals 2

    const v0, -0x3f75eefd

    invoke-interface {p4, v0}, LT/l;->e(I)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    sget-object p1, LE6/d;->Start:LE6/d;

    :cond_1
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_2

    sget-object p2, LE6/c;->a:LE6/c$a;

    invoke-virtual {p2}, LE6/c$a;->e()LE6/c;

    move-result-object p2

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    const/4 p3, 0x7

    const/4 p6, 0x0

    const/4 v1, 0x0

    invoke-static {p6, p6, v1, p3, v1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p3

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p6, -0x1

    const-string/jumbo v1, "com.patrykandpatrick.vico.compose.chart.scroll.rememberChartScrollSpec (ChartScrollSpec.kt:74)"

    invoke-static {v0, p5, p6, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    filled-new-array {p5, p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p5

    const p6, -0x21de6e89

    invoke-interface {p4, p6}, LT/l;->e(I)V

    const/4 p6, 0x0

    move v0, p6

    :goto_0
    const/4 v1, 0x4

    if-ge p6, v1, :cond_5

    aget-object v1, p5, p6

    invoke-interface {p4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    add-int/lit8 p6, p6, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez v0, :cond_6

    sget-object p6, LT/l;->a:LT/l$a;

    invoke-virtual {p6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne p5, p6, :cond_7

    :cond_6
    new-instance p5, LO5/a;

    invoke-direct {p5, p0, p1, p2, p3}, LO5/a;-><init>(ZLE6/d;LE6/c;Lr/i;)V

    invoke-interface {p4, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p4}, LT/l;->P()V

    check-cast p5, LO5/a;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface {p4}, LT/l;->P()V

    return-object p5
.end method
