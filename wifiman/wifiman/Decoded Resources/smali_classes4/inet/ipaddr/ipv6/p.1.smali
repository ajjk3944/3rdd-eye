.class public final synthetic Linet/ipaddr/ipv6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/e$a;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/p;->a:Linet/ipaddr/ipv6/e$a;

    iput-object p2, p0, Linet/ipaddr/ipv6/p;->b:Ljava/lang/Integer;

    iput p3, p0, Linet/ipaddr/ipv6/p;->c:I

    iput p4, p0, Linet/ipaddr/ipv6/p;->d:I

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Linet/ipaddr/ipv6/p;->a:Linet/ipaddr/ipv6/e$a;

    iget-object v1, p0, Linet/ipaddr/ipv6/p;->b:Ljava/lang/Integer;

    iget v2, p0, Linet/ipaddr/ipv6/p;->c:I

    iget v3, p0, Linet/ipaddr/ipv6/p;->d:I

    check-cast p1, Lag/d$e;

    invoke-static {v0, v1, v2, v3, p1}, Linet/ipaddr/ipv6/Q;->O2(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;IILag/d$e;)Z

    move-result p1

    return p1
.end method
