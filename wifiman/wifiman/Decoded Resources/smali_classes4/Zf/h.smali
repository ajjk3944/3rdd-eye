.class public final synthetic LZf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Linet/ipaddr/j$e;

.field public final synthetic b:Linet/ipaddr/j;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/j$e;Linet/ipaddr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/h;->a:Linet/ipaddr/j$e;

    iput-object p2, p0, LZf/h;->b:Linet/ipaddr/j;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZf/h;->a:Linet/ipaddr/j$e;

    iget-object v1, p0, LZf/h;->b:Linet/ipaddr/j;

    invoke-static {v0, v1, p1}, Linet/ipaddr/j;->P1(Linet/ipaddr/j$e;Linet/ipaddr/j;I)Linet/ipaddr/k;

    move-result-object p1

    return-object p1
.end method
