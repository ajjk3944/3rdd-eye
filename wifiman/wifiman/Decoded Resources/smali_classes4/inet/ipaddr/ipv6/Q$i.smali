.class public Linet/ipaddr/ipv6/Q$i;
.super Lbg/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private final m:Linet/ipaddr/ipv6/Q;

.field private final n:Linet/ipaddr/ipv4/I;

.field private o:Ljava/lang/String;


# direct methods
.method private constructor <init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;)V
    .locals 2

    .line 2
    invoke-static {p1, p2}, Linet/ipaddr/ipv6/Q$i;->O1(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;)[Lbg/e;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lbg/f;-><init>([Lbg/e;Linet/ipaddr/i;)V

    .line 3
    invoke-virtual {p1}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p2}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p1}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Linet/ipaddr/InconsistentPrefixException;

    invoke-virtual {p2}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Linet/ipaddr/InconsistentPrefixException;-><init>(Lag/g;Lag/g;Ljava/lang/Integer;)V

    throw v0

    .line 7
    :cond_1
    invoke-virtual {p2}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p2}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/Q;->f()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    goto :goto_0

    .line 9
    :cond_2
    sget-object v0, Lag/d;->g:Ljava/lang/Integer;

    iput-object v0, p0, Lag/d;->c:Ljava/lang/Integer;

    .line 10
    :goto_0
    iput-object p2, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    .line 11
    iput-object p1, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    return-void
.end method

.method synthetic constructor <init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;Linet/ipaddr/ipv6/Q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/Q$i;-><init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;)V

    return-void
.end method

.method static synthetic M1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv4/I;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    return-object p0
.end method

.method static synthetic N1(Linet/ipaddr/ipv6/Q$i;)Linet/ipaddr/ipv6/Q;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    return-object p0
.end method

.method private static O1(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv4/I;)[Lbg/e;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/j;->Z()I

    move-result v0

    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, Linet/ipaddr/ipv6/Q;->v:I

    add-int/2addr v2, v3

    const/16 v3, 0x8

    if-gt v2, v3, :cond_0

    add-int v2, v0, v1

    new-array v2, v2, [Linet/ipaddr/k;

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v2, v3}, Linet/ipaddr/j;->d2(II[LZf/d;I)V

    invoke-virtual {p1, v3, v1, v2, v0}, Linet/ipaddr/j;->d2(II[LZf/d;I)V

    return-object v2

    :cond_0
    new-instance v0, Linet/ipaddr/AddressValueException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/AddressValueException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/ipv6/Q$i;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Linet/ipaddr/ipv6/Q$i;

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    iget-object v3, p1, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v1, v3}, Linet/ipaddr/ipv6/Q;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    iget-object p1, p1, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    invoke-virtual {v1, p1}, Linet/ipaddr/ipv4/I;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->f()I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    invoke-virtual {v1}, Linet/ipaddr/ipv4/I;->f()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/ipv6/Q$f;->l:Linet/ipaddr/ipv6/Q$g;

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/Q$g;->a(Linet/ipaddr/ipv6/Q$g;Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;

    move-result-object v1

    iget-object v0, v0, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    new-instance v2, Linet/ipaddr/ipv6/Q$j;

    invoke-direct {v2, v1, v0}, Linet/ipaddr/ipv6/Q$j;-><init>(Linet/ipaddr/ipv6/Q$h;Linet/ipaddr/j$c;)V

    invoke-virtual {v2, p0}, Linet/ipaddr/ipv6/Q$j;->k(Linet/ipaddr/ipv6/Q$i;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv6/Q$i;->o:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->o:Ljava/lang/String;

    return-object v0
.end method

.method public v0()I
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->v0()I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    invoke-virtual {v1}, Linet/ipaddr/ipv4/I;->v0()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public x()Z
    .locals 3

    invoke-virtual {p0}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lbg/f;->e()Linet/ipaddr/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0}, Lag/d;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->m:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0}, Lbg/f;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    invoke-virtual {v0}, Linet/ipaddr/j;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    iget-object v0, p0, Linet/ipaddr/ipv6/Q$i;->n:Linet/ipaddr/ipv4/I;

    invoke-virtual {v0}, Lbg/f;->x()Z

    move-result v0

    return v0
.end method
