.class public final LH5/e$a;
.super LH5/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LVi/A;


# direct methods
.method public constructor <init>(LVi/A;)V
    .locals 1

    const-string/jumbo v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH5/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LH5/e$a;->a:LVi/A;

    return-void
.end method


# virtual methods
.method public a(LVi/a;Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "loader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v0, "body.string()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LH5/e$a;->e()LVi/A;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LVi/A;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b()LVi/l;
    .locals 1

    invoke-virtual {p0}, LH5/e$a;->e()LVi/A;

    move-result-object v0

    return-object v0
.end method

.method public d(Lokhttp3/MediaType;LVi/o;Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 1

    const-string/jumbo v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "saver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LH5/e$a;->e()LVi/A;

    move-result-object v0

    invoke-interface {v0, p2, p3}, LVi/A;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lokhttp3/RequestBody;->d(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    const-string/jumbo p2, "create(contentType, string)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected e()LVi/A;
    .locals 1

    iget-object v0, p0, LH5/e$a;->a:LVi/A;

    return-object v0
.end method
