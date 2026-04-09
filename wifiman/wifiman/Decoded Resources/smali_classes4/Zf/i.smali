.class public final synthetic LZf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:Linet/ipaddr/j$e;

.field public final synthetic b:Linet/ipaddr/j;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/j$e;Linet/ipaddr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/i;->a:Linet/ipaddr/j$e;

    iput-object p2, p0, LZf/i;->b:Linet/ipaddr/j;

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 2

    iget-object v0, p0, LZf/i;->a:Linet/ipaddr/j$e;

    iget-object v1, p0, LZf/i;->b:Linet/ipaddr/j;

    invoke-static {v0, v1, p1}, Linet/ipaddr/j;->M1(Linet/ipaddr/j$e;Linet/ipaddr/j;I)I

    move-result p1

    return p1
.end method
