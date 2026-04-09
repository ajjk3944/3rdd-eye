.class public final Lcom/ui/uidb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/uidb/UiDB;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/uidb/a$a;
    }
.end annotation


# instance fields
.field private final b:Lcom/ui/uidb/UiDB$b;

.field private final c:Z

.field private final d:Lbb/b;

.field private final e:Lab/f;

.field private final f:LXa/a;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Lcom/ui/uidb/UiDB$b;ZLbb/b;Lab/f;LXa/a;)V
    .locals 1

    const-string/jumbo v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "environment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "serializer"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "productFactory"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "api"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/ui/uidb/a;->b:Lcom/ui/uidb/UiDB$b;

    .line 3
    iput-boolean p3, p0, Lcom/ui/uidb/a;->c:Z

    .line 4
    iput-object p4, p0, Lcom/ui/uidb/a;->d:Lbb/b;

    .line 5
    iput-object p5, p0, Lcom/ui/uidb/a;->e:Lab/f;

    .line 6
    iput-object p6, p0, Lcom/ui/uidb/a;->f:LXa/a;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/OkHttpClient;Lcom/ui/uidb/UiDB$b;ZLbb/b;Lab/f;LXa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 7
    new-instance p6, LMj/x$b;

    invoke-direct {p6}, LMj/x$b;-><init>()V

    .line 8
    invoke-virtual {p2}, Lcom/ui/uidb/UiDB$b;->getHost()Ljava/lang/String;

    move-result-object p7

    new-instance p8, Ljava/lang/StringBuilder;

    invoke-direct {p8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "https://"

    invoke-virtual {p8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p8, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p7}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object p6

    .line 9
    invoke-static {}, LQj/k;->f()LQj/k;

    move-result-object p7

    invoke-virtual {p6, p7}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object p6

    .line 10
    invoke-static {}, LPj/a;->f()LPj/a;

    move-result-object p7

    invoke-virtual {p6, p7}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object p6

    .line 11
    invoke-virtual {p6, p1}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object p6

    .line 12
    invoke-virtual {p6}, LMj/x$b;->e()LMj/x;

    move-result-object p6

    .line 13
    const-class p7, LXa/a;

    invoke-virtual {p6, p7}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, LXa/a;

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/ui/uidb/a;-><init>(Lokhttp3/OkHttpClient;Lcom/ui/uidb/UiDB$b;ZLbb/b;Lab/f;LXa/a;)V

    return-void
.end method

.method public static final synthetic b(Lcom/ui/uidb/a;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/uidb/a;->f(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/uidb/a;)LXa/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/uidb/a;->f:LXa/a;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/uidb/a;)Lcom/ui/uidb/UiDB$b;
    .locals 0

    iget-object p0, p0, Lcom/ui/uidb/a;->b:Lcom/ui/uidb/UiDB$b;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/uidb/a;)Lbb/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/uidb/a;->d:Lbb/b;

    return-object p0
.end method

.method private final f(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/ui/uidb/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/uidb/a$b;

    iget v1, v0, Lcom/ui/uidb/a$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/uidb/a$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/uidb/a$b;

    invoke-direct {v0, p0, p2}, Lcom/ui/uidb/a$b;-><init>(Lcom/ui/uidb/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/uidb/a$b;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/uidb/a$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Lcom/ui/uidb/a$b;->c:I

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, LMj/w;
    :try_end_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p2}, LMj/w;->b()I

    move-result p1

    const/16 v0, 0x130

    if-eq p1, v0, :cond_7

    invoke-virtual {p2}, LMj/w;->f()Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p2}, LMj/w;->a()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, LMj/w;->e()Lokhttp3/Headers;

    move-result-object p2

    const-string/jumbo v0, "etag"

    invoke-virtual {p2, v0}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v0, LYa/a;->a:LYa/a$a;

    invoke-virtual {v0, p2}, LYa/a$a;->a(Ljava/lang/String;)LYa/a;

    move-result-object v1

    :cond_4
    new-instance p2, Lcom/ui/uidb/a$a;

    invoke-direct {p2, v1, p1}, Lcom/ui/uidb/a$a;-><init>(LYa/a;Ljava/lang/Object;)V

    return-object p2

    :cond_5
    new-instance p1, Lcom/ui/uidb/UiDB$Error$RequestFailed;

    const-string/jumbo p2, "Request successful, but no data"

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/uidb/UiDB$Error$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_6
    new-instance p1, Lcom/ui/uidb/UiDB$Error$RequestFailed;

    invoke-virtual {p2}, LMj/w;->b()I

    move-result p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Request Failed ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "]"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/uidb/UiDB$Error$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_7
    new-instance p1, Lcom/ui/uidb/UiDB$Error$NotChanged;

    invoke-direct {p1}, Lcom/ui/uidb/UiDB$Error$NotChanged;-><init>()V

    throw p1

    :goto_2
    new-instance p2, Lcom/ui/uidb/UiDB$Error$IO;

    const-string/jumbo v0, "UIDB API request fail on IO"

    invoke-direct {p2, v0, p1}, Lcom/ui/uidb/UiDB$Error$IO;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p2

    :goto_3
    new-instance p2, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo v0, "Response data in invalid format"

    invoke-direct {p2, v0, p1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public a(LYa/a;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, Lcom/ui/uidb/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/ui/uidb/a$c;-><init>(Lcom/ui/uidb/a;LYa/a;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
