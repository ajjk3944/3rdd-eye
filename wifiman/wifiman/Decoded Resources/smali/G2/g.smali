.class public LG2/g;
.super LW2/h;
.source "SourceFile"

# interfaces
.implements LG2/h;


# instance fields
.field private e:LG2/h$a;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LW2/h;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, LW2/h;->b()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    const/16 v0, 0xf

    if-ne p1, v0, :cond_2

    :cond_1
    invoke-virtual {p0}, LW2/h;->h()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, LW2/h;->m(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic c(LC2/e;LE2/c;)LE2/c;
    .locals 0

    invoke-super {p0, p1, p2}, LW2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE2/c;

    return-object p1
.end method

.method public d(LG2/h$a;)V
    .locals 0

    iput-object p1, p0, LG2/g;->e:LG2/h$a;

    return-void
.end method

.method public bridge synthetic e(LC2/e;)LE2/c;
    .locals 0

    invoke-super {p0, p1}, LW2/h;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE2/c;

    return-object p1
.end method

.method protected bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LE2/c;

    invoke-virtual {p0, p1}, LG2/g;->n(LE2/c;)I

    move-result p1

    return p1
.end method

.method protected bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LC2/e;

    check-cast p2, LE2/c;

    invoke-virtual {p0, p1, p2}, LG2/g;->o(LC2/e;LE2/c;)V

    return-void
.end method

.method protected n(LE2/c;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, LW2/h;->i(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, LE2/c;->a()I

    move-result p1

    return p1
.end method

.method protected o(LC2/e;LE2/c;)V
    .locals 0

    iget-object p1, p0, LG2/g;->e:LG2/h$a;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, LG2/h$a;->d(LE2/c;)V

    :cond_0
    return-void
.end method
