.class public abstract Linet/ipaddr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/c$b;,
        Linet/ipaddr/c$a;
    }
.end annotation


# static fields
.field private static a:Linet/ipaddr/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Linet/ipaddr/c$b;->PREFIXED_ZERO_HOSTS_ARE_SUBNETS:Linet/ipaddr/c$b;

    sput-object v0, Linet/ipaddr/c;->a:Linet/ipaddr/c$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Linet/ipaddr/c$b;
    .locals 1

    sget-object v0, Linet/ipaddr/c;->a:Linet/ipaddr/c$b;

    return-object v0
.end method


# virtual methods
.method public abstract a()Lbg/a;
.end method

.method public abstract d()Linet/ipaddr/c$b;
.end method

.method protected g(Linet/ipaddr/c;)Z
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/j;->u1(Linet/ipaddr/c;Linet/ipaddr/c;)Z

    move-result p1

    return p1
.end method
