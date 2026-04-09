.class public final Lbb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbb/b;


# instance fields
.field private final b:Lab/f;

.field private final c:Z

.field private final d:LY6/r;

.field private final e:LY6/h;


# direct methods
.method public constructor <init>(Lab/f;Z)V
    .locals 1

    const-string/jumbo v0, "productFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb/c;->b:Lab/f;

    iput-boolean p2, p0, Lbb/c;->c:Z

    new-instance p1, LY6/r$a;

    invoke-direct {p1}, LY6/r$a;-><init>()V

    invoke-virtual {p1}, LY6/r$a;->c()LY6/r;

    move-result-object p1

    iput-object p1, p0, Lbb/c;->d:LY6/r;

    const-class p2, Lcom/ui/uidb/api/ApiSnapshot;

    invoke-virtual {p1, p2}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object p1

    iput-object p1, p0, Lbb/c;->e:LY6/h;

    return-void
.end method


# virtual methods
.method public a(Lcom/ui/uidb/UiDB$b;Ljava/lang/String;)Lbb/a;
    .locals 6

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lbb/c;->e:LY6/h;

    invoke-virtual {v0, p2}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/uidb/api/ApiSnapshot;
    :try_end_0
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiSnapshot;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lbb/a$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiSnapshot;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_3

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/uidb/api/ApiProduct;

    :try_start_1
    iget-object v4, p0, Lbb/c;->b:Lab/f;

    invoke-virtual {v4, p1, v3}, Lab/f;->m(Lcom/ui/uidb/UiDB$b;Lcom/ui/uidb/api/ApiProduct;)Lab/d;

    move-result-object v3
    :try_end_1
    .catch Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    iget-boolean v5, p0, Lbb/c;->c:Z

    if-eqz v5, :cond_1

    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProduct;->d()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Failed to create product instance for product "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v4}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    new-instance p1, Lbb/a;

    invoke-direct {p1, v2, v0, v1}, Lbb/a;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo p2, "Request failed - Missing product list"

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo p2, "Missing snapshot version"

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo p2, "Response data don\'t contain snapshot"

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo v0, "Response data in invalid format"

    invoke-direct {p2, v0, p1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
