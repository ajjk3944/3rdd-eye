.class public abstract Lcom/ubnt/usurvey/product/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/product/g;->a:Lcom/ubnt/usurvey/product/g;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/g;->m()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/product/r;

    return-object p0
.end method
