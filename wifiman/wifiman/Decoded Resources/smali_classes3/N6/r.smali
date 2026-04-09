.class public LN6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN6/q;


# instance fields
.field final a:LP6/G;

.field final b:LP6/x;


# direct methods
.method public constructor <init>(LP6/G;LP6/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/r;->a:LP6/G;

    iput-object p2, p0, LN6/r;->b:LP6/x;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, LN6/r;->a:LP6/G;

    invoke-virtual {v0}, LP6/G;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LN6/r;->a:LP6/G;

    invoke-virtual {v0}, LP6/G;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LN6/r;->b:LP6/x;

    invoke-interface {v0}, LP6/x;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget-object p1, p0, LN6/r;->b:LP6/x;

    invoke-interface {p1}, LP6/x;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_3
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    throw p1

    :cond_4
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    throw p1
.end method
