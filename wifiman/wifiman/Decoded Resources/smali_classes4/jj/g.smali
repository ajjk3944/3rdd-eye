.class public final Ljj/g;
.super Ljj/i;
.source "SourceFile"


# static fields
.field public static final t:I


# instance fields
.field private final s:LA/B;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA/B;LIi/N;FLmh/p;Lmh/p;Lmh/p;Ljj/b;)V
    .locals 7

    const-string v0, "listState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMove"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dragCancelledAnimation"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Ljj/i;-><init>(LIi/N;FLmh/p;Lmh/p;Lmh/p;Ljj/b;)V

    iput-object p1, p0, Ljj/g;->s:LA/B;

    return-void
.end method


# virtual methods
.method public bridge synthetic A(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->Z(LA/l;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic D(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->a0(LA/l;)I

    move-result p1

    return p1
.end method

.method protected E()I
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->d()I

    move-result v0

    return v0
.end method

.method protected F()I
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->g()I

    move-result v0

    return v0
.end method

.method protected G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic H(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->b0(LA/l;)I

    move-result p1

    return p1
.end method

.method public I()Z
    .locals 2

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public L(II)Z
    .locals 2

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0, v1, p2}, Ljj/i;->L(II)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, v1}, Ljj/i;->L(II)Z

    move-result p1

    :goto_0
    return p1
.end method

.method protected M(IILdh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0, p1, p2, p3}, LA/B;->J(IILdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected R(LA/l;Ljava/util/List;II)LA/l;
    .locals 2

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, v1, p4}, Ljj/i;->j(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2, p3, v1}, Ljj/i;->j(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/l;

    :goto_0
    return-object p1
.end method

.method protected S(IILA/l;)Ljava/util/List;
    .locals 2

    const-string v0, "selected"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0, v1, p2, p3}, Ljj/i;->k(IILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, v1, p3}, Ljj/i;->k(IILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected T(LA/l;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    invoke-interface {p1}, LA/l;->b()I

    move-result p1

    sub-int p1, v0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LA/l;->b()I

    move-result v0

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method protected U(LA/l;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected V(LA/l;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LA/l;->getIndex()I

    move-result p1

    return p1
.end method

.method protected W(LA/l;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LA/l;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected X(LA/l;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    invoke-interface {p1}, LA/l;->b()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    sub-int p1, v0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LA/l;->b()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final Y()LA/B;
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    return-object v0
.end method

.method protected Z(LA/l;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    invoke-interface {p1}, LA/l;->b()I

    move-result p1

    sub-int p1, v0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LA/l;->b()I

    move-result v0

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method protected a0(LA/l;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    invoke-interface {p1}, LA/l;->b()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    sub-int p1, v0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LA/l;->b()I

    move-result p1

    :goto_0
    return p1
.end method

.method protected b0(LA/l;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/g;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LA/l;->a()I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Ljj/g;->R(LA/l;Ljava/util/List;II)LA/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    check-cast p3, LA/l;

    invoke-virtual {p0, p1, p2, p3}, Ljj/g;->S(IILA/l;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->T(LA/l;)I

    move-result p1

    return p1
.end method

.method protected t()I
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->r()I

    move-result v0

    return v0
.end method

.method protected u()I
    .locals 1

    iget-object v0, p0, Ljj/g;->s:LA/B;

    invoke-virtual {v0}, LA/B;->s()I

    move-result v0

    return v0
.end method

.method public bridge synthetic v(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->U(LA/l;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic x(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->V(LA/l;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->W(LA/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic z(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LA/l;

    invoke-virtual {p0, p1}, Ljj/g;->X(LA/l;)I

    move-result p1

    return p1
.end method
