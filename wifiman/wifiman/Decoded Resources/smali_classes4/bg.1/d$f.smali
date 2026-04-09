.class Lbg/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg/d;->w1(ZLinet/ipaddr/a;Lbg/a;Ljava/util/Iterator;Ljava/lang/Integer;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lbg/a;

.field final synthetic c:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Ljava/util/Iterator;Lbg/a;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lbg/d$f;->a:Ljava/util/Iterator;

    iput-object p2, p0, Lbg/d$f;->b:Lbg/a;

    iput-object p3, p0, Lbg/d$f;->c:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Linet/ipaddr/a;
    .locals 3

    invoke-virtual {p0}, Lbg/d$f;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbg/d$f;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZf/d;

    iget-object v1, p0, Lbg/d$f;->b:Lbg/a;

    iget-object v2, p0, Lbg/d$f;->c:Ljava/lang/Integer;

    invoke-static {v0, v1, v2}, Lbg/d;->j1([LZf/d;Lbg/a;Ljava/lang/Integer;)Linet/ipaddr/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lbg/d$f;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/d$f;->a()Linet/ipaddr/a;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
