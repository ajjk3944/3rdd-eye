.class public abstract Lag/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/c;
.implements Ldg/d;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lag/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# static fields
.field public static final k:Lbg/d$i$b;


# instance fields
.field private a:Lbg/d$i$b;

.field protected b:Z

.field private c:Ljava/lang/String;

.field private d:I

.field protected e:Ljava/lang/Character;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Ljava/lang/String;

.field private j:C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbg/d$i$b;

    invoke-direct {v0}, Lbg/d$i$b;-><init>()V

    sput-object v0, Lag/d$b;->k:Lbg/d$i$b;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Character;ZC)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lag/d$b;->k:Lbg/d$i$b;

    iput-object v0, p0, Lag/d$b;->a:Lbg/d$i$b;

    const-string v0, ""

    iput-object v0, p0, Lag/d$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lag/d$b;->i:Ljava/lang/String;

    const/4 v0, 0x2

    if-lt p1, v0, :cond_0

    const/16 v0, 0x55

    if-gt p1, v0, :cond_0

    iput p1, p0, Lag/d$b;->d:I

    iput-object p2, p0, Lag/d$b;->e:Ljava/lang/Character;

    iput-boolean p3, p0, Lag/d$b;->f:Z

    iput-char p4, p0, Lag/d$b;->j:C

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static r(ILjava/lang/StringBuilder;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Character;
    .locals 1

    iget-object v0, p0, Lag/d$b;->e:Ljava/lang/Character;

    return-object v0
.end method

.method public abstract B(Lcg/b;)I
.end method

.method public D(Lcg/b;Ljava/lang/CharSequence;)I
    .locals 0

    invoke-virtual {p0, p1}, Lag/d$b;->B(Lcg/b;)I

    move-result p1

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lag/d$b;->E(Ljava/lang/CharSequence;)I

    move-result p2

    add-int/2addr p1, p2

    :cond_0
    return p1
.end method

.method public E(Ljava/lang/CharSequence;)I
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lag/d$b;->g:Z

    return v0
.end method

.method public G(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lag/d$b;->i:Ljava/lang/String;

    return-void
.end method

.method public H(I)V
    .locals 0

    iput p1, p0, Lag/d$b;->d:I

    return-void
.end method

.method public I(Z)V
    .locals 0

    iput-boolean p1, p0, Lag/d$b;->g:Z

    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lag/d$b;->c:Ljava/lang/String;

    return-void
.end method

.method public L(Ljava/lang/Character;)V
    .locals 0

    iput-object p1, p0, Lag/d$b;->e:Ljava/lang/Character;

    return-void
.end method

.method public M(Z)V
    .locals 0

    iput-boolean p1, p0, Lag/d$b;->h:Z

    return-void
.end method

.method public N(Z)V
    .locals 0

    iput-boolean p1, p0, Lag/d$b;->f:Z

    return-void
.end method

.method public O(Lbg/d$i$b;)V
    .locals 0

    iput-object p1, p0, Lag/d$b;->a:Lbg/d$i$b;

    return-void
.end method

.method public P(C)V
    .locals 0

    iput-char p1, p0, Lag/d$b;->j:C

    return-void
.end method

.method public Q(Lcg/b;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lag/d$b;->R(Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public R(Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1, p2}, Lag/d$b;->D(Lcg/b;Ljava/lang/CharSequence;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, v1, p1, p2}, Lag/d$b;->l(Ljava/lang/StringBuilder;Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lag/d$b;->r(ILjava/lang/StringBuilder;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lag/d$b;->f:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lag/d$b;->h:Z

    return v0
.end method

.method public d()Ljava/lang/Character;
    .locals 1

    iget-object v0, p0, Lag/d$b;->e:Ljava/lang/Character;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lag/d$b;->g:Z

    return v0
.end method

.method public f()Lbg/d$i$b;
    .locals 1

    iget-object v0, p0, Lag/d$b;->a:Lbg/d$i$b;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lag/d$b;->d:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lag/d$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public abstract l(Ljava/lang/StringBuilder;Lcg/b;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
.end method

.method public m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    invoke-virtual {p0}, Lag/d$b;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-object p1
.end method

.method protected abstract n(ILjava/lang/StringBuilder;Lcg/b;)I
.end method

.method public o(Ljava/lang/StringBuilder;Lcg/b;)Ljava/lang/StringBuilder;
    .locals 5

    invoke-interface {p2}, Lcg/b;->H()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lag/d$b;->F()Z

    move-result v1

    invoke-virtual {p0}, Lag/d$b;->A()Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    sub-int v4, v0, v3

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    invoke-virtual {p0, v4, p1, p2}, Lag/d$b;->n(ILjava/lang/StringBuilder;Lcg/b;)I

    add-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    :goto_2
    return-object p1
.end method

.method public p(Lcg/a;Ljava/lang/StringBuilder;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lag/d$b;->x()I

    move-result p2

    const/4 v1, 0x0

    invoke-interface {p1, v0, p0, v1}, Lcg/a;->j(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_0
    invoke-virtual {p0, p2}, Lag/d$b;->m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v0, p0, p2}, Lcg/a;->j(ILdg/d;Ljava/lang/StringBuilder;)I

    return v0
.end method

.method public q(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 1

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-char v0, p0, Lag/d$b;->j:C

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_0
    return-object p1
.end method

.method public t()Lag/d$b;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag/d$b;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lag/d$b;->b:Z

    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lag/d$b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public x()I
    .locals 1

    invoke-virtual {p0}, Lag/d$b;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public z(Lcg/b;)I
    .locals 4

    invoke-interface {p1}, Lcg/b;->H()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcg/b;->H()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v3, p1}, Lag/d$b;->n(ILjava/lang/StringBuilder;Lcg/b;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lag/d$b;->A()Ljava/lang/Character;

    move-result-object p1

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int v1, v2, v0

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    return v1
.end method
