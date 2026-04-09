.class public final synthetic Linet/ipaddr/ipv4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/q;->a:Linet/ipaddr/ipv4/I;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv4/q;->a:Linet/ipaddr/ipv4/I;

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/I;->r3(I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method
