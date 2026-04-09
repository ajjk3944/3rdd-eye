.class public final synthetic Linet/ipaddr/ipv4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/p;->a:Linet/ipaddr/ipv4/I;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv4/p;->a:Linet/ipaddr/ipv4/I;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/I;->c4()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
