.class public abstract Linet/ipaddr/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/d$b;->a:Z

    iput-boolean v0, p0, Linet/ipaddr/d$b;->b:Z

    iput-boolean v0, p0, Linet/ipaddr/d$b;->c:Z

    return-void
.end method


# virtual methods
.method public a(Z)Linet/ipaddr/d$b;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/d$b;->b:Z

    return-object p0
.end method

.method public b(Z)Linet/ipaddr/d$b;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/d$b;->a:Z

    return-object p0
.end method

.method public c(Z)Linet/ipaddr/d$b;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/d$b;->c:Z

    return-object p0
.end method
