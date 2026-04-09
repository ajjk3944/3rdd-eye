.class Linet/ipaddr/ipv6/Q$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/e;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# instance fields
.field private a:Lag/d$c;

.field private b:Linet/ipaddr/ipv6/Q$h;


# direct methods
.method constructor <init>(Linet/ipaddr/ipv6/Q$h;Linet/ipaddr/j$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Linet/ipaddr/ipv6/Q;->l3(Linet/ipaddr/j$c;)Lag/d$c;

    move-result-object p2

    iput-object p2, p0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;

    iput-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {v0, p1}, Lag/d$b;->m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-static {p2}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Linet/ipaddr/ipv6/Q$h;->i0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    iget v0, v0, Linet/ipaddr/ipv6/Q$h;->q:I

    invoke-static {p2}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j;->Z()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {v0}, Lag/d$c;->d0()C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;

    invoke-static {p2}, Linet/ipaddr/ipv6/Q$i;->M1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv4/I;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lag/d$b;->o(Ljava/lang/StringBuilder;Lcg/b;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {v0, p1, p3}, Lag/d$b;->q(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {p3, p1}, Lag/d$c;->W(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/Q$j;->c(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q$i;)V

    return-object p1
.end method

.method public c(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q$i;)V
    .locals 1

    invoke-static {p2}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q$j;->i(Linet/ipaddr/ipv6/Q;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Linet/ipaddr/ipv6/Q$i;->M1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q$j;->h(Linet/ipaddr/ipv4/I;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {v0, p1, p2}, Lag/d$c;->U(Ljava/lang/StringBuilder;Lcg/d;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q$j;->d()Linet/ipaddr/ipv6/Q$j;

    move-result-object v0

    return-object v0
.end method

.method public d()Linet/ipaddr/ipv6/Q$j;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q$j;

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/Q$h;->j0()Linet/ipaddr/ipv6/Q$h;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;

    invoke-virtual {v1}, Lag/d$c;->X()Lag/d$c;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e(Linet/ipaddr/ipv6/Q$i;)I
    .locals 1

    invoke-static {p1}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q$j;->i(Linet/ipaddr/ipv6/Q;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Linet/ipaddr/ipv6/Q$i;->M1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv4/I;

    move-result-object v0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/Q$j;->h(Linet/ipaddr/ipv4/I;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lag/d$c;->a0(Lcg/d;)I

    move-result p1

    return p1
.end method

.method public f(Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)I
    .locals 3

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-static {p1}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/Q$h;->k0(Linet/ipaddr/ipv6/Q;)I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;

    invoke-static {p1}, Linet/ipaddr/ipv6/Q$i;->M1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv4/I;

    move-result-object v2

    invoke-virtual {v1, v2}, Lag/d$b;->z(Lcg/b;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    iget v1, v1, Linet/ipaddr/ipv6/Q$h;->q:I

    invoke-static {p1}, Linet/ipaddr/ipv6/Q$i;->N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/j;->Z()I

    move-result v2

    if-ge v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$j;->e(Linet/ipaddr/ipv6/Q$i;)I

    move-result p1

    add-int/2addr v0, p1

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {p1, p2}, Lag/d$b;->E(Ljava/lang/CharSequence;)I

    move-result p1

    add-int/2addr v0, p1

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {p1}, Lag/d$c;->Z()I

    move-result p1

    add-int/2addr v0, p1

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {p1}, Lag/d$b;->x()I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method protected h(Linet/ipaddr/ipv4/I;)Z
    .locals 0

    invoke-virtual {p1}, Lag/d;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->a:Lag/d$c;

    invoke-virtual {p1}, Lag/d$c;->e0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected i(Linet/ipaddr/ipv6/Q;)Z
    .locals 0

    invoke-virtual {p1}, Lag/d;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    invoke-virtual {p1}, Lag/d$c;->e0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/ipv6/Q$j;->b:Linet/ipaddr/ipv6/Q$h;

    iget-boolean p1, p1, Linet/ipaddr/ipv6/Q$h;->r:Z

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k(Linet/ipaddr/ipv6/Q$i;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/ipv6/Q$j;->l(Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l(Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/Q$j;->f(Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, v1, p1, p2}, Linet/ipaddr/ipv6/Q$j;->b(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q$i;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lag/d$b;->r(ILjava/lang/StringBuilder;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
