.class public final LQ/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/h;-><init>(LQ/A;Lr/i;Lr/z;Lmh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/h;


# direct methods
.method constructor <init>(LQ/h;)V
    .locals 0

    iput-object p1, p0, LQ/h$a;->a:LQ/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public L1(JJI)J
    .locals 2

    iget-object p5, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p5}, LQ/h;->e()Lmh/a;

    move-result-object p5

    invoke-interface {p5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    if-nez p5, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1

    :cond_0
    iget-object p5, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p5}, LQ/h;->getState()LQ/A;

    move-result-object p5

    invoke-virtual {p5}, LQ/A;->c()F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p5, v0}, LQ/A;->f(F)V

    iget-object p5, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p5}, LQ/h;->getState()LQ/A;

    move-result-object p5

    invoke-virtual {p5}, LQ/A;->d()F

    move-result p5

    const/4 v0, 0x0

    cmpg-float p5, p5, v0

    if-nez p5, :cond_1

    goto :goto_0

    :cond_1
    iget-object p5, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p5}, LQ/h;->getState()LQ/A;

    move-result-object p5

    invoke-virtual {p5}, LQ/A;->d()F

    move-result p5

    iget-object v1, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {v1}, LQ/h;->getState()LQ/A;

    move-result-object v1

    invoke-virtual {v1}, LQ/A;->e()F

    move-result v1

    cmpg-float p5, p5, v1

    if-nez p5, :cond_2

    :goto_0
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p5

    cmpg-float p5, p5, v0

    if-nez p5, :cond_2

    invoke-static {p3, p4}, Ll0/g;->n(J)F

    move-result p3

    cmpl-float p3, p3, v0

    if-lez p3, :cond_2

    iget-object p3, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p3}, LQ/h;->getState()LQ/A;

    move-result-object p3

    invoke-virtual {p3, v0}, LQ/A;->f(F)V

    :cond_2
    iget-object p3, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p3}, LQ/h;->getState()LQ/A;

    move-result-object p3

    iget-object p4, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p4}, LQ/h;->getState()LQ/A;

    move-result-object p4

    invoke-virtual {p4}, LQ/A;->d()F

    move-result p4

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    add-float/2addr p4, p1

    invoke-virtual {p3, p4}, LQ/A;->g(F)V

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1
.end method

.method public V0(JI)J
    .locals 6

    iget-object p3, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p3}, LQ/h;->e()Lmh/a;

    move-result-object p3

    invoke-interface {p3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1

    :cond_0
    iget-object p3, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {p3}, LQ/h;->getState()LQ/A;

    move-result-object p3

    invoke-virtual {p3}, LQ/A;->d()F

    move-result p3

    iget-object v0, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {v0}, LQ/h;->getState()LQ/A;

    move-result-object v0

    iget-object v1, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {v1}, LQ/h;->getState()LQ/A;

    move-result-object v1

    invoke-virtual {v1}, LQ/A;->d()F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, LQ/A;->g(F)V

    iget-object v0, p0, LQ/h$a;->a:LQ/h;

    invoke-virtual {v0}, LQ/h;->getState()LQ/A;

    move-result-object v0

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v0

    cmpg-float p3, p3, v0

    if-nez p3, :cond_1

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Ll0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public g1(JJLdh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, LQ/h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LQ/h$a$a;

    iget v1, v0, LQ/h$a$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ/h$a$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ/h$a$a;

    invoke-direct {v0, p0, p5}, LQ/h$a$a;-><init>(LQ/h$a;Ldh/e;)V

    :goto_0
    iget-object p5, v0, LQ/h$a$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v1, v0, LQ/h$a$a;->e:I

    const/4 v8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    iget-wide p1, v0, LQ/h$a$a;->b:J

    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p3, v0, LQ/h$a$a;->b:J

    iget-object p1, v0, LQ/h$a$a;->a:Ljava/lang/Object;

    check-cast p1, LQ/h$a;

    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LQ/h$a$a;->a:Ljava/lang/Object;

    iput-wide p3, v0, LQ/h$a$a;->b:J

    iput v2, v0, LQ/h$a$a;->e:I

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, v0

    invoke-super/range {v1 .. v6}, Lx0/a;->g1(JJLdh/e;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v7, :cond_4

    return-object v7

    :cond_4
    move-object p1, p0

    :goto_1
    check-cast p5, LY0/y;

    invoke-virtual {p5}, LY0/y;->o()J

    move-result-wide v1

    iget-object p2, p1, LQ/h$a;->a:LQ/h;

    invoke-virtual {p2}, LQ/h;->getState()LQ/A;

    move-result-object p2

    invoke-static {p3, p4}, LY0/y;->i(J)F

    move-result p3

    iget-object p4, p1, LQ/h$a;->a:LQ/h;

    invoke-virtual {p4}, LQ/h;->b()Lr/z;

    move-result-object p4

    iget-object p1, p1, LQ/h$a;->a:LQ/h;

    invoke-virtual {p1}, LQ/h;->c()Lr/i;

    move-result-object p1

    const/4 p5, 0x0

    iput-object p5, v0, LQ/h$a$a;->a:Ljava/lang/Object;

    iput-wide v1, v0, LQ/h$a$a;->b:J

    iput v8, v0, LQ/h$a$a;->e:I

    invoke-static {p2, p3, p4, p1, v0}, LQ/a;->a(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v7, :cond_5

    return-object v7

    :cond_5
    move-wide p1, v1

    :goto_2
    check-cast p5, LY0/y;

    invoke-virtual {p5}, LY0/y;->o()J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, LY0/y;->l(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method
