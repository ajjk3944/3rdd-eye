.class public Linet/ipaddr/ipv4/e$a;
.super Linet/ipaddr/i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv4/e$a$a;
    }
.end annotation


# instance fields
.field b:Linet/ipaddr/ipv4/e$a$a;

.field c:Z


# direct methods
.method public constructor <init>(Linet/ipaddr/ipv4/e;)V
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/i$a;-><init>(Linet/ipaddr/i;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Linet/ipaddr/ipv4/e$a;->c:Z

    new-instance p1, Linet/ipaddr/ipv4/e$a$a;

    invoke-direct {p1}, Linet/ipaddr/ipv4/e$a$a;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    return-void
.end method


# virtual methods
.method protected bridge synthetic C([BILjava/lang/Integer;Z)LZf/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv4/e$a;->Y0([BILjava/lang/Integer;Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic E(Linet/ipaddr/j;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/I;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic G0([Linet/ipaddr/k;)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->Z0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic J(Linet/ipaddr/j;Ljava/lang/CharSequence;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/I;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv4/e$a;->P0(Linet/ipaddr/ipv4/I;Ljava/lang/CharSequence;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method protected M0()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/b;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv4/b;-><init>(Linet/ipaddr/ipv4/I;)V

    return-object v0
.end method

.method protected P0(Linet/ipaddr/ipv4/I;Ljava/lang/CharSequence;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic S([Linet/ipaddr/k;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->U0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method protected T0(Linet/ipaddr/ipv4/I;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/i$a;->F(Linet/ipaddr/j;LZf/f;)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/b;

    invoke-virtual {p1, p4, p5}, Linet/ipaddr/ipv4/b;->v1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)V

    return-object p1
.end method

.method protected U0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/i$a;->S([Linet/ipaddr/k;)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv4/b;

    return-object p1
.end method

.method protected V0(Linet/ipaddr/j;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/I$a;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/ipv4/I$a;-><init>(Linet/ipaddr/j;[Linet/ipaddr/ipv4/M;)V

    return-object v0
.end method

.method protected W0([Linet/ipaddr/ipv4/M;Ljava/lang/Integer;Z)Linet/ipaddr/ipv4/I;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv4/I;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2, p3}, Linet/ipaddr/ipv4/I;-><init>([Linet/ipaddr/ipv4/M;ZLjava/lang/Integer;Z)V

    return-object v0
.end method

.method protected X0([BIIILjava/lang/Integer;)Linet/ipaddr/ipv4/I;
    .locals 7

    new-instance v6, Linet/ipaddr/ipv4/I;

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/ipv4/I;-><init>([BIIILjava/lang/Integer;)V

    return-object v6
.end method

.method protected Y0([BILjava/lang/Integer;Z)Linet/ipaddr/ipv4/I;
    .locals 7

    new-instance v6, Linet/ipaddr/ipv4/I;

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/ipv4/I;-><init>([BILjava/lang/Integer;ZZ)V

    return-object v6
.end method

.method protected Z0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv4/I;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Linet/ipaddr/ipv4/I;-><init>([Linet/ipaddr/ipv4/M;Z)V

    return-object v0
.end method

.method public bridge synthetic a(I)LZf/d;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public a1(I)Linet/ipaddr/ipv4/M;
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/ipv4/e$a;->c:Z

    if-eqz v0, :cond_2

    if-ltz p1, :cond_2

    const/16 v0, 0xff

    if-gt p1, v0, :cond_2

    iget-object v0, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {v0}, Linet/ipaddr/ipv4/e$a$a;->a(Linet/ipaddr/ipv4/e$a$a;)[Linet/ipaddr/ipv4/M;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    const/16 v1, 0x100

    new-array v1, v1, [Linet/ipaddr/ipv4/M;

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/e$a$a;->c(Linet/ipaddr/ipv4/e$a$a;[Linet/ipaddr/ipv4/M;)[Linet/ipaddr/ipv4/M;

    new-instance v0, Linet/ipaddr/ipv4/M;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv4/M;-><init>(I)V

    aput-object v0, v1, p1

    goto :goto_0

    :cond_0
    aget-object v1, v0, p1

    if-nez v1, :cond_1

    new-instance v1, Linet/ipaddr/ipv4/M;

    invoke-direct {v1, p1}, Linet/ipaddr/ipv4/M;-><init>(I)V

    aput-object v1, v0, p1

    :cond_1
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Linet/ipaddr/ipv4/M;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv4/M;-><init>(I)V

    return-object v0
.end method

.method public b1(IILjava/lang/Integer;)Linet/ipaddr/ipv4/M;
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0xff

    if-nez p3, :cond_2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v2, p0, Linet/ipaddr/ipv4/e$a;->c:Z

    if-eqz v2, :cond_c

    if-nez p1, :cond_c

    if-ne p2, v1, :cond_c

    iget-object p1, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {p1}, Linet/ipaddr/ipv4/e$a$a;->l(Linet/ipaddr/ipv4/e$a$a;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    new-instance p2, Linet/ipaddr/ipv4/M;

    const/4 p3, 0x0

    invoke-direct {p2, v0, v1, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    invoke-static {p1, p2}, Linet/ipaddr/ipv4/e$a$a;->m(Linet/ipaddr/ipv4/e$a$a;Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/M;

    move-object p1, p2

    :cond_1
    return-object p1

    :cond_2
    if-ne p1, p2, :cond_3

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/ipv4/e$a;->c1(ILjava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_3
    iget-boolean v2, p0, Linet/ipaddr/ipv4/e$a;->c:Z

    if-eqz v2, :cond_c

    if-ltz p1, :cond_c

    if-gt p1, v1, :cond_c

    if-ltz p2, :cond_c

    if-gt p2, v1, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x20

    if-gt v2, v3, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v0}, Linet/ipaddr/ipv4/e;->S(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Linet/ipaddr/ipv4/e$a;->c1(ILjava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Linet/ipaddr/ipv4/e;->P()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x8

    if-le v2, v3, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_5
    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    const/16 v3, 0x9

    if-eqz v2, :cond_9

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2, v4}, Linet/ipaddr/i;->C(I)I

    move-result v2

    and-int/2addr p1, v2

    and-int v4, p2, v2

    if-ne v4, p1, :cond_6

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/ipv4/e$a;->c1(ILjava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_6
    if-nez p1, :cond_c

    if-lt p2, v2, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {p2}, Linet/ipaddr/ipv4/e$a$a;->n(Linet/ipaddr/ipv4/e$a$a;)[Linet/ipaddr/ipv4/M;

    move-result-object p2

    if-nez p2, :cond_7

    iget-object p2, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    new-array v2, v3, [Linet/ipaddr/ipv4/M;

    invoke-static {p2, v2}, Linet/ipaddr/ipv4/e$a$a;->o(Linet/ipaddr/ipv4/e$a$a;[Linet/ipaddr/ipv4/M;)[Linet/ipaddr/ipv4/M;

    new-instance p2, Linet/ipaddr/ipv4/M;

    invoke-direct {p2, v0, v1, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    aput-object p2, v2, p1

    goto :goto_0

    :cond_7
    aget-object v2, p2, p1

    if-nez v2, :cond_8

    new-instance v2, Linet/ipaddr/ipv4/M;

    invoke-direct {v2, v0, v1, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    aput-object v2, p2, p1

    :cond_8
    move-object p2, v2

    :goto_0
    return-object p2

    :cond_9
    if-nez p1, :cond_c

    if-ne p2, v1, :cond_c

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {p2}, Linet/ipaddr/ipv4/e$a$a;->n(Linet/ipaddr/ipv4/e$a$a;)[Linet/ipaddr/ipv4/M;

    move-result-object p2

    if-nez p2, :cond_a

    iget-object p2, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    new-array v2, v3, [Linet/ipaddr/ipv4/M;

    invoke-static {p2, v2}, Linet/ipaddr/ipv4/e$a$a;->o(Linet/ipaddr/ipv4/e$a$a;[Linet/ipaddr/ipv4/M;)[Linet/ipaddr/ipv4/M;

    new-instance p2, Linet/ipaddr/ipv4/M;

    invoke-direct {p2, v0, v1, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    aput-object p2, v2, p1

    goto :goto_1

    :cond_a
    aget-object v2, p2, p1

    if-nez v2, :cond_b

    new-instance v2, Linet/ipaddr/ipv4/M;

    invoke-direct {v2, v0, v1, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    aput-object v2, p2, p1

    :cond_b
    move-object p2, v2

    :goto_1
    return-object p2

    :cond_c
    new-instance v0, Linet/ipaddr/ipv4/M;

    invoke-direct {v0, p1, p2, p3}, Linet/ipaddr/ipv4/M;-><init>(IILjava/lang/Integer;)V

    return-object v0
.end method

.method public bridge synthetic c(IILjava/lang/Integer;)LZf/d;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv4/e$a;->b1(IILjava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method public c1(ILjava/lang/Integer;)Linet/ipaddr/ipv4/M;
    .locals 8

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/ipv4/e$a;->c:Z

    if-eqz v0, :cond_9

    if-ltz p1, :cond_9

    const/16 v0, 0xff

    if-gt p1, v0, :cond_9

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_9

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_9

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {p1}, Linet/ipaddr/ipv4/e$a$a;->d(Linet/ipaddr/ipv4/e$a$a;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    new-instance p2, Linet/ipaddr/ipv4/M;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Linet/ipaddr/ipv4/M;-><init>(ILjava/lang/Integer;)V

    invoke-static {p1, p2}, Linet/ipaddr/ipv4/e$a$a;->g(Linet/ipaddr/ipv4/e$a$a;Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/M;

    move-object p1, p2

    :cond_1
    return-object p1

    :cond_2
    invoke-static {}, Linet/ipaddr/ipv4/e;->P()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Linet/ipaddr/i;->C(I)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_3

    and-int/2addr p1, v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x8

    ushr-int v0, p1, v0

    move v7, v0

    move v0, p1

    move p1, v7

    goto :goto_0

    :cond_3
    move v0, p1

    :goto_0
    iget-object v3, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    invoke-static {v3}, Linet/ipaddr/ipv4/e$a$a;->h(Linet/ipaddr/ipv4/e$a$a;)[[Linet/ipaddr/ipv4/M;

    move-result-object v3

    const/16 v4, 0x100

    const/4 v5, 0x1

    if-nez v3, :cond_5

    iget-object v3, p0, Linet/ipaddr/ipv4/e$a;->b:Linet/ipaddr/ipv4/e$a$a;

    const/16 v6, 0x9

    new-array v6, v6, [[Linet/ipaddr/ipv4/M;

    invoke-static {v3, v6}, Linet/ipaddr/ipv4/e$a$a;->j(Linet/ipaddr/ipv4/e$a$a;[[Linet/ipaddr/ipv4/M;)[[Linet/ipaddr/ipv4/M;

    if-eqz v2, :cond_4

    shl-int v4, v5, v1

    :cond_4
    new-array v2, v4, [Linet/ipaddr/ipv4/M;

    aput-object v2, v6, v1

    new-instance v1, Linet/ipaddr/ipv4/M;

    invoke-direct {v1, v0, p2}, Linet/ipaddr/ipv4/M;-><init>(ILjava/lang/Integer;)V

    aput-object v1, v2, p1

    goto :goto_1

    :cond_5
    aget-object v6, v3, v1

    if-nez v6, :cond_7

    if-eqz v2, :cond_6

    shl-int v4, v5, v1

    :cond_6
    new-array v2, v4, [Linet/ipaddr/ipv4/M;

    aput-object v2, v3, v1

    new-instance v1, Linet/ipaddr/ipv4/M;

    invoke-direct {v1, v0, p2}, Linet/ipaddr/ipv4/M;-><init>(ILjava/lang/Integer;)V

    aput-object v1, v2, p1

    goto :goto_1

    :cond_7
    aget-object v1, v6, p1

    if-nez v1, :cond_8

    new-instance v1, Linet/ipaddr/ipv4/M;

    invoke-direct {v1, v0, p2}, Linet/ipaddr/ipv4/M;-><init>(ILjava/lang/Integer;)V

    aput-object v1, v6, p1

    :cond_8
    :goto_1
    return-object v1

    :cond_9
    new-instance v0, Linet/ipaddr/ipv4/M;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/ipv4/M;-><init>(ILjava/lang/Integer;)V

    return-object v0
.end method

.method public bridge synthetic d(I)[LZf/d;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic d0(Linet/ipaddr/j;[Linet/ipaddr/k;)Linet/ipaddr/j;
    .locals 0

    check-cast p2, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv4/e$a;->V0(Linet/ipaddr/j;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method public d1(I)[Linet/ipaddr/ipv4/M;
    .locals 0

    if-nez p1, :cond_0

    invoke-static {}, Linet/ipaddr/ipv4/e;->K()[Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1

    :cond_0
    new-array p1, p1, [Linet/ipaddr/ipv4/M;

    return-object p1
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e$a;->e1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public e1()Linet/ipaddr/ipv4/e;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/i$a;->e()Linet/ipaddr/i;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/e;

    return-object v0
.end method

.method public bridge synthetic g(ILjava/lang/Integer;)LZf/d;
    .locals 0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv4/e$a;->c1(ILjava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic l(LZf/c;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/a;Linet/ipaddr/a;)Linet/ipaddr/a;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/I;

    check-cast p4, Linet/ipaddr/ipv4/b;

    check-cast p5, Linet/ipaddr/ipv4/b;

    invoke-virtual/range {p0 .. p5}, Linet/ipaddr/ipv4/e$a;->T0(Linet/ipaddr/ipv4/I;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;)Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv4/e$a;->W0([Linet/ipaddr/ipv4/M;Ljava/lang/Integer;Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic r([LZf/d;Ljava/lang/Integer;Z)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv4/e$a;->W0([Linet/ipaddr/ipv4/M;Ljava/lang/Integer;Z)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t([LZf/d;)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/e$a;->Z0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method

.method public y()I
    .locals 1

    const/16 v0, 0xff

    return v0
.end method
