.class public final synthetic Linet/ipaddr/ipv6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/b;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/i;->a:Linet/ipaddr/ipv6/b;

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/i;->a:Linet/ipaddr/ipv6/b;

    invoke-static {v0, p1}, Linet/ipaddr/ipv6/Q;->H2(Linet/ipaddr/ipv6/b;I)I

    move-result p1

    return p1
.end method
