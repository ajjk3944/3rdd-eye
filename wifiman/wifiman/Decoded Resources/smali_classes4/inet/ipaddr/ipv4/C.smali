.class public final synthetic Linet/ipaddr/ipv4/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/C;->a:Linet/ipaddr/ipv4/I;

    iput-boolean p2, p0, Linet/ipaddr/ipv4/C;->b:Z

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/C;->a:Linet/ipaddr/ipv4/I;

    iget-boolean v1, p0, Linet/ipaddr/ipv4/C;->b:Z

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv4/I;->H2(Linet/ipaddr/ipv4/I;ZI)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
