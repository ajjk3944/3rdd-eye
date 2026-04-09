.class public final Lbe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbe/d$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Lcom/ui/wifiman/model/support/a;

.field private final d:Lfd/b;

.field private final e:Lce/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/ui/wifiman/model/support/a;Lfd/b;)V
    .locals 1

    const-string v0, "apiIP"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedOkHttpClientHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/d;->a:Ljava/lang/String;

    iput p2, p0, Lbe/d;->b:I

    iput-object p3, p0, Lbe/d;->c:Lcom/ui/wifiman/model/support/a;

    iput-object p4, p0, Lbe/d;->d:Lfd/b;

    invoke-direct {p0}, Lbe/d;->f()LMj/x;

    move-result-object p1

    const-class p2, Lce/a;

    invoke-virtual {p1, p2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lce/a;

    iput-object p1, p0, Lbe/d;->e:Lce/a;

    return-void
.end method

.method public static final synthetic e(Lbe/d;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, Lbe/d;->c:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method

.method private final f()LMj/x;
    .locals 6

    iget-object v0, p0, Lbe/d;->d:Lfd/b;

    invoke-interface {v0}, Lfd/b;->a()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->E()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Lid/b;->a:Lid/b;

    invoke-virtual {v1, v0}, Lid/b;->a(Lokhttp3/OkHttpClient$Builder;)V

    new-instance v1, LMj/x$b;

    invoke-direct {v1}, LMj/x$b;-><init>()V

    iget-object v2, p0, Lbe/d;->a:Ljava/lang/String;

    iget v3, p0, Lbe/d;->b:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "https://"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object v1

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v1, v0}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LOj/a;->f()LOj/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    invoke-virtual {v0}, LMj/x$b;->e()LMj/x;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    iget-object v0, p0, Lbe/d;->e:Lce/a;

    invoke-interface {v0}, Lce/a;->a()Lgg/z;

    move-result-object v0

    new-instance v1, Lbe/d$b;

    invoke-direct {v1, p0}, Lbe/d$b;-><init>(Lbe/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/z;
    .locals 2

    iget-object v0, p0, Lbe/d;->e:Lce/a;

    invoke-interface {v0}, Lce/a;->b()Lgg/z;

    move-result-object v0

    new-instance v1, Lbe/d$c;

    invoke-direct {v1, p0}, Lbe/d$c;-><init>(Lbe/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Lce/f;)Lgg/z;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe/d;->e:Lce/a;

    invoke-interface {v0, p1}, Lce/a;->c(Lce/f;)Lgg/z;

    move-result-object p1

    sget-object v0, Lbe/d$d;->a:Lbe/d$d;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Ljava/lang/String;Lce/e;)Lgg/b;
    .locals 1

    const-string v0, "resultId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe/d;->e:Lce/a;

    invoke-interface {v0, p1, p2}, Lce/a;->d(Ljava/lang/String;Lce/e;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
