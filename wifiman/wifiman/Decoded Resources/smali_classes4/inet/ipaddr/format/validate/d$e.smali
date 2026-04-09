.class public abstract Linet/ipaddr/format/validate/d$e;
.super Linet/ipaddr/format/validate/d$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field protected final c:Linet/ipaddr/g$a;

.field protected final d:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V
    .locals 0

    invoke-direct {p0, p3}, Linet/ipaddr/format/validate/d$l;-><init>(Linet/ipaddr/o;)V

    iput-object p1, p0, Linet/ipaddr/format/validate/d$e;->d:Ljava/lang/Integer;

    iput-object p2, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    return-void
.end method


# virtual methods
.method public M()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-super {p0}, Linet/ipaddr/format/validate/d$g;->M()Linet/ipaddr/g;

    move-result-object v0

    return-object v0
.end method

.method public S0()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public o0()Linet/ipaddr/g$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    return-object v0
.end method
