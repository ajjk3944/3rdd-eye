.class public abstract Lcom/ubnt/usurvey/product/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/product/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lcom/ubnt/usurvey/product/p;ZJILjava/lang/Object;)Lgg/b;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, LO7/f;->a:LO7/f;

    invoke-virtual {p2}, LO7/f;->a()J

    move-result-wide p2

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ubnt/usurvey/product/p;->a(ZJ)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: syncIfNecessary"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
