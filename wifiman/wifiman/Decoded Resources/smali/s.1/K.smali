.class public abstract Ls/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LJ0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJ0/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "MagnifierPositionInRoot"

    invoke-direct {v0, v3, v1, v2, v1}, LJ0/v;-><init>(Ljava/lang/String;Lmh/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls/K;->a:LJ0/v;

    return-void
.end method

.method public static final a(FF)Z
    .locals 2

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    cmpg-float p0, p0, p1

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final b()LJ0/v;
    .locals 1

    sget-object v0, Ls/K;->a:LJ0/v;

    return-object v0
.end method

.method public static final c(I)Z
    .locals 1

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic d(IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    :cond_0
    invoke-static {p0}, Ls/K;->c(I)Z

    move-result p0

    return p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;)Landroidx/compose/ui/e;
    .locals 14

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ls/K;->d(IILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p11, :cond_0

    sget-object v0, Ls/V;->a:Ls/V$a;

    invoke-virtual {v0}, Ls/V$a;->a()Ls/V;

    move-result-object v0

    move-object v12, v0

    goto :goto_0

    :cond_0
    move-object/from16 v12, p11

    :goto_0
    new-instance v0, Landroidx/compose/foundation/MagnifierElement;

    const/4 v13, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v13}, Landroidx/compose/foundation/MagnifierElement;-><init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v1, p0

    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 11

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    const/high16 v4, 0x7fc00000    # Float.NaN

    goto :goto_2

    :cond_2
    move v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    sget-object v6, LY0/k;->b:LY0/k$a;

    invoke-virtual {v6}, LY0/k$a;->a()J

    move-result-wide v6

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    sget-object v8, LY0/h;->b:LY0/h$a;

    invoke-virtual {v8}, LY0/h$a;->c()F

    move-result v8

    goto :goto_5

    :cond_5
    move/from16 v8, p8

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_6

    sget-object v9, LY0/h;->b:LY0/h$a;

    invoke-virtual {v9}, LY0/h$a;->c()F

    move-result v9

    goto :goto_6

    :cond_6
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_7

    const/4 v10, 0x1

    goto :goto_7

    :cond_7
    move/from16 v10, p10

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v2, p11

    :goto_8
    move-object p2, p0

    move-object p3, p1

    move-object p4, v1

    move-object/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move-wide/from16 p8, v6

    move/from16 p10, v8

    move/from16 p11, v9

    move/from16 p12, v10

    move-object/from16 p13, v2

    invoke-static/range {p2 .. p13}, Ls/K;->e(Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method
