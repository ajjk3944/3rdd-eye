.class public abstract LL0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(ILT/l;II)LL0/O;
    .locals 6

    const/4 v0, 0x1

    and-int/2addr p3, v0

    if-eqz p3, :cond_0

    sget p0, LL0/P;->a:I

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)"

    const v2, 0x5bae9057

    invoke-static {v2, p2, p3, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object p3

    invoke-interface {p1, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LQ0/k$b;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v2

    invoke-interface {p1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/t;

    invoke-interface {p1, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    and-int/lit8 v4, p2, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v5, 0x4

    if-le v4, v5, :cond_2

    invoke-interface {p1, p0}, LT/l;->i(I)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_0
    or-int p2, v3, v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_5

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_6

    :cond_5
    new-instance v0, LL0/O;

    invoke-direct {v0, p3, v1, v2, p0}, LL0/O;-><init>(LQ0/k$b;LY0/d;LY0/t;I)V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, LL0/O;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-object v0
.end method
