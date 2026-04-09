.class public abstract Linet/ipaddr/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field protected a:Linet/ipaddr/d$c;

.field protected b:Z

.field protected c:Z

.field protected d:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Linet/ipaddr/d$a;->e:Linet/ipaddr/d$c;

    iput-object v0, p0, Linet/ipaddr/d$a$a;->a:Linet/ipaddr/d$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/d$a$a;->b:Z

    iput-boolean v0, p0, Linet/ipaddr/d$a$a;->c:Z

    iput-boolean v0, p0, Linet/ipaddr/d$a$a;->d:Z

    return-void
.end method


# virtual methods
.method public a(Z)Linet/ipaddr/d$a$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/d$a$a;->d:Z

    if-eqz p1, :cond_0

    iput-boolean p1, p0, Linet/ipaddr/d$a$a;->c:Z

    :cond_0
    return-object p0
.end method

.method public b(Z)Linet/ipaddr/d$a$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/d$a$a;->b:Z

    return-object p0
.end method

.method public c(Linet/ipaddr/d$c;)Linet/ipaddr/d$a$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/d$a$a;->a:Linet/ipaddr/d$c;

    return-object p0
.end method
