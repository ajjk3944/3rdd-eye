.class Linet/ipaddr/ipv6/Q$h;
.super Lag/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field p:I

.field q:I

.field r:Z


# direct methods
.method constructor <init>()V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Linet/ipaddr/ipv6/Q$h;-><init>(II)V

    return-void
.end method

.method constructor <init>(II)V
    .locals 7

    const/16 v5, 0x3a

    const/16 v6, 0x25

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v2, p1

    move v3, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Linet/ipaddr/ipv6/Q$h;-><init>(ZIIZCC)V

    return-void
.end method

.method private constructor <init>(ZIIZCC)V
    .locals 1

    .line 3
    invoke-static {p5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p5

    const/16 v0, 0x10

    invoke-direct {p0, v0, p5, p4, p6}, Lag/d$c;-><init>(ILjava/lang/Character;ZC)V

    .line 4
    invoke-virtual {p0, p1}, Lag/d$b;->u(Z)V

    .line 5
    iput p2, p0, Linet/ipaddr/ipv6/Q$h;->p:I

    add-int/2addr p2, p3

    .line 6
    iput p2, p0, Linet/ipaddr/ipv6/Q$h;->q:I

    return-void
.end method


# virtual methods
.method public bridge synthetic B(Lcg/b;)I
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$h;->l0(Linet/ipaddr/ipv6/Q;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic S(Ljava/lang/StringBuilder;Lcg/d;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p2, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/Q$h;->h0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic X()Lag/d$c;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q$h;->j0()Linet/ipaddr/ipv6/Q$h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c0(Lcg/d;)I
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$h;->l0(Linet/ipaddr/ipv6/Q;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q$h;->j0()Linet/ipaddr/ipv6/Q$h;

    move-result-object v0

    return-object v0
.end method

.method public h0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 1

    invoke-virtual {p0, p1}, Lag/d$b;->m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Linet/ipaddr/ipv6/Q$h;->i0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lag/d$b;->q(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p0, p3}, Lag/d$c;->W(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lag/d$c;->e0()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-boolean p3, p0, Linet/ipaddr/ipv6/Q$h;->r:Z

    if-eqz p3, :cond_1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lag/d$c;->U(Ljava/lang/StringBuilder;Lcg/d;)V

    :cond_1
    return-object p1
.end method

.method public i0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;)Ljava/lang/StringBuilder;
    .locals 7

    invoke-virtual {p2}, Lag/d;->H()I

    move-result v0

    if-gtz v0, :cond_0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0}, Lag/d$b;->A()Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result v2

    const/4 v3, 0x0

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    sub-int v4, v0, v3

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    iget v5, p0, Linet/ipaddr/ipv6/Q$h;->p:I

    if-lt v4, v5, :cond_6

    iget v6, p0, Linet/ipaddr/ipv6/Q$h;->q:I

    if-lt v4, v6, :cond_3

    goto :goto_2

    :cond_3
    if-eqz v2, :cond_4

    add-int/lit8 v5, v6, -0x1

    :cond_4
    if-ne v4, v5, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-nez v3, :cond_5

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-le v3, v0, :cond_1

    goto :goto_3

    :cond_6
    :goto_2
    invoke-virtual {p0, v4, p1, p2}, Lag/d$c;->V(ILjava/lang/StringBuilder;Lcg/d;)I

    add-int/lit8 v3, v3, 0x1

    if-le v3, v0, :cond_7

    :goto_3
    return-object p1

    :cond_7
    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public j0()Linet/ipaddr/ipv6/Q$h;
    .locals 1

    invoke-super {p0}, Lag/d$c;->X()Lag/d$c;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q$h;

    return-object v0
.end method

.method public k0(Linet/ipaddr/ipv6/Q;)I
    .locals 6

    invoke-virtual {p1}, Lag/d;->H()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lag/d$b;->A()Ljava/lang/Character;

    move-result-object v2

    move v3, v1

    :cond_0
    :goto_0
    iget v4, p0, Linet/ipaddr/ipv6/Q$h;->p:I

    if-lt v1, v4, :cond_4

    iget v5, p0, Linet/ipaddr/ipv6/Q$h;->q:I

    if-lt v1, v5, :cond_1

    goto :goto_3

    :cond_1
    if-ne v1, v4, :cond_3

    if-eqz v2, :cond_3

    add-int/lit8 v4, v3, 0x1

    if-nez v1, :cond_2

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_2
    move v3, v4

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :goto_2
    move v1, v3

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v4, 0x0

    invoke-virtual {p0, v1, v4, p1}, Lag/d$c;->V(ILjava/lang/StringBuilder;Lcg/d;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_4
    return v1
.end method

.method public bridge synthetic l(Ljava/lang/StringBuilder;Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p2, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/Q$h;->h0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public l0(Linet/ipaddr/ipv6/Q;)I
    .locals 2

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$h;->k0(Linet/ipaddr/ipv6/Q;)I

    move-result v0

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lag/d$c;->e0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Linet/ipaddr/ipv6/Q$h;->r:Z

    if-eqz v1, :cond_1

    :cond_0
    invoke-static {p1}, Lag/d$c;->a0(Lcg/d;)I

    move-result p1

    add-int/2addr v0, p1

    :cond_1
    invoke-virtual {p0}, Lag/d$c;->Z()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p0}, Lag/d$b;->x()I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic o(Ljava/lang/StringBuilder;Lcg/b;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p2, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/Q$h;->i0(Ljava/lang/StringBuilder;Linet/ipaddr/ipv6/Q;)Ljava/lang/StringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic z(Lcg/b;)I
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$h;->k0(Linet/ipaddr/ipv6/Q;)I

    move-result p1

    return p1
.end method
