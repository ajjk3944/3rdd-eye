.class public final synthetic LZf/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/function/Supplier;

.field public final synthetic d:Ljava/util/Iterator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/q;->a:Ljava/util/ArrayList;

    iput p2, p0, LZf/q;->b:I

    iput-object p3, p0, LZf/q;->c:Ljava/util/function/Supplier;

    iput-object p4, p0, LZf/q;->d:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LZf/q;->a:Ljava/util/ArrayList;

    iget v1, p0, LZf/q;->b:I

    iget-object v2, p0, LZf/q;->c:Ljava/util/function/Supplier;

    iget-object v3, p0, LZf/q;->d:Ljava/util/Iterator;

    invoke-static {v0, v1, v2, v3}, Linet/ipaddr/m;->g(Ljava/util/ArrayList;ILjava/util/function/Supplier;Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
