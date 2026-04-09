.class public Linet/ipaddr/format/validate/d$j;
.super Linet/ipaddr/format/validate/d$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/format/validate/d$e;-><init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V

    return-void
.end method

.method private d(Linet/ipaddr/g$a;IZ)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p1}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-virtual {p1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-virtual {p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object p1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p1, p2}, Linet/ipaddr/i;->p(I)Linet/ipaddr/g;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Linet/ipaddr/i;->s(IZ)Linet/ipaddr/g;

    move-result-object p1

    :goto_1
    return-object p1
.end method


# virtual methods
.method public D0(Linet/ipaddr/format/validate/d;)I
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_2

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    sget-object v1, Linet/ipaddr/format/validate/d$h;->PREFIX_ONLY:Linet/ipaddr/format/validate/d$h;

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->g0()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->g0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr p1, v0

    return p1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    :goto_0
    sub-int/2addr v0, p1

    return v0

    :cond_2
    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->M()Linet/ipaddr/g;

    move-result-object p1

    invoke-interface {p1, v0}, Lag/g;->z0(Lag/g;)I

    move-result p1

    return p1

    :cond_3
    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    invoke-static {v0}, Linet/ipaddr/format/validate/d$h;->from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_0
.end method

.method public W(Linet/ipaddr/format/validate/d;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v1, :cond_3

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v1

    sget-object v2, Linet/ipaddr/format/validate/d$h;->PREFIX_ONLY:Linet/ipaddr/format/validate/d$h;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->g0()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->g0()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    return v0

    :cond_2
    return v3

    :cond_3
    invoke-super {p0, p1}, Linet/ipaddr/format/validate/d;->W(Linet/ipaddr/format/validate/d;)Z

    move-result p1

    return p1
.end method

.method a()Linet/ipaddr/format/validate/r$d;
    .locals 5

    new-instance v0, Linet/ipaddr/format/validate/r$d;

    iget-object v1, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->g0()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {p0, v1, v2, v3}, Linet/ipaddr/format/validate/d$j;->d(Linet/ipaddr/g$a;IZ)Linet/ipaddr/g;

    move-result-object v1

    iget-object v2, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->g0()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {p0, v2, v3, v4}, Linet/ipaddr/format/validate/d$j;->d(Linet/ipaddr/g$a;IZ)Linet/ipaddr/g;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;)V

    return-object v0
.end method

.method public getType()Linet/ipaddr/format/validate/d$h;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Linet/ipaddr/format/validate/d$h;->from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Linet/ipaddr/format/validate/d$h;->PREFIX_ONLY:Linet/ipaddr/format/validate/d$h;

    return-object v0
.end method

.method public i0()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0()I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->g0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$e;->M()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    return v0
.end method
