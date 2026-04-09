.class public interface abstract Linet/ipaddr/format/validate/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/format/validate/d$f;,
        Linet/ipaddr/format/validate/d$i;,
        Linet/ipaddr/format/validate/d$j;,
        Linet/ipaddr/format/validate/d$e;,
        Linet/ipaddr/format/validate/d$l;,
        Linet/ipaddr/format/validate/d$g;,
        Linet/ipaddr/format/validate/d$k;,
        Linet/ipaddr/format/validate/d$h;
    }
.end annotation


# static fields
.field public static final p0:Linet/ipaddr/format/validate/d$k;

.field public static final q0:Linet/ipaddr/format/validate/d$k;

.field public static final r0:Linet/ipaddr/format/validate/d$k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Linet/ipaddr/format/validate/d$a;

    sget-object v1, Linet/ipaddr/format/validate/d$h;->INVALID:Linet/ipaddr/format/validate/d$h;

    invoke-direct {v0, v1}, Linet/ipaddr/format/validate/d$a;-><init>(Linet/ipaddr/format/validate/d$h;)V

    sput-object v0, Linet/ipaddr/format/validate/d;->p0:Linet/ipaddr/format/validate/d$k;

    new-instance v0, Linet/ipaddr/format/validate/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Linet/ipaddr/format/validate/d$b;-><init>(Linet/ipaddr/format/validate/d$h;)V

    sput-object v0, Linet/ipaddr/format/validate/d;->q0:Linet/ipaddr/format/validate/d$k;

    new-instance v0, Linet/ipaddr/format/validate/d$c;

    sget-object v1, Linet/ipaddr/format/validate/d$h;->EMPTY:Linet/ipaddr/format/validate/d$h;

    invoke-direct {v0, v1}, Linet/ipaddr/format/validate/d$c;-><init>(Linet/ipaddr/format/validate/d$h;)V

    sput-object v0, Linet/ipaddr/format/validate/d;->r0:Linet/ipaddr/format/validate/d$k;

    return-void
.end method

.method public static O0(Linet/ipaddr/g;Linet/ipaddr/g;)Linet/ipaddr/format/validate/d;
    .locals 2

    new-instance v0, Linet/ipaddr/format/validate/d$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Linet/ipaddr/format/validate/d$g;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;Linet/ipaddr/format/validate/d$a;)V

    return-object v0
.end method


# virtual methods
.method public D0(Linet/ipaddr/format/validate/d;)I
    .locals 3

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Lag/g;->z0(Lag/g;)I

    move-result p1

    return p1

    :cond_1
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object p1

    if-nez v1, :cond_3

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_3
    if-nez p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public J0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract M()Linet/ipaddr/g;
.end method

.method public S0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public W(Linet/ipaddr/format/validate/d;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1, p1}, Linet/ipaddr/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    return v2

    :cond_2
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object p1

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    return v0
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getParameters()Linet/ipaddr/o;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getType()Linet/ipaddr/format/validate/d$h;
.end method

.method public i0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k0(Linet/ipaddr/format/validate/d;)Ljava/lang/Boolean;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public o0()Linet/ipaddr/g$a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public s0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t0()I
    .locals 1

    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    return v0

    :cond_0
    invoke-interface {p0}, Linet/ipaddr/format/validate/d;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public y0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
