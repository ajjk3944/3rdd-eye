.class public abstract Linet/ipaddr/o$b$a;
.super Linet/ipaddr/d$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/o$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field protected e:Z

.field protected f:Z

.field protected g:Z

.field h:Linet/ipaddr/o$a;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/d$a$a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Linet/ipaddr/o$b$a;->e:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/o$b$a;->f:Z

    iput-boolean v0, p0, Linet/ipaddr/o$b$a;->g:Z

    return-void
.end method

.method protected static h(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/ipv4/Z$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Linet/ipaddr/o$b$a;->g(Linet/ipaddr/ipv6/j0$a;)V

    return-void
.end method


# virtual methods
.method public d(Z)Linet/ipaddr/o$b$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$a$a;->a(Z)Linet/ipaddr/d$a$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$b$a;

    return-object p1
.end method

.method public e(Z)Linet/ipaddr/o$b$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$a$a;->b(Z)Linet/ipaddr/d$a$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$b$a;

    return-object p1
.end method

.method public f()Linet/ipaddr/o$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/o$b$a;->h:Linet/ipaddr/o$a;

    return-object v0
.end method

.method protected g(Linet/ipaddr/ipv6/j0$a;)V
    .locals 0

    return-void
.end method

.method public i(Linet/ipaddr/d$c;)Linet/ipaddr/o$b$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$a$a;->c(Linet/ipaddr/d$c;)Linet/ipaddr/d$a$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$b$a;

    return-object p1
.end method
