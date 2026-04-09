.class public final synthetic Linet/ipaddr/ipv4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/e$a;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/z;->a:Linet/ipaddr/ipv4/e$a;

    iput-object p2, p0, Linet/ipaddr/ipv4/z;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/z;->a:Linet/ipaddr/ipv4/e$a;

    iget-object v1, p0, Linet/ipaddr/ipv4/z;->b:Ljava/lang/Integer;

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv4/I;->I2(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/I;

    move-result-object p1

    return-object p1
.end method
