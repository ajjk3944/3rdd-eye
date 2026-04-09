.class public Linet/ipaddr/ipv6/e$a;
.super Linet/ipaddr/i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/e$a$a;
    }
.end annotation


# instance fields
.field b:Linet/ipaddr/ipv6/e$a$a;

.field c:Z


# direct methods
.method public constructor <init>(Linet/ipaddr/ipv6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Linet/ipaddr/i$a;-><init>(Linet/ipaddr/i;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    .line 3
    new-instance p1, Linet/ipaddr/ipv6/e$a$a;

    invoke-direct {p1}, Linet/ipaddr/ipv6/e$a$a;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    return-void
.end method

.method protected constructor <init>(Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Linet/ipaddr/i$a;-><init>(Linet/ipaddr/i;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    .line 6
    iput-object p2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    return-void
.end method

.method private i1(Ljava/lang/String;)Linet/ipaddr/ipv6/b$c;
    .locals 3

    invoke-static {p1}, Linet/ipaddr/ipv6/b$c;->a(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v1}, Linet/ipaddr/ipv6/e$a$a;->r(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/b$c;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v1}, Linet/ipaddr/ipv6/e$a$a;->r(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/b$c;

    move-result-object v1

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    new-instance v1, Linet/ipaddr/ipv6/b$c;

    invoke-direct {v1, v0}, Linet/ipaddr/ipv6/b$c;-><init>(I)V

    iget-object v2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v2}, Linet/ipaddr/ipv6/e$a$a;->r(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/b$c;

    move-result-object v2

    aput-object v1, v2, v0

    goto :goto_0

    :cond_0
    new-instance v1, Linet/ipaddr/ipv6/b$c;

    invoke-direct {v1, v0}, Linet/ipaddr/ipv6/b$c;-><init>(I)V

    :cond_1
    :goto_0
    iput-object p1, v1, Linet/ipaddr/ipv6/b$c;->a:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v0}, Linet/ipaddr/ipv6/e$a$a;->s(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v1}, Linet/ipaddr/ipv6/e$a$a;->g(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Linet/ipaddr/ipv6/b$c;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-nez v1, :cond_4

    new-instance v0, Linet/ipaddr/ipv6/b$c;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv6/b$c;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v1}, Linet/ipaddr/ipv6/e$a$a;->s(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v2}, Linet/ipaddr/ipv6/e$a$a;->g(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Linet/ipaddr/ipv6/b$c;

    if-nez v2, :cond_3

    iget-object v2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v2}, Linet/ipaddr/ipv6/e$a$a;->g(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object v1, v0

    :cond_4
    :goto_2
    return-object v1
.end method


# virtual methods
.method protected bridge synthetic C([BILjava/lang/Integer;Z)LZf/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Linet/ipaddr/ipv6/e$a;->b1([BILjava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic E(Linet/ipaddr/j;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic G0([Linet/ipaddr/k;)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic J(Linet/ipaddr/j;Ljava/lang/CharSequence;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/e$a;->U0(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected M0()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/b;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv6/b;-><init>(Linet/ipaddr/ipv6/Q;)V

    return-object v0
.end method

.method public P0(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Linet/ipaddr/ipv6/b;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/ipv6/b;-><init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)V

    return-object v0
.end method

.method protected bridge synthetic S([Linet/ipaddr/k;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public T0([Linet/ipaddr/ipv6/V;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/e$a;->P0(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected U0(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)Linet/ipaddr/ipv6/b;
    .locals 1

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p2}, Linet/ipaddr/ipv6/e$a;->i1(Ljava/lang/String;)Linet/ipaddr/ipv6/b$c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/e$a;->P0(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected V0(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/i$a;->K(Linet/ipaddr/j;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/b;

    invoke-virtual {p1, p4, p5}, Linet/ipaddr/ipv6/b;->w1(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)V

    return-object p1
.end method

.method protected W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/i$a;->S([Linet/ipaddr/k;)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/b;

    return-object p1
.end method

.method protected X0(Linet/ipaddr/j;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv6/Q$d;

    check-cast p1, Linet/ipaddr/ipv6/Q;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Linet/ipaddr/ipv6/Q$d;-><init>(Linet/ipaddr/j;[Linet/ipaddr/ipv6/V;I)V

    return-object v0
.end method

.method protected Y0(Linet/ipaddr/ipv6/Q;[Linet/ipaddr/ipv6/V;I)Linet/ipaddr/ipv6/Q;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/Q$d;

    invoke-direct {v0, p1, p2, p3}, Linet/ipaddr/ipv6/Q$d;-><init>(Linet/ipaddr/j;[Linet/ipaddr/ipv6/V;I)V

    return-object v0
.end method

.method protected Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;
    .locals 7

    new-instance v6, Linet/ipaddr/ipv6/Q;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZLjava/lang/Integer;Z)V

    return-object v6
.end method

.method public bridge synthetic a(I)LZf/d;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected a1([BIIILjava/lang/Integer;)Linet/ipaddr/ipv6/Q;
    .locals 9

    new-instance v8, Linet/ipaddr/ipv6/Q;

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/ipv6/Q;-><init>([BIIILjava/lang/Integer;ZZ)V

    return-object v8
.end method

.method protected b1([BILjava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;
    .locals 7

    new-instance v6, Linet/ipaddr/ipv6/Q;

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/ipv6/Q;-><init>([BILjava/lang/Integer;ZZ)V

    return-object v6
.end method

.method public bridge synthetic c(IILjava/lang/Integer;)LZf/d;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/e$a;->f1(IILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv6/Q;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZ)V

    return-object v0
.end method

.method public bridge synthetic d(I)[LZf/d;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic d0(Linet/ipaddr/j;[Linet/ipaddr/k;)Linet/ipaddr/j;
    .locals 0

    check-cast p2, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/e$a;->X0(Linet/ipaddr/j;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected d1([Linet/ipaddr/ipv6/V;I)Linet/ipaddr/ipv6/Q;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv6/Q;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZ)V

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public e1(I)Linet/ipaddr/ipv6/V;
    .locals 5

    iget-boolean v0, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    if-eqz v0, :cond_3

    if-ltz p1, :cond_3

    const v0, 0xffff

    if-gt p1, v0, :cond_3

    iget-object v0, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v0}, Linet/ipaddr/ipv6/e$a$a;->a(Linet/ipaddr/ipv6/e$a$a;)[[Linet/ipaddr/ipv6/V;

    move-result-object v0

    ushr-int/lit8 v1, p1, 0x8

    shl-int/lit8 v2, v1, 0x8

    sub-int v2, p1, v2

    const/16 v3, 0x100

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    const/16 v4, 0x1ff

    new-array v4, v4, [[Linet/ipaddr/ipv6/V;

    invoke-static {v0, v4}, Linet/ipaddr/ipv6/e$a$a;->c(Linet/ipaddr/ipv6/e$a$a;[[Linet/ipaddr/ipv6/V;)[[Linet/ipaddr/ipv6/V;

    new-array v0, v3, [Linet/ipaddr/ipv6/V;

    aput-object v0, v4, v1

    new-instance v1, Linet/ipaddr/ipv6/V;

    invoke-direct {v1, p1}, Linet/ipaddr/ipv6/V;-><init>(I)V

    aput-object v1, v0, v2

    goto :goto_0

    :cond_0
    aget-object v4, v0, v1

    if-nez v4, :cond_1

    new-array v3, v3, [Linet/ipaddr/ipv6/V;

    aput-object v3, v0, v1

    new-instance v1, Linet/ipaddr/ipv6/V;

    invoke-direct {v1, p1}, Linet/ipaddr/ipv6/V;-><init>(I)V

    aput-object v1, v3, v2

    goto :goto_0

    :cond_1
    aget-object v1, v4, v2

    if-nez v1, :cond_2

    new-instance v1, Linet/ipaddr/ipv6/V;

    invoke-direct {v1, p1}, Linet/ipaddr/ipv6/V;-><init>(I)V

    aput-object v1, v4, v2

    :cond_2
    :goto_0
    return-object v1

    :cond_3
    new-instance v0, Linet/ipaddr/ipv6/V;

    invoke-direct {v0, p1}, Linet/ipaddr/ipv6/V;-><init>(I)V

    return-object v0
.end method

.method public f1(IILjava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 4

    const/4 v0, 0x0

    const v1, 0xffff

    if-nez p3, :cond_2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v2, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    if-eqz v2, :cond_a

    if-nez p1, :cond_a

    if-ne p2, v1, :cond_a

    iget-object p1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {p1}, Linet/ipaddr/ipv6/e$a$a;->m(Linet/ipaddr/ipv6/e$a$a;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    new-instance p2, Linet/ipaddr/ipv6/V;

    const/4 p3, 0x0

    invoke-direct {p2, v0, v1, p3}, Linet/ipaddr/ipv6/V;-><init>(IILjava/lang/Integer;)V

    invoke-static {p1, p2}, Linet/ipaddr/ipv6/e$a$a;->n(Linet/ipaddr/ipv6/e$a$a;Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/V;

    move-object p1, p2

    :cond_1
    return-object p1

    :cond_2
    if-ne p1, p2, :cond_3

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/ipv6/e$a;->g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1

    :cond_3
    iget-boolean v2, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    if-eqz v2, :cond_a

    if-ltz p1, :cond_a

    if-gt p1, v1, :cond_a

    if-ltz p2, :cond_a

    if-gt p2, v1, :cond_a

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_a

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x80

    if-gt v2, v3, :cond_a

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, p3}, Linet/ipaddr/ipv6/e$a;->g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Linet/ipaddr/ipv6/e;->K()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x10

    if-le v2, v3, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_5
    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Linet/ipaddr/i;->C(I)I

    move-result v2

    and-int/2addr p1, v2

    and-int/2addr v2, p2

    if-ne v2, p1, :cond_6

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/ipv6/e$a;->g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Linet/ipaddr/i;->B(I)I

    move-result v2

    or-int/2addr p2, v2

    :cond_7
    if-nez p1, :cond_a

    if-ne p2, v1, :cond_a

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {p2}, Linet/ipaddr/ipv6/e$a$a;->o(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/V;

    move-result-object p2

    if-nez p2, :cond_8

    iget-object p2, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    const/16 v2, 0x11

    new-array v2, v2, [Linet/ipaddr/ipv6/V;

    invoke-static {p2, v2}, Linet/ipaddr/ipv6/e$a$a;->p(Linet/ipaddr/ipv6/e$a$a;[Linet/ipaddr/ipv6/V;)[Linet/ipaddr/ipv6/V;

    new-instance p2, Linet/ipaddr/ipv6/V;

    invoke-direct {p2, v0, v1, p3}, Linet/ipaddr/ipv6/V;-><init>(IILjava/lang/Integer;)V

    aput-object p2, v2, p1

    goto :goto_0

    :cond_8
    aget-object v2, p2, p1

    if-nez v2, :cond_9

    new-instance v2, Linet/ipaddr/ipv6/V;

    invoke-direct {v2, v0, v1, p3}, Linet/ipaddr/ipv6/V;-><init>(IILjava/lang/Integer;)V

    aput-object v2, p2, p1

    :cond_9
    move-object p2, v2

    :goto_0
    return-object p2

    :cond_a
    new-instance v0, Linet/ipaddr/ipv6/V;

    invoke-direct {v0, p1, p2, p3}, Linet/ipaddr/ipv6/V;-><init>(IILjava/lang/Integer;)V

    return-object v0
.end method

.method public bridge synthetic g(ILjava/lang/Integer;)LZf/d;
    .locals 0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/ipv6/e$a;->g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public g1(ILjava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 11

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/ipv6/e$a;->c:Z

    if-eqz v0, :cond_d

    if-ltz p1, :cond_d

    const v0, 0xffff

    if-gt p1, v0, :cond_d

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_d

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x80

    if-gt v0, v1, :cond_d

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {p1}, Linet/ipaddr/ipv6/e$a$a;->d(Linet/ipaddr/ipv6/e$a$a;)Linet/ipaddr/ipv6/V;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    new-instance p2, Linet/ipaddr/ipv6/V;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Linet/ipaddr/ipv6/V;-><init>(ILjava/lang/Integer;)V

    invoke-static {p1, p2}, Linet/ipaddr/ipv6/e$a$a;->h(Linet/ipaddr/ipv6/e$a$a;Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/V;

    move-object p1, p2

    :cond_1
    return-object p1

    :cond_2
    invoke-static {}, Linet/ipaddr/ipv6/e;->K()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Linet/ipaddr/i;->C(I)I

    move-result v2

    and-int/2addr p1, v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    rsub-int/lit8 v2, v2, 0x10

    ushr-int v2, p1, v2

    move v10, v2

    move v2, p1

    move p1, v10

    goto :goto_0

    :cond_3
    move v2, p1

    :goto_0
    iget-object v3, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-static {v3}, Linet/ipaddr/ipv6/e$a$a;->j(Linet/ipaddr/ipv6/e$a$a;)[[[Linet/ipaddr/ipv6/V;

    move-result-object v3

    ushr-int/lit8 v4, p1, 0x8

    shl-int/lit8 v5, v4, 0x8

    sub-int/2addr p1, v5

    const/4 v5, 0x0

    if-nez v3, :cond_4

    iget-object v3, p0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    const/16 v6, 0x11

    new-array v6, v6, [[[Linet/ipaddr/ipv6/V;

    invoke-static {v3, v6}, Linet/ipaddr/ipv6/e$a$a;->l(Linet/ipaddr/ipv6/e$a$a;[[[Linet/ipaddr/ipv6/V;)[[[Linet/ipaddr/ipv6/V;

    move-object v7, v5

    move-object v3, v6

    :goto_1
    move-object v6, v7

    goto :goto_2

    :cond_4
    aget-object v6, v3, v0

    if-eqz v6, :cond_6

    aget-object v7, v6, v4

    if-eqz v7, :cond_5

    aget-object v5, v7, p1

    :cond_5
    move-object v10, v6

    move-object v6, v5

    move-object v5, v10

    goto :goto_2

    :cond_6
    move-object v7, v5

    move-object v5, v6

    goto :goto_1

    :goto_2
    const/high16 v8, 0x10000

    const/4 v9, 0x1

    if-nez v5, :cond_8

    if-eqz v1, :cond_7

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    shl-int v5, v9, v5

    goto :goto_3

    :cond_7
    move v5, v8

    :goto_3
    add-int/lit16 v5, v5, 0xff

    ushr-int/lit8 v5, v5, 0x8

    new-array v5, v5, [[Linet/ipaddr/ipv6/V;

    aput-object v5, v3, v0

    :cond_8
    if-nez v7, :cond_b

    if-eqz v1, :cond_9

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    shl-int v8, v9, v0

    :cond_9
    ushr-int/lit8 v0, v8, 0x8

    if-ne v4, v0, :cond_a

    shl-int/lit8 v0, v0, 0x8

    sub-int/2addr v8, v0

    new-array v0, v8, [Linet/ipaddr/ipv6/V;

    :goto_4
    move-object v7, v0

    goto :goto_5

    :cond_a
    const/16 v0, 0x100

    new-array v0, v0, [Linet/ipaddr/ipv6/V;

    goto :goto_4

    :goto_5
    aput-object v7, v5, v4

    :cond_b
    if-nez v6, :cond_c

    new-instance v6, Linet/ipaddr/ipv6/V;

    invoke-direct {v6, v2, p2}, Linet/ipaddr/ipv6/V;-><init>(ILjava/lang/Integer;)V

    aput-object v6, v7, p1

    :cond_c
    return-object v6

    :cond_d
    new-instance v0, Linet/ipaddr/ipv6/V;

    invoke-direct {v0, p1, p2}, Linet/ipaddr/ipv6/V;-><init>(ILjava/lang/Integer;)V

    return-object v0
.end method

.method public h1(I)[Linet/ipaddr/ipv6/V;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Linet/ipaddr/ipv6/e;->k:[Linet/ipaddr/ipv6/V;

    return-object p1

    :cond_0
    new-array p1, p1, [Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method public j1()Linet/ipaddr/ipv6/e;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/i$a;->e()Linet/ipaddr/i;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/e;

    return-object v0
.end method

.method protected bridge synthetic l(LZf/c;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/a;Linet/ipaddr/a;)Linet/ipaddr/a;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    check-cast p4, Linet/ipaddr/ipv6/b;

    check-cast p5, Linet/ipaddr/ipv6/b;

    invoke-virtual/range {p0 .. p5}, Linet/ipaddr/ipv6/e$a;->V0(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/e$a;->Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic r([LZf/d;Ljava/lang/Integer;Z)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/e$a;->Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t([LZf/d;)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/e$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method public y()I
    .locals 1

    const v0, 0xffff

    return v0
.end method
