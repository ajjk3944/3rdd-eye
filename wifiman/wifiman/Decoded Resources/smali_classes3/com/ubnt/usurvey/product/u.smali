.class public abstract Lcom/ubnt/usurvey/product/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ubnt/usurvey/product/l;)Lab/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/product/t;->a:Lcom/ubnt/usurvey/product/t;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/t;->m()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lab/d;

    return-object p0
.end method
