.class public final synthetic Linet/ipaddr/ipv6/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/V;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/V;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/S;->a:Linet/ipaddr/ipv6/V;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/S;->a:Linet/ipaddr/ipv6/V;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/V;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
