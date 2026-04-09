.class public final LH5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# instance fields
.field private final a:LVi/a;

.field private final b:LH5/e;


# direct methods
.method public constructor <init>(LVi/a;LH5/e;)V
    .locals 1

    const-string/jumbo v0, "loader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH5/a;->a:LVi/a;

    iput-object p2, p0, LH5/a;->b:LH5/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, LH5/a;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 2

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH5/a;->b:LH5/e;

    iget-object v1, p0, LH5/a;->a:LVi/a;

    invoke-virtual {v0, v1, p1}, LH5/e;->a(LVi/a;Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
