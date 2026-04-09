.class final Lhb/c$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c$i;->a(Ltb/u;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmb/j;


# direct methods
.method constructor <init>(Lmb/j;)V
    .locals 0

    iput-object p1, p0, Lhb/c$i$a;->a:Lmb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lmb/x;
    .locals 3

    const-string/jumbo v0, "controllers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lhb/c$i$a;->a:Lmb/j;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lmb/x;

    invoke-virtual {v2}, Lmb/x;->d()Lmb/j;

    move-result-object v2

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lmb/x;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance p1, Lcom/ui/unifi/core/base/net/client/MissingDataClientException;

    iget-object v0, p0, Lhb/c$i$a;->a:Lmb/j;

    invoke-direct {p1, v0}, Lcom/ui/unifi/core/base/net/client/MissingDataClientException;-><init>(Lmb/j;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lhb/c$i$a;->a(Ljava/util/List;)Lmb/x;

    move-result-object p1

    return-object p1
.end method
