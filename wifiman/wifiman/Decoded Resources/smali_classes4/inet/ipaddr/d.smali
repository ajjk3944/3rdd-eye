.class public abstract Linet/ipaddr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/d$a;,
        Linet/ipaddr/d$b;,
        Linet/ipaddr/d$c;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Linet/ipaddr/d;->a:Z

    iput-boolean p2, p0, Linet/ipaddr/d;->b:Z

    iput-boolean p3, p0, Linet/ipaddr/d;->c:Z

    return-void
.end method


# virtual methods
.method public c()Linet/ipaddr/d;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/d;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Linet/ipaddr/d;)I
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/d;->b:Z

    iget-boolean v1, p1, Linet/ipaddr/d;->b:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d;->a:Z

    iget-boolean v1, p1, Linet/ipaddr/d;->a:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d;->c:Z

    iget-boolean p1, p1, Linet/ipaddr/d;->c:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/d;

    iget-boolean v0, p0, Linet/ipaddr/d;->a:Z

    iget-boolean v2, p1, Linet/ipaddr/d;->a:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d;->b:Z

    iget-boolean v2, p1, Linet/ipaddr/d;->b:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d;->c:Z

    iget-boolean p1, p1, Linet/ipaddr/d;->c:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h(Linet/ipaddr/d$b;)Linet/ipaddr/d$b;
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d;->b:Z

    iput-boolean v0, p1, Linet/ipaddr/d$b;->b:Z

    iget-boolean v0, p0, Linet/ipaddr/d;->a:Z

    iput-boolean v0, p1, Linet/ipaddr/d$b;->a:Z

    iget-boolean v0, p0, Linet/ipaddr/d;->c:Z

    iput-boolean v0, p1, Linet/ipaddr/d$b;->c:Z

    return-object p1
.end method
