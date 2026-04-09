.class public final Lcom/ubnt/usurvey/product/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/usurvey/product/p;


# instance fields
.field private final a:Lxa/o;

.field private final b:Lza/d;


# direct methods
.method public constructor <init>(Lxa/o;Lza/d;)V
    .locals 1

    const-string/jumbo v0, "catalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uiDBSnapshotStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/product/q;->a:Lxa/o;

    iput-object p2, p0, Lcom/ubnt/usurvey/product/q;->b:Lza/d;

    return-void
.end method

.method public static final synthetic b(Lcom/ubnt/usurvey/product/q;)Lxa/o;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/product/q;->a:Lxa/o;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ubnt/usurvey/product/q;)Lza/d;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/product/q;->b:Lza/d;

    return-object p0
.end method


# virtual methods
.method public a(ZJ)Lgg/b;
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ubnt/usurvey/product/q;->a:Lxa/o;

    invoke-interface {p1}, Lxa/o;->a()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ubnt/usurvey/product/q$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/ubnt/usurvey/product/q$a;-><init>(Lcom/ubnt/usurvey/product/q;Ldh/e;)V

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ubnt/usurvey/product/q$b;

    invoke-direct {v0, p2, p3, p0}, Lcom/ubnt/usurvey/product/q$b;-><init>(JLcom/ubnt/usurvey/product/q;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    :goto_0
    sget-object p2, Lcom/ubnt/usurvey/product/q$c;->a:Lcom/ubnt/usurvey/product/q$c;

    invoke-virtual {p1, p2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "doOnError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
