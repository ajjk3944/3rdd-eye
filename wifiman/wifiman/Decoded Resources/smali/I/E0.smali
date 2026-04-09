.class public final LI/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/E0;

    invoke-direct {v0}, LI/E0;-><init>()V

    sput-object v0, LI/E0;->a:LI/E0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final A(LI/o1;Landroid/view/inputmethod/DeleteGesture;LI/l1;)V
    .locals 2

    invoke-static {p2}, LI/e0;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/f0;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v1, LL0/J;->a:LL0/J$a;

    invoke-virtual {v1}, LL0/J$a;->h()LL0/J;

    move-result-object v1

    invoke-static {p3, v0, p2, v1}, LI/F0;->g(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide p2

    sget-object v0, LH/n;->b:LH/n$a;

    invoke-virtual {v0}, LH/n$a;->a()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LI/E0;->e(LI/o1;JI)V

    return-void
.end method

.method private final B(LF/E;Landroid/view/inputmethod/DeleteRangeGesture;LM/G;)V
    .locals 3

    if-eqz p3, :cond_0

    invoke-static {p2}, LI/w0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/x0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/y0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p1, v0, v1, p2, v2}, LI/F0;->h(LF/E;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LM/G;->X(J)V

    :cond_0
    return-void
.end method

.method private final C(LI/o1;Landroid/view/inputmethod/DeleteRangeGesture;LI/l1;)V
    .locals 3

    invoke-static {p2}, LI/w0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/x0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/y0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p3, v0, v1, p2, v2}, LI/F0;->i(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p2

    sget-object v0, LH/n;->b:LH/n$a;

    invoke-virtual {v0}, LH/n$a;->a()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LI/E0;->e(LI/o1;JI)V

    return-void
.end method

.method private static final F(LI/o1;)V
    .locals 3

    invoke-static {p0}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v0

    invoke-static {p0}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object p0

    sget-object v1, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    invoke-virtual {v2}, LI/I;->f()LI/m;

    move-result-object v2

    invoke-virtual {v2}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    invoke-virtual {v2}, LI/I;->b()V

    const/4 v2, 0x1

    invoke-static {v0, p0, v2, v1}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method private static final G(LM/G;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LM/G;->n()V

    :cond_0
    return-void
.end method

.method private final H(LF/E;Landroid/view/inputmethod/SelectGesture;LM/G;)V
    .locals 2

    if-eqz p3, :cond_0

    invoke-static {p2}, LI/n0;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/o0;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v1, LL0/J;->a:LL0/J$a;

    invoke-virtual {v1}, LL0/J$a;->h()LL0/J;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, LI/F0;->f(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LM/G;->g0(J)V

    :cond_0
    return-void
.end method

.method private final I(LI/o1;Landroid/view/inputmethod/SelectGesture;LI/l1;)V
    .locals 2

    invoke-static {p2}, LI/n0;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/o0;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v1, LL0/J;->a:LL0/J$a;

    invoke-virtual {v1}, LL0/J$a;->h()LL0/J;

    move-result-object v1

    invoke-static {p3, v0, p2, v1}, LI/F0;->g(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide p2

    sget-object v0, LH/n;->b:LH/n$a;

    invoke-virtual {v0}, LH/n$a;->b()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LI/E0;->e(LI/o1;JI)V

    return-void
.end method

.method private final J(LF/E;Landroid/view/inputmethod/SelectRangeGesture;LM/G;)V
    .locals 3

    if-eqz p3, :cond_0

    invoke-static {p2}, LI/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/i0;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/t0;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p1, v0, v1, p2, v2}, LI/F0;->h(LF/E;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LM/G;->g0(J)V

    :cond_0
    return-void
.end method

.method private final K(LI/o1;Landroid/view/inputmethod/SelectRangeGesture;LI/l1;)V
    .locals 3

    invoke-static {p2}, LI/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/i0;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/t0;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p3, v0, v1, p2, v2}, LI/F0;->i(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p2

    sget-object v0, LH/n;->b:LH/n$a;

    invoke-virtual {v0}, LH/n$a;->b()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LI/E0;->e(LI/o1;JI)V

    return-void
.end method

.method private final L(I)I
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->a()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->a()I

    move-result p1

    goto :goto_0

    :cond_1
    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->b()I

    move-result p1

    :goto_0
    return p1
.end method

.method public static synthetic a(LM/G;)V
    .locals 0

    invoke-static {p0}, LI/E0;->G(LM/G;)V

    return-void
.end method

.method public static synthetic b(LI/o1;)V
    .locals 0

    invoke-static {p0}, LI/E0;->F(LI/o1;)V

    return-void
.end method

.method private final c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 10

    invoke-static {p1}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v0

    invoke-static {p1}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v1

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->b()V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    invoke-static {p2}, LI/v0;->a(Landroid/view/inputmethod/HandwritingGesture;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    const/4 p1, 0x3

    return p1

    :cond_0
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LI/o1;->u(LI/o1;Ljava/lang/CharSequence;ZLK/c;ILjava/lang/Object;)V

    const/4 p1, 0x5

    return p1
.end method

.method private final d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-static {p1}, LI/v0;->a(Landroid/view/inputmethod/HandwritingGesture;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x3

    return p1

    :cond_0
    new-instance v0, LR0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LR0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x5

    return p1
.end method

.method private final e(LI/o1;JI)V
    .locals 1

    invoke-static {p2, p3}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object p2

    invoke-static {p1}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object p1

    sget-object p3, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {p2}, LH/l;->g()LI/I;

    move-result-object p4

    invoke-virtual {p4}, LI/I;->f()LI/m;

    move-result-object p4

    invoke-virtual {p4}, LI/m;->e()V

    invoke-virtual {p2}, LH/l;->g()LI/I;

    move-result-object p4

    invoke-virtual {p4}, LI/I;->b()V

    const/4 p4, 0x1

    invoke-static {p2, p1, p4, p3}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p4, p2, p3}, LI/o1;->m(IJ)V

    :goto_0
    return-void
.end method

.method private final f(LF/E;Landroid/view/inputmethod/DeleteGesture;LL0/d;Lmh/l;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/DeleteGesture;",
            "LL0/d;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-static {p2}, LI/f0;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LI/E0;->L(I)I

    move-result v0

    invoke-static {p2}, LI/e0;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p1, v1, v0, v2}, LI/F0;->f(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->b()I

    move-result p1

    invoke-static {v0, p1}, LL0/F;->d(II)Z

    move-result v7

    move-object v3, p0

    move-object v6, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, LI/E0;->k(JLL0/d;ZLmh/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final g(LI/o1;Landroid/view/inputmethod/DeleteGesture;LI/l1;)I
    .locals 3

    invoke-static {p2}, LI/f0;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LI/E0;->L(I)I

    move-result v0

    invoke-static {p2}, LI/e0;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p3, v1, v0, v2}, LI/F0;->g(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    sget-object p2, LL0/F;->a:LL0/F$a;

    invoke-virtual {p2}, LL0/F$a;->b()I

    move-result p2

    invoke-static {v0, p2}, LL0/F;->d(II)Z

    move-result p2

    invoke-direct {p0, p1, v1, v2, p2}, LI/E0;->j(LI/o1;JZ)V

    const/4 p1, 0x1

    return p1
.end method

.method private final h(LF/E;Landroid/view/inputmethod/DeleteRangeGesture;LL0/d;Lmh/l;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/DeleteRangeGesture;",
            "LL0/d;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-static {p2}, LI/y0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LI/E0;->L(I)I

    move-result v0

    invoke-static {p2}, LI/w0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/x0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v2

    sget-object v3, LL0/J;->a:LL0/J$a;

    invoke-virtual {v3}, LL0/J$a;->h()LL0/J;

    move-result-object v3

    invoke-static {p1, v1, v2, v0, v3}, LI/F0;->h(LF/E;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->b()I

    move-result p1

    invoke-static {v0, p1}, LL0/F;->d(II)Z

    move-result v8

    move-object v4, p0

    move-object v7, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, LI/E0;->k(JLL0/d;ZLmh/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final i(LI/o1;Landroid/view/inputmethod/DeleteRangeGesture;LI/l1;)I
    .locals 4

    invoke-static {p2}, LI/y0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LI/E0;->L(I)I

    move-result v0

    invoke-static {p2}, LI/w0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/x0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v2

    sget-object v3, LL0/J;->a:LL0/J$a;

    invoke-virtual {v3}, LL0/J$a;->h()LL0/J;

    move-result-object v3

    invoke-static {p3, v1, v2, v0, v3}, LI/F0;->i(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    sget-object p2, LL0/F;->a:LL0/F$a;

    invoke-virtual {p2}, LL0/F$a;->b()I

    move-result p2

    invoke-static {v0, p2}, LL0/F;->d(II)Z

    move-result p2

    invoke-direct {p0, p1, v1, v2, p2}, LI/E0;->j(LI/o1;JZ)V

    const/4 p1, 0x1

    return p1
.end method

.method private final j(LI/o1;JZ)V
    .locals 8

    if-eqz p4, :cond_0

    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object p4

    invoke-static {p2, p3, p4}, LI/F0;->a(JLjava/lang/CharSequence;)J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    return-void
.end method

.method private final k(JLL0/d;ZLmh/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LL0/d;",
            "Z",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    invoke-static {p1, p2, p3}, LI/F0;->a(JLjava/lang/CharSequence;)J

    move-result-wide p1

    :cond_0
    new-instance p3, LR0/P;

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p4

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result v1

    invoke-direct {p3, p4, v1}, LR0/P;-><init>(II)V

    invoke-static {p1, p2}, LL0/S;->j(J)I

    move-result p1

    new-instance p2, LR0/g;

    invoke-direct {p2, p1, v0}, LR0/g;-><init>(II)V

    const/4 p1, 0x2

    new-array p1, p1, [LR0/i;

    aput-object p3, p1, v0

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, LI/F0;->b([LR0/i;)LR0/i;

    move-result-object p1

    invoke-interface {p5, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final n(LF/E;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/w1;Lmh/l;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/InsertGesture;",
            "Landroidx/compose/ui/platform/w1;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    if-nez p3, :cond_0

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p2}, LI/p0;->a(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p3}, LI/F0;->c(LF/E;JLandroidx/compose/ui/platform/w1;)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_2

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF/j0;->f()LL0/M;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1, p3}, LI/F0;->j(LL0/M;I)Z

    move-result p1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, LI/q0;->a(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1, p4}, LI/E0;->p(ILjava/lang/String;Lmh/l;)V

    return v0

    :cond_2
    :goto_0
    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1
.end method

.method private final o(LI/o1;Landroid/view/inputmethod/InsertGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I
    .locals 8

    invoke-static {p2}, LI/p0;->a(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p3, v0, v1, p4}, LI/F0;->d(LI/l1;JLandroidx/compose/ui/platform/w1;)I

    move-result p3

    const/4 p4, -0x1

    if-ne p3, p4, :cond_0

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p2}, LI/q0;->a(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, LL0/T;->a(I)J

    move-result-wide v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final p(ILjava/lang/String;Lmh/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    new-instance v0, LR0/P;

    invoke-direct {v0, p1, p1}, LR0/P;-><init>(II)V

    new-instance p1, LR0/a;

    const/4 v1, 0x1

    invoke-direct {p1, p2, v1}, LR0/a;-><init>(Ljava/lang/String;I)V

    const/4 p2, 0x2

    new-array p2, p2, [LR0/i;

    const/4 v2, 0x0

    aput-object v0, p2, v2

    aput-object p1, p2, v1

    invoke-static {p2}, LI/F0;->b([LR0/i;)LR0/i;

    move-result-object p1

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final q(LF/E;Landroid/view/inputmethod/JoinOrSplitGesture;LL0/d;Landroidx/compose/ui/platform/w1;Lmh/l;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/JoinOrSplitGesture;",
            "LL0/d;",
            "Landroidx/compose/ui/platform/w1;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    if-nez p4, :cond_0

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p5}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p2}, LI/u0;->a(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p4}, LI/F0;->c(LF/E;JLandroidx/compose/ui/platform/w1;)I

    move-result p4

    const/4 v0, -0x1

    if-eq p4, v0, :cond_3

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF/j0;->f()LL0/M;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1, p4}, LI/F0;->j(LL0/M;I)Z

    move-result p1

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LI/F0;->k(Ljava/lang/CharSequence;I)J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p1

    const-string p2, " "

    invoke-direct {p0, p1, p2, p5}, LI/E0;->p(ILjava/lang/String;Lmh/l;)V

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LI/E0;->k(JLL0/d;ZLmh/l;)V

    :goto_0
    return v0

    :cond_3
    :goto_1
    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p5}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1
.end method

.method private final r(LI/o1;Landroid/view/inputmethod/JoinOrSplitGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I
    .locals 9

    invoke-virtual {p1}, LI/o1;->i()LH/h;

    move-result-object v0

    invoke-virtual {p1}, LI/o1;->k()LH/h;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x3

    return p1

    :cond_0
    invoke-static {p2}, LI/u0;->a(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p3, v0, v1, p4}, LI/F0;->d(LI/l1;JLandroidx/compose/ui/platform/w1;)I

    move-result p4

    const/4 v0, -0x1

    if-eq p4, v0, :cond_3

    invoke-virtual {p3}, LI/l1;->f()LL0/M;

    move-result-object p3

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    invoke-static {p3, p4}, LI/F0;->j(LL0/M;I)Z

    move-result p3

    if-ne p3, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object p2

    invoke-static {p2, p4}, LI/F0;->k(Ljava/lang/CharSequence;I)J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->h(J)Z

    move-result p2

    if-eqz p2, :cond_2

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v2, " "

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    invoke-direct {p0, p1, v3, v4, p2}, LI/E0;->j(LI/o1;JZ)V

    :goto_0
    return v0

    :cond_3
    :goto_1
    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1
.end method

.method private final s(LF/E;Landroid/view/inputmethod/RemoveSpaceGesture;LL0/d;Landroidx/compose/ui/platform/w1;Lmh/l;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/RemoveSpaceGesture;",
            "LL0/d;",
            "Landroidx/compose/ui/platform/w1;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LF/j0;->f()LL0/M;

    move-result-object v1

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-static {p2}, LI/r0;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v3

    invoke-static {p2}, LI/s0;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v5

    invoke-virtual {p1}, LF/E;->i()LC0/r;

    move-result-object v7

    move-object v8, p4

    invoke-static/range {v2 .. v8}, LI/F0;->e(LL0/M;JJLC0/r;Landroidx/compose/ui/platform/w1;)J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p5}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Lkotlin/jvm/internal/L;

    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    const/4 p4, -0x1

    iput p4, p1, Lkotlin/jvm/internal/L;->a:I

    new-instance v3, Lkotlin/jvm/internal/L;

    invoke-direct {v3}, Lkotlin/jvm/internal/L;-><init>()V

    iput p4, v3, Lkotlin/jvm/internal/L;->a:I

    invoke-static {p3, v1, v2}, LL0/T;->e(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object p3

    new-instance v4, Lkotlin/text/p;

    const-string v5, "\\s+"

    invoke-direct {v4, v5}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    new-instance v5, LI/E0$b;

    invoke-direct {v5, p1, v3}, LI/E0$b;-><init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V

    invoke-virtual {v4, p3, v5}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p3

    iget v4, p1, Lkotlin/jvm/internal/L;->a:I

    if-eq v4, p4, :cond_3

    iget v4, v3, Lkotlin/jvm/internal/L;->a:I

    if-ne v4, p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result p2

    iget p4, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p2, p4

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result p4

    iget v4, v3, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p4, v4

    iget p1, p1, Lkotlin/jvm/internal/L;->a:I

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1, v2}, LL0/S;->j(J)I

    move-result v1

    iget v2, v3, Lkotlin/jvm/internal/L;->a:I

    sub-int/2addr v1, v2

    sub-int/2addr v4, v1

    invoke-virtual {p3, p1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, LR0/P;

    invoke-direct {p3, p2, p4}, LR0/P;-><init>(II)V

    new-instance p2, LR0/a;

    invoke-direct {p2, p1, v0}, LR0/a;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x2

    new-array p1, p1, [LR0/i;

    const/4 p4, 0x0

    aput-object p3, p1, p4

    aput-object p2, p1, v0

    invoke-static {p1}, LI/F0;->b([LR0/i;)LR0/i;

    move-result-object p1

    invoke-interface {p5, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v0

    :cond_3
    :goto_2
    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p5}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1
.end method

.method private final t(LI/o1;Landroid/view/inputmethod/RemoveSpaceGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I
    .locals 10

    invoke-virtual {p3}, LI/l1;->f()LL0/M;

    move-result-object v1

    invoke-static {p2}, LI/r0;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v2

    invoke-static {v2}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v2

    invoke-static {p2}, LI/s0;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v4

    invoke-static {v4}, LI/F0;->l(Landroid/graphics/PointF;)J

    move-result-wide v4

    invoke-virtual {p3}, LI/l1;->j()LC0/r;

    move-result-object v6

    move-object v7, p4

    invoke-static/range {v1 .. v7}, LI/F0;->e(LL0/M;JJLC0/r;Landroidx/compose/ui/platform/w1;)J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object v2

    invoke-direct {v1, p1, v2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v0

    return v0

    :cond_0
    new-instance v3, Lkotlin/jvm/internal/L;

    invoke-direct {v3}, Lkotlin/jvm/internal/L;-><init>()V

    const/4 v4, -0x1

    iput v4, v3, Lkotlin/jvm/internal/L;->a:I

    new-instance v5, Lkotlin/jvm/internal/L;

    invoke-direct {v5}, Lkotlin/jvm/internal/L;-><init>()V

    iput v4, v5, Lkotlin/jvm/internal/L;->a:I

    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object v6

    invoke-static {v6, v1, v2}, LL0/T;->e(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lkotlin/text/p;

    const-string v8, "\\s+"

    invoke-direct {v7, v8}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    new-instance v8, LI/E0$a;

    invoke-direct {v8, v3, v5}, LI/E0$a;-><init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V

    invoke-virtual {v7, v6, v8}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object v6

    iget v7, v3, Lkotlin/jvm/internal/L;->a:I

    if-eq v7, v4, :cond_2

    iget v7, v5, Lkotlin/jvm/internal/L;->a:I

    if-ne v7, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v4

    iget v7, v3, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr v4, v7

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v7

    iget v8, v5, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr v7, v8

    invoke-static {v4, v7}, LL0/T;->b(II)J

    move-result-wide v7

    iget v3, v3, Lkotlin/jvm/internal/L;->a:I

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1, v2}, LL0/S;->j(J)I

    move-result v1

    iget v2, v5, Lkotlin/jvm/internal/L;->a:I

    sub-int/2addr v1, v2

    sub-int/2addr v4, v1

    invoke-virtual {v6, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-wide v2, v7

    move-object v7, v9

    invoke-static/range {v0 .. v7}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object v1

    invoke-direct {p0, p1, v1}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result v0

    return v0
.end method

.method private final u(LF/E;Landroid/view/inputmethod/SelectGesture;LM/G;Lmh/l;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/SelectGesture;",
            "LM/G;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-static {p2}, LI/n0;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/o0;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result v1

    invoke-direct {p0, v1}, LI/E0;->L(I)I

    move-result v1

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LI/F0;->f(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0, v1, p3, p4}, LI/E0;->y(JLM/G;Lmh/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final v(LI/o1;Landroid/view/inputmethod/SelectGesture;LI/l1;)I
    .locals 3

    invoke-static {p2}, LI/n0;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/o0;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result v1

    invoke-direct {p0, v1}, LI/E0;->L(I)I

    move-result v1

    sget-object v2, LL0/J;->a:LL0/J$a;

    invoke-virtual {v2}, LL0/J$a;->h()LL0/J;

    move-result-object v2

    invoke-static {p3, v0, v1, v2}, LI/F0;->g(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, v0, v1}, LI/o1;->y(J)V

    const/4 p1, 0x1

    return p1
.end method

.method private final w(LF/E;Landroid/view/inputmethod/SelectRangeGesture;LM/G;Lmh/l;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/SelectRangeGesture;",
            "LM/G;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-static {p2}, LI/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/i0;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/t0;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result v2

    invoke-direct {p0, v2}, LI/E0;->L(I)I

    move-result v2

    sget-object v3, LL0/J;->a:LL0/J$a;

    invoke-virtual {v3}, LL0/J$a;->h()LL0/J;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v3}, LI/F0;->h(LF/E;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LI/E0;->d(Landroid/view/inputmethod/HandwritingGesture;Lmh/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0, v1, p3, p4}, LI/E0;->y(JLM/G;Lmh/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final x(LI/o1;Landroid/view/inputmethod/SelectRangeGesture;LI/l1;)I
    .locals 4

    invoke-static {p2}, LI/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/i0;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v1

    invoke-static {p2}, LI/t0;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result v2

    invoke-direct {p0, v2}, LI/E0;->L(I)I

    move-result v2

    sget-object v3, LL0/J;->a:LL0/J$a;

    invoke-virtual {v3}, LL0/J$a;->h()LL0/J;

    move-result-object v3

    invoke-static {p3, v0, v1, v2, v3}, LI/F0;->i(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LI/E0;->a:LI/E0;

    invoke-static {p2}, LI/z0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LI/E0;->c(LI/o1;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, v0, v1}, LI/o1;->y(J)V

    const/4 p1, 0x1

    return p1
.end method

.method private final y(JLM/G;Lmh/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LM/G;",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    new-instance v0, LR0/P;

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v1

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    invoke-direct {v0, v1, p1}, LR0/P;-><init>(II)V

    invoke-interface {p4, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, LM/G;->v(Z)V

    :cond_0
    return-void
.end method

.method private final z(LF/E;Landroid/view/inputmethod/DeleteGesture;LM/G;)V
    .locals 2

    if-eqz p3, :cond_0

    invoke-static {p2}, LI/e0;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, LI/f0;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LI/E0;->L(I)I

    move-result p2

    sget-object v1, LL0/J;->a:LL0/J$a;

    invoke-virtual {v1}, LL0/J$a;->h()LL0/J;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, LI/F0;->f(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LM/G;->X(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final D(LF/E;Landroid/view/inputmethod/PreviewableHandwritingGesture;LM/G;Landroid/os/CancellationSignal;)Z
    .locals 3

    invoke-virtual {p1}, LF/E;->w()LL0/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LF/j0;->f()LL0/M;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LL0/L;->j()LL0/d;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p2}, LI/A0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LI/B0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->H(LF/E;Landroid/view/inputmethod/SelectGesture;LM/G;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LI/Y;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LI/Z;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->z(LF/E;Landroid/view/inputmethod/DeleteGesture;LM/G;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, LI/a0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LI/b0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->J(LF/E;Landroid/view/inputmethod/SelectRangeGesture;LM/G;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, LI/c0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p2}, LI/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->B(LF/E;Landroid/view/inputmethod/DeleteRangeGesture;LM/G;)V

    :goto_1
    if-eqz p4, :cond_6

    new-instance p1, LI/C0;

    invoke-direct {p1, p3}, LI/C0;-><init>(LM/G;)V

    invoke-virtual {p4, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_6
    const/4 p1, 0x1

    return p1

    :cond_7
    return v1
.end method

.method public final E(LI/o1;Landroid/view/inputmethod/PreviewableHandwritingGesture;LI/l1;Landroid/os/CancellationSignal;)Z
    .locals 1

    invoke-static {p2}, LI/A0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LI/B0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->I(LI/o1;Landroid/view/inputmethod/SelectGesture;LI/l1;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, LI/Y;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, LI/Z;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->A(LI/o1;Landroid/view/inputmethod/DeleteGesture;LI/l1;)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LI/a0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, LI/b0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->K(LI/o1;Landroid/view/inputmethod/SelectRangeGesture;LI/l1;)V

    goto :goto_0

    :cond_2
    invoke-static {p2}, LI/c0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LI/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->C(LI/o1;Landroid/view/inputmethod/DeleteRangeGesture;LI/l1;)V

    :goto_0
    if-eqz p4, :cond_3

    new-instance p2, LI/D0;

    invoke-direct {p2, p1}, LI/D0;-><init>(LI/o1;)V

    invoke-virtual {p4, p2}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final l(LF/E;Landroid/view/inputmethod/HandwritingGesture;LM/G;Landroidx/compose/ui/platform/w1;Lmh/l;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF/E;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "LM/G;",
            "Landroidx/compose/ui/platform/w1;",
            "Lmh/l;",
            ")I"
        }
    .end annotation

    invoke-virtual {p1}, LF/E;->w()LL0/d;

    move-result-object v3

    const/4 v0, 0x3

    if-nez v3, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LF/j0;->f()LL0/M;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LL0/L;->j()LL0/d;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-static {p2}, LI/A0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LI/B0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p5}, LI/E0;->u(LF/E;Landroid/view/inputmethod/SelectGesture;LM/G;Lmh/l;)I

    move-result p1

    goto/16 :goto_1

    :cond_3
    invoke-static {p2}, LI/Y;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LI/Z;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, v3, p5}, LI/E0;->f(LF/E;Landroid/view/inputmethod/DeleteGesture;LL0/d;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-static {p2}, LI/a0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LI/b0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p5}, LI/E0;->w(LF/E;Landroid/view/inputmethod/SelectRangeGesture;LM/G;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_5
    invoke-static {p2}, LI/c0;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p2}, LI/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, v3, p5}, LI/E0;->h(LF/E;Landroid/view/inputmethod/DeleteRangeGesture;LL0/d;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_6
    invoke-static {p2}, LI/l0;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p2}, LI/m0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LI/E0;->q(LF/E;Landroid/view/inputmethod/JoinOrSplitGesture;LL0/d;Landroidx/compose/ui/platform/w1;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_7
    invoke-static {p2}, LI/g0;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {p2}, LI/h0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p4, p5}, LI/E0;->n(LF/E;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/w1;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_8
    invoke-static {p2}, LI/j0;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {p2}, LI/k0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LI/E0;->s(LF/E;Landroid/view/inputmethod/RemoveSpaceGesture;LL0/d;Landroidx/compose/ui/platform/w1;Lmh/l;)I

    move-result p1

    goto :goto_1

    :cond_9
    const/4 p1, 0x2

    :goto_1
    return p1
.end method

.method public final m(LI/o1;Landroid/view/inputmethod/HandwritingGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I
    .locals 1

    invoke-static {p2}, LI/A0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LI/B0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->v(LI/o1;Landroid/view/inputmethod/SelectGesture;LI/l1;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p2}, LI/Y;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, LI/Z;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->g(LI/o1;Landroid/view/inputmethod/DeleteGesture;LI/l1;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p2}, LI/a0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, LI/b0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->x(LI/o1;Landroid/view/inputmethod/SelectRangeGesture;LI/l1;)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {p2}, LI/c0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LI/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LI/E0;->i(LI/o1;Landroid/view/inputmethod/DeleteRangeGesture;LI/l1;)I

    move-result p1

    goto :goto_0

    :cond_3
    invoke-static {p2}, LI/l0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LI/m0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LI/E0;->r(LI/o1;Landroid/view/inputmethod/JoinOrSplitGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I

    move-result p1

    goto :goto_0

    :cond_4
    invoke-static {p2}, LI/g0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LI/h0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LI/E0;->o(LI/o1;Landroid/view/inputmethod/InsertGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I

    move-result p1

    goto :goto_0

    :cond_5
    invoke-static {p2}, LI/j0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p2}, LI/k0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LI/E0;->t(LI/o1;Landroid/view/inputmethod/RemoveSpaceGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I

    move-result p1

    goto :goto_0

    :cond_6
    const/4 p1, 0x2

    :goto_0
    return p1
.end method
