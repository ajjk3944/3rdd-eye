.class final LO/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lmh/p;

.field private final c:Z


# direct methods
.method public constructor <init>(Lmh/l;Lmh/p;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO/f;->a:Lmh/l;

    iput-object p2, p0, LO/f;->b:Lmh/p;

    iput-boolean p3, p0, LO/f;->c:Z

    return-void
.end method


# virtual methods
.method public L1(JJI)J
    .locals 0

    iget-boolean p1, p0, LO/f;->c:Z

    if-nez p1, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->b()I

    move-result p1

    invoke-static {p5, p1}, Lx0/e;->d(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p3, p4}, Ll0/g;->n(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-lez p1, :cond_1

    iget-object p1, p0, LO/f;->a:Lmh/l;

    invoke-static {p3, p4}, Ll0/g;->n(J)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p2, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public R(JLdh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, LO/f$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LO/f$a;

    iget v1, v0, LO/f$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO/f$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LO/f$a;

    invoke-direct {v0, p0, p3}, LO/f$a;-><init>(LO/f;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LO/f$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO/f$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LO/f$a;->a:F

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LO/f;->b:Lmh/p;

    invoke-static {p1, p2}, LY0/y;->i(J)F

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    const/4 p2, 0x0

    iput p2, v0, LO/f$a;->a:F

    iput v3, v0, LO/f$a;->d:I

    invoke-interface {p3, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move p1, p2

    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, LY0/z;->a(FF)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method

.method public V0(JI)J
    .locals 1

    iget-boolean v0, p0, LO/f;->c:Z

    if-nez v0, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object v0, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {v0}, Lx0/e$a;->b()I

    move-result v0

    invoke-static {p3, v0}, Lx0/e;->d(II)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p3

    const/4 v0, 0x0

    cmpg-float p3, p3, v0

    if-gez p3, :cond_1

    iget-object p3, p0, LO/f;->a:Lmh/l;

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method
