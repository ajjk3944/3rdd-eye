.class public abstract Lvf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;LT/l;II)Lvf/e;
    .locals 8

    const-string v0, "str"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1ce33849

    invoke-interface {p5, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_0

    sget-object p1, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p1, p5, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->j()J

    move-result-wide p1

    :cond_0
    move-wide v3, p1

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->s()LT/H0;

    move-result-object p1

    invoke-interface {p5, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object p3, p1

    check-cast p3, Landroidx/compose/ui/platform/t1;

    :cond_1
    move-object v5, p3

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    invoke-interface {p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    sget-object p1, Ldh/j;->a:Ldh/j;

    invoke-static {p1, p5}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object p1

    new-instance p2, LT/A;

    invoke-direct {p2, p1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p5, p2}, LT/l;->K(Ljava/lang/Object;)V

    move-object p1, p2

    :cond_2
    check-cast p1, LT/A;

    invoke-virtual {p1}, LT/A;->a()LIi/N;

    move-result-object p4

    :cond_3
    move-object v6, p4

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, -0x1

    const-string p2, "com.ui.wifiman.ui.util.rememberHyperlinkTextHighlighter (HyperlinkTextHighlighter.kt:227)"

    invoke-static {v0, p6, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const p1, 0x738a0e0d

    invoke-interface {p5, p1}, LT/l;->U(I)V

    and-int/lit8 p1, p6, 0xe

    xor-int/lit8 p1, p1, 0x6

    const/4 p2, 0x0

    const/4 p3, 0x1

    const/4 p4, 0x4

    if-le p1, p4, :cond_5

    invoke-interface {p5, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :cond_5
    and-int/lit8 p1, p6, 0x6

    if-ne p1, p4, :cond_7

    :cond_6
    move p1, p3

    goto :goto_0

    :cond_7
    move p1, p2

    :goto_0
    and-int/lit8 p4, p6, 0x70

    xor-int/lit8 p4, p4, 0x30

    const/16 p7, 0x20

    if-le p4, p7, :cond_8

    invoke-interface {p5, v3, v4}, LT/l;->j(J)Z

    move-result p4

    if-nez p4, :cond_9

    :cond_8
    and-int/lit8 p4, p6, 0x30

    if-ne p4, p7, :cond_a

    :cond_9
    move p2, p3

    :cond_a
    or-int/2addr p1, p2

    invoke-interface {p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_b

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_c

    :cond_b
    new-instance p2, Lvf/e;

    const/4 v7, 0x0

    move-object v1, p2

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lvf/e;-><init>(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p5, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast p2, Lvf/e;

    invoke-interface {p5}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    invoke-interface {p5}, LT/l;->J()V

    return-object p2
.end method
