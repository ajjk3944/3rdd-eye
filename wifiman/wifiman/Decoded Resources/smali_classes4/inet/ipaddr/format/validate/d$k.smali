.class public abstract Linet/ipaddr/format/validate/d$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/format/validate/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "k"
.end annotation


# instance fields
.field private a:Linet/ipaddr/format/validate/d$h;


# direct methods
.method public constructor <init>(Linet/ipaddr/format/validate/d$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/format/validate/d$k;->a:Linet/ipaddr/format/validate/d$h;

    return-void
.end method


# virtual methods
.method public M()Linet/ipaddr/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public W(Linet/ipaddr/format/validate/d;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/format/validate/d$k;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Linet/ipaddr/format/validate/d$k;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$k;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/d$k;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getType()Linet/ipaddr/format/validate/d$h;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$k;->a:Linet/ipaddr/format/validate/d$h;

    return-object v0
.end method

.method public t0()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$k;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/d$k;->getType()Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
