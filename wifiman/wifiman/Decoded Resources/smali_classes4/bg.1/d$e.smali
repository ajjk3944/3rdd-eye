.class Lbg/d$e;
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
.field a:Linet/ipaddr/a;

.field final synthetic b:Linet/ipaddr/a;


# direct methods
.method constructor <init>(Linet/ipaddr/a;)V
    .locals 0

    iput-object p1, p0, Lbg/d$e;->b:Linet/ipaddr/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/d$e;->a:Linet/ipaddr/a;

    return-void
.end method


# virtual methods
.method public a()Linet/ipaddr/a;
    .locals 2

    iget-object v0, p0, Lbg/d$e;->a:Linet/ipaddr/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lbg/d$e;->a:Linet/ipaddr/a;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lbg/d$e;->a:Linet/ipaddr/a;

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

    invoke-virtual {p0}, Lbg/d$e;->a()Linet/ipaddr/a;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
