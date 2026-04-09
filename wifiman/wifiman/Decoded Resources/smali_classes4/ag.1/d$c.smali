.class public Lag/d$c;
.super Lag/d$b;
.source "SourceFile"

# interfaces
.implements Ldg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lag/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "c"
.end annotation


# static fields
.field public static final o:Linet/ipaddr/j$g$a;


# instance fields
.field private l:Linet/ipaddr/j$g$a;

.field private m:[I

.field private n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Linet/ipaddr/j$g$a;->NETWORK_ONLY:Linet/ipaddr/j$g$a;

    sput-object v0, Lag/d$c;->o:Linet/ipaddr/j$g$a;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Character;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lag/d$c;-><init>(ILjava/lang/Character;ZC)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Character;ZC)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lag/d$b;-><init>(ILjava/lang/Character;ZC)V

    .line 3
    sget-object p1, Lag/d$c;->o:Linet/ipaddr/j$g$a;

    iput-object p1, p0, Lag/d$c;->l:Linet/ipaddr/j$g$a;

    .line 4
    const-string p1, ""

    iput-object p1, p0, Lag/d$c;->n:Ljava/lang/String;

    return-void
.end method

.method public static a0(Lcg/d;)I
    .locals 1

    invoke-interface {p0}, Lcg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lcg/d;->A()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    const/16 v0, 0x64

    if-ge p0, v0, :cond_1

    const/4 p0, 0x3

    return p0

    :cond_1
    const/4 p0, 0x4

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public bridge synthetic B(Lcg/b;)I
    .locals 0

    check-cast p1, Lcg/d;

    invoke-virtual {p0, p1}, Lag/d$c;->c0(Lcg/d;)I

    move-result p1

    return p1
.end method

.method public S(Ljava/lang/StringBuilder;Lcg/d;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 1

    invoke-virtual {p0, p1}, Lag/d$b;->m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lag/d$b;->o(Ljava/lang/StringBuilder;Lcg/b;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lag/d$b;->q(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p0, p3}, Lag/d$c;->W(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lag/d$c;->e0()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lag/d$c;->U(Ljava/lang/StringBuilder;Lcg/d;)V

    :cond_0
    return-object p1
.end method

.method public U(Ljava/lang/StringBuilder;Lcg/d;)V
    .locals 1

    invoke-interface {p2}, Lcg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lcg/d;->A()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method protected V(ILjava/lang/StringBuilder;Lcg/d;)I
    .locals 4

    invoke-interface {p3, p1}, Lcg/d;->k(I)Lcg/c;

    move-result-object v0

    invoke-interface {p3}, Lcg/d;->e()Linet/ipaddr/i;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c;->d()Linet/ipaddr/c$b;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/c$b;->prefixedSubnetsAreExplicit()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lag/d$c;->e0()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {v0}, Lcg/c;->g()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0}, Lcg/c;->f()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-virtual {v1}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Lcg/d;->x()Z

    move-result p3

    if-eqz p3, :cond_3

    :cond_0
    invoke-virtual {p0}, Lag/d$b;->c()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcg/c;->u()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {v0, p1, p0, p2}, Lcg/a;->v(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1

    :cond_2
    invoke-interface {v0, p1, p0, p2}, Lcg/c;->y(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1

    :cond_3
    :goto_0
    invoke-interface {v0, p1, p0, p2}, Lcg/a;->j(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public W(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    invoke-virtual {p0}, Lag/d$c;->Y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-object p1
.end method

.method public X()Lag/d$c;
    .locals 2

    invoke-super {p0}, Lag/d$b;->t()Lag/d$b;

    move-result-object v0

    check-cast v0, Lag/d$c;

    iget-object v1, p0, Lag/d$c;->m:[I

    if-eqz v1, :cond_0

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Lag/d$c;->m:[I

    :cond_0
    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lag/d$c;->n:Ljava/lang/String;

    return-object v0
.end method

.method public Z()I
    .locals 1

    invoke-virtual {p0}, Lag/d$c;->Y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c0(Lcg/d;)I
    .locals 2

    invoke-virtual {p0, p1}, Lag/d$b;->z(Lcg/b;)I

    move-result v0

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lag/d$c;->e0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Lag/d$c;->a0(Lcg/d;)I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    invoke-virtual {p0}, Lag/d$c;->Z()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p0}, Lag/d$b;->x()I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lag/d$c;->X()Lag/d$c;

    move-result-object v0

    return-object v0
.end method

.method public d0()C
    .locals 1

    iget-object v0, p0, Lag/d$b;->e:Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0
.end method

.method public e0()Z
    .locals 2

    iget-object v0, p0, Lag/d$c;->l:Linet/ipaddr/j$g$a;

    sget-object v1, Linet/ipaddr/j$g$a;->ALL:Linet/ipaddr/j$g$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lag/d$c;->n:Ljava/lang/String;

    return-void
.end method

.method public g0(Linet/ipaddr/j$g$a;)V
    .locals 0

    iput-object p1, p0, Lag/d$c;->l:Linet/ipaddr/j$g$a;

    return-void
.end method

.method public k(I)I
    .locals 2

    iget-boolean v0, p0, Lag/d$b;->b:Z

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lag/d$c;->m:[I

    if-eqz v0, :cond_1

    array-length v1, v0

    if-le v1, p1, :cond_1

    aget p1, v0, p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic l(Ljava/lang/StringBuilder;Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p2, Lcg/d;

    invoke-virtual {p0, p1, p2, p3}, Lag/d$c;->S(Ljava/lang/StringBuilder;Lcg/d;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic n(ILjava/lang/StringBuilder;Lcg/b;)I
    .locals 0

    check-cast p3, Lcg/d;

    invoke-virtual {p0, p1, p2, p3}, Lag/d$c;->V(ILjava/lang/StringBuilder;Lcg/d;)I

    move-result p1

    return p1
.end method
