.class public final synthetic LZf/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:[Z

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Iterator;

.field public final synthetic d:Linet/ipaddr/j$e;

.field public final synthetic e:Linet/ipaddr/k;


# direct methods
.method public synthetic constructor <init>([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/p;->a:[Z

    iput p2, p0, LZf/p;->b:I

    iput-object p3, p0, LZf/p;->c:Ljava/util/Iterator;

    iput-object p4, p0, LZf/p;->d:Linet/ipaddr/j$e;

    iput-object p5, p0, LZf/p;->e:Linet/ipaddr/k;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LZf/p;->a:[Z

    iget v1, p0, LZf/p;->b:I

    iget-object v2, p0, LZf/p;->c:Ljava/util/Iterator;

    iget-object v3, p0, LZf/p;->d:Linet/ipaddr/j$e;

    iget-object v4, p0, LZf/p;->e:Linet/ipaddr/k;

    invoke-static {v0, v1, v2, v3, v4}, Linet/ipaddr/m;->j([ZILjava/util/Iterator;Linet/ipaddr/j$e;Linet/ipaddr/k;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
