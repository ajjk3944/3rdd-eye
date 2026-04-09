.class public final LH5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# instance fields
.field private final a:Lokhttp3/MediaType;

.field private final b:LVi/o;

.field private final c:LH5/e;


# direct methods
.method public constructor <init>(Lokhttp3/MediaType;LVi/o;LH5/e;)V
    .locals 1

    const-string/jumbo v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "saver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH5/d;->a:Lokhttp3/MediaType;

    iput-object p2, p0, LH5/d;->b:LVi/o;

    iput-object p3, p0, LH5/d;->c:LH5/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LH5/d;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 3

    iget-object v0, p0, LH5/d;->c:LH5/e;

    iget-object v1, p0, LH5/d;->a:Lokhttp3/MediaType;

    iget-object v2, p0, LH5/d;->b:LVi/o;

    invoke-virtual {v0, v1, v2, p1}, LH5/e;->d(Lokhttp3/MediaType;LVi/o;Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
