.class Lbg/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg/d;->C1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;IILjava/util/function/IntFunction;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:[LZf/d;

.field final synthetic b:Ljava/util/function/Supplier;

.field final synthetic c:Ljava/util/function/Predicate;


# direct methods
.method constructor <init>(Ljava/util/function/Supplier;Ljava/util/function/Predicate;)V
    .locals 0

    iput-object p1, p0, Lbg/d$c;->b:Ljava/util/function/Supplier;

    iput-object p2, p0, Lbg/d$c;->c:Ljava/util/function/Predicate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LZf/d;

    iput-object p1, p0, Lbg/d$c;->a:[LZf/d;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lbg/d$c;->a:[LZf/d;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()[LZf/d;
    .locals 2

    iget-object v0, p0, Lbg/d$c;->a:[LZf/d;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lbg/d$c;->a:[LZf/d;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lbg/d$c;->a:[LZf/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/d$c;->a()[LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
