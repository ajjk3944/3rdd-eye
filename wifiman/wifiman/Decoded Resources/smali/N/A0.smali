.class public abstract LN/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;

.field private static final c:LN/B0;

.field private static final d:LN/B0;

.field private static final e:LP/g;

.field private static final f:LP/g;

.field private static final g:LP/g;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    sget-object v0, LN/A0$b;->a:LN/A0$b;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LN/A0;->a:LT/H0;

    sget-object v0, LN/A0$a;->a:LN/A0$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LN/A0;->b:LT/H0;

    new-instance v0, LN/B0;

    sget-object v7, LY0/h;->b:LY0/h$a;

    invoke-virtual {v7}, LY0/h$a;->c()F

    move-result v3

    sget-object v8, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v8}, Lm0/v0$a;->e()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LN/B0;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/A0;->c:LN/B0;

    new-instance v0, LN/B0;

    invoke-virtual {v7}, LY0/h$a;->c()F

    move-result v11

    invoke-virtual {v8}, Lm0/v0$a;->e()J

    move-result-wide v12

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v14}, LN/B0;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/A0;->d:LN/B0;

    new-instance v0, LP/g;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, LP/g;-><init>(FFFF)V

    sput-object v0, LN/A0;->e:LP/g;

    new-instance v0, LP/g;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, LP/g;-><init>(FFFF)V

    sput-object v0, LN/A0;->f:LP/g;

    new-instance v0, LP/g;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v1, v2, v4}, LP/g;-><init>(FFFF)V

    sput-object v0, LN/A0;->g:LP/g;

    return-void
.end method

.method public static final synthetic a()LP/g;
    .locals 1

    sget-object v0, LN/A0;->g:LP/g;

    return-object v0
.end method

.method public static final synthetic b()LP/g;
    .locals 1

    sget-object v0, LN/A0;->e:LP/g;

    return-object v0
.end method

.method public static final synthetic c()LP/g;
    .locals 1

    sget-object v0, LN/A0;->f:LP/g;

    return-object v0
.end method

.method public static final d()LT/H0;
    .locals 1

    sget-object v0, LN/A0;->b:LT/H0;

    return-object v0
.end method

.method public static final e(ZFJ)Ls/I;
    .locals 7

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p1, v0}, LY0/h;->n(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    sget-object p0, LN/A0;->c:LN/B0;

    return-object p0

    :cond_0
    sget-object p0, LN/A0;->d:LN/B0;

    goto :goto_0

    :cond_1
    new-instance v6, LN/B0;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, LN/B0;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p0, v6

    :goto_0
    return-object p0
.end method

.method public static synthetic f(ZFJILjava/lang/Object;)Ls/I;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, LY0/h;->b:LY0/h$a;

    invoke-virtual {p1}, LY0/h$a;->c()F

    move-result p1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->e()J

    move-result-wide p2

    :cond_2
    invoke-static {p0, p1, p2, p3}, LN/A0;->e(ZFJ)Ls/I;

    move-result-object p0

    return-object p0
.end method

.method public static final g(ZFJLT/l;II)Ls/G;
    .locals 7

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    :cond_0
    move v0, p0

    and-int/lit8 p0, p6, 0x2

    if-eqz p0, :cond_1

    sget-object p0, LY0/h;->b:LY0/h$a;

    invoke-virtual {p0}, LY0/h$a;->c()F

    move-result p1

    :cond_1
    move v1, p1

    and-int/lit8 p0, p6, 0x4

    if-eqz p0, :cond_2

    sget-object p0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p0}, Lm0/v0$a;->e()J

    move-result-wide p2

    :cond_2
    move-wide v2, p2

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, -0x1

    const-string p1, "androidx.compose.material.rippleOrFallbackImplementation (Ripple.kt:264)"

    const p2, -0x381ae9e

    invoke-static {p2, p5, p0, p1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    sget-object p0, LN/A0;->a:LT/H0;

    invoke-interface {p4, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_4

    const p0, 0x5bf221e

    invoke-interface {p4, p0}, LT/l;->U(I)V

    and-int/lit16 v5, p5, 0x3fe

    const/4 v6, 0x0

    move-object v4, p4

    invoke-static/range {v0 .. v6}, LP/p;->f(ZFJLT/l;II)Ls/G;

    move-result-object p0

    invoke-interface {p4}, LT/l;->J()V

    goto :goto_0

    :cond_4
    const p0, 0x5c08587

    invoke-interface {p4, p0}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->J()V

    invoke-static {v0, v1, v2, v3}, LN/A0;->e(ZFJ)Ls/I;

    move-result-object p0

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object p0
.end method
