.class public abstract LM/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/n;

.field private static final b:Lr/s0;

.field private static final c:J

.field private static final d:Lr/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lr/n;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Lr/n;-><init>(FF)V

    sput-object v0, LM/z;->a:Lr/n;

    sget-object v0, LM/z$a;->a:LM/z$a;

    sget-object v1, LM/z$b;->a:LM/z$b;

    invoke-static {v0, v1}, Lr/u0;->a(Lmh/l;Lmh/l;)Lr/s0;

    move-result-object v0

    sput-object v0, LM/z;->b:Lr/s0;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    sput-wide v0, LM/z;->c:J

    new-instance v8, Lr/h0;

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lr/h0;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, LM/z;->d:Lr/h0;

    return-void
.end method

.method public static final synthetic a()Lr/n;
    .locals 1

    sget-object v0, LM/z;->a:Lr/n;

    return-object v0
.end method

.method public static final synthetic b(Lmh/a;LT/l;I)LT/z1;
    .locals 0

    invoke-static {p0, p1, p2}, LM/z;->h(Lmh/a;LT/l;I)LT/z1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LT/z1;)J
    .locals 2

    invoke-static {p0}, LM/z;->i(LT/z1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(Landroidx/compose/ui/e;Lmh/a;Lmh/l;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, LM/z$c;

    invoke-direct {v0, p1, p2}, LM/z$c;-><init>(Lmh/a;Lmh/l;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Lr/h0;
    .locals 1

    sget-object v0, LM/z;->d:Lr/h0;

    return-object v0
.end method

.method public static final f()J
    .locals 2

    sget-wide v0, LM/z;->c:J

    return-wide v0
.end method

.method public static final g()Lr/s0;
    .locals 1

    sget-object v0, LM/z;->b:Lr/s0;

    return-object v0
.end method

.method private static final h(Lmh/a;LT/l;I)LT/z1;
    .locals 9

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"

    const v2, -0x5ec259b1

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_1

    invoke-static {p0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, LT/z1;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p0, v1, :cond_2

    new-instance p0, Lr/a;

    invoke-static {p2}, LM/z;->i(LT/z1;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v3

    sget-object v4, LM/z;->b:Lr/s0;

    sget-wide v1, LM/z;->c:J

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p0, Lr/a;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_4

    :cond_3
    new-instance v3, LM/z$d;

    const/4 v0, 0x0

    invoke-direct {v3, p2, p0, v0}, LM/z$d;-><init>(LT/z1;Lr/a;Ldh/e;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lmh/p;

    const/4 p2, 0x6

    invoke-static {v1, v3, p1, p2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {p0}, Lr/a;->g()LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object p0
.end method

.method private static final i(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll0/g;

    invoke-virtual {p0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method
