.class public abstract Linet/ipaddr/o$b;
.super Linet/ipaddr/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/o$b$a;
    }
.end annotation


# instance fields
.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method public constructor <init>(ZZZZLinet/ipaddr/d$c;ZZ)V
    .locals 0

    invoke-direct {p0, p2, p4, p5, p6}, Linet/ipaddr/d$a;-><init>(ZZLinet/ipaddr/d$c;Z)V

    iput-boolean p1, p0, Linet/ipaddr/o$b;->f:Z

    iput-boolean p3, p0, Linet/ipaddr/o$b;->h:Z

    iput-boolean p7, p0, Linet/ipaddr/o$b;->g:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/o$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Linet/ipaddr/o$b;

    invoke-super {p0, p1}, Linet/ipaddr/d$a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o$b;->g:Z

    iget-boolean v2, v0, Linet/ipaddr/o$b;->g:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o$b;->f:Z

    iget-boolean v2, v0, Linet/ipaddr/o$b;->f:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o$b;->h:Z

    iget-boolean v0, v0, Linet/ipaddr/o$b;->h:Z

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected h(Linet/ipaddr/o$b;)I
    .locals 2

    invoke-super {p0, p1}, Linet/ipaddr/d$a;->c(Linet/ipaddr/d$a;)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o$b;->g:Z

    iget-boolean v1, p1, Linet/ipaddr/o$b;->g:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o$b;->h:Z

    iget-boolean v1, p1, Linet/ipaddr/o$b;->h:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o$b;->f:Z

    iget-boolean p1, p1, Linet/ipaddr/o$b;->f:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Linet/ipaddr/d$a;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Linet/ipaddr/o$b;->g:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x8

    :cond_0
    return v0
.end method

.method protected l(Linet/ipaddr/o$b$a;)Linet/ipaddr/o$b$a;
    .locals 1

    invoke-super {p0, p1}, Linet/ipaddr/d$a;->d(Linet/ipaddr/d$a$a;)Linet/ipaddr/d$a$a;

    iget-boolean v0, p0, Linet/ipaddr/o$b;->h:Z

    iput-boolean v0, p1, Linet/ipaddr/o$b$a;->f:Z

    iget-boolean v0, p0, Linet/ipaddr/o$b;->g:Z

    iput-boolean v0, p1, Linet/ipaddr/o$b$a;->e:Z

    iget-boolean v0, p0, Linet/ipaddr/o$b;->f:Z

    iput-boolean v0, p1, Linet/ipaddr/o$b$a;->g:Z

    return-object p1
.end method
