.class public abstract LN/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(ZZLy/k;LN/S0;FFLT/l;I)LT/z1;
    .locals 0

    invoke-static/range {p0 .. p7}, LN/U0;->b(ZZLy/k;LN/S0;FFLT/l;I)LT/z1;

    move-result-object p0

    return-object p0
.end method

.method private static final b(ZZLy/k;LN/S0;FFLT/l;I)LT/z1;
    .locals 7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:982)"

    const v2, 0x41709f90

    invoke-static {v2, p7, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 v0, p7, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {p2, p6, v0}, Ly/f;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object v0

    and-int/lit16 v6, p7, 0x1ffe

    move-object v1, p3

    move v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p6

    invoke-interface/range {v1 .. v6}, LN/S0;->e(ZZLy/k;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {v0}, LN/U0;->c(LT/z1;)Z

    move-result p2

    if-eqz p2, :cond_1

    move v0, p4

    goto :goto_0

    :cond_1
    move v0, p5

    :goto_0
    const/4 p2, 0x0

    const/4 p3, 0x0

    if-eqz p0, :cond_2

    const p0, 0x2e0d91e6

    invoke-interface {p6, p0}, LT/l;->U(I)V

    const/16 p0, 0x96

    const/4 p4, 0x6

    invoke-static {p0, p2, p3, p4, p3}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v1

    const/16 v5, 0x30

    const/16 v6, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lr/c;->c(FLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p0

    invoke-interface {p6}, LT/l;->J()V

    goto :goto_1

    :cond_2
    const p0, 0x2e0f0a04

    invoke-interface {p6, p0}, LT/l;->U(I)V

    invoke-static {p5}, LY0/h;->d(F)LY0/h;

    move-result-object p0

    shr-int/lit8 p4, p7, 0xf

    and-int/lit8 p4, p4, 0xe

    invoke-static {p0, p6, p4}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p0

    invoke-interface {p6}, LT/l;->J()V

    :goto_1
    new-instance p4, Ls/g;

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/h;

    invoke-virtual {p0}, LY0/h;->s()F

    move-result p0

    new-instance p5, Lm0/j1;

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/v0;

    invoke-virtual {p1}, Lm0/v0;->u()J

    move-result-wide v0

    invoke-direct {p5, v0, v1, p3}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p4, p0, p5, p3}, Ls/g;-><init>(FLm0/l0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p4, p6, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object p0
.end method

.method private static final c(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
