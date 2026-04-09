.class public final LN/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/U;

    invoke-direct {v0}, LN/U;-><init>()V

    sput-object v0, LN/U;->a:LN/U;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFFFLT/l;II)LN/V;
    .locals 8

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x6

    if-eqz v0, :cond_0

    int-to-float p1, v1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_0
    move v3, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/16 p1, 0xc

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p2

    :cond_1
    move v4, p2

    and-int/lit8 p1, p7, 0x4

    const/16 p2, 0x8

    if-eqz p1, :cond_2

    int-to-float p1, p2

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p3

    :cond_2
    move v5, p3

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    int-to-float p1, p2

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p4

    :cond_3
    move v6, p4

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, -0x1

    const-string p2, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:248)"

    const p3, 0x16ac8064

    invoke-static {p3, p6, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    and-int/lit8 p1, p6, 0xe

    xor-int/2addr p1, v1

    const/4 p2, 0x4

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-le p1, p2, :cond_5

    invoke-interface {p5, v3}, LT/l;->g(F)Z

    move-result p1

    if-nez p1, :cond_6

    :cond_5
    and-int/lit8 p1, p6, 0x6

    if-ne p1, p2, :cond_7

    :cond_6
    move p1, p4

    goto :goto_0

    :cond_7
    move p1, p3

    :goto_0
    and-int/lit8 p2, p6, 0x70

    xor-int/lit8 p2, p2, 0x30

    const/16 p7, 0x20

    if-le p2, p7, :cond_8

    invoke-interface {p5, v4}, LT/l;->g(F)Z

    move-result p2

    if-nez p2, :cond_9

    :cond_8
    and-int/lit8 p2, p6, 0x30

    if-ne p2, p7, :cond_a

    :cond_9
    move p2, p4

    goto :goto_1

    :cond_a
    move p2, p3

    :goto_1
    or-int/2addr p1, p2

    and-int/lit16 p2, p6, 0x380

    xor-int/lit16 p2, p2, 0x180

    const/16 p7, 0x100

    if-le p2, p7, :cond_b

    invoke-interface {p5, v5}, LT/l;->g(F)Z

    move-result p2

    if-nez p2, :cond_c

    :cond_b
    and-int/lit16 p2, p6, 0x180

    if-ne p2, p7, :cond_d

    :cond_c
    move p2, p4

    goto :goto_2

    :cond_d
    move p2, p3

    :goto_2
    or-int/2addr p1, p2

    and-int/lit16 p2, p6, 0x1c00

    xor-int/lit16 p2, p2, 0xc00

    const/16 p7, 0x800

    if-le p2, p7, :cond_e

    invoke-interface {p5, v6}, LT/l;->g(F)Z

    move-result p2

    if-nez p2, :cond_f

    :cond_e
    and-int/lit16 p2, p6, 0xc00

    if-ne p2, p7, :cond_10

    :cond_f
    move p3, p4

    :cond_10
    or-int/2addr p1, p3

    invoke-interface {p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_11

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_12

    :cond_11
    new-instance p2, LN/y;

    const/4 v7, 0x0

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, LN/y;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p5, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast p2, LN/y;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    return-object p2
.end method
