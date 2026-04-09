.class public final LH5/b;
.super LMj/h$a;
.source "SourceFile"


# instance fields
.field private final a:Lokhttp3/MediaType;

.field private final b:LH5/e;


# direct methods
.method public constructor <init>(Lokhttp3/MediaType;LH5/e;)V
    .locals 1

    const-string/jumbo v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LMj/h$a;-><init>()V

    iput-object p1, p0, LH5/b;->a:Lokhttp3/MediaType;

    iput-object p2, p0, LH5/b;->b:LH5/e;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "parameterAnnotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "methodAnnotations"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "retrofit"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LH5/b;->b:LH5/e;

    invoke-virtual {p2, p1}, LH5/e;->c(Ljava/lang/reflect/Type;)LVi/b;

    move-result-object p1

    new-instance p2, LH5/d;

    iget-object p3, p0, LH5/b;->a:Lokhttp3/MediaType;

    iget-object p4, p0, LH5/b;->b:LH5/e;

    invoke-direct {p2, p3, p1, p4}, LH5/d;-><init>(Lokhttp3/MediaType;LVi/o;LH5/e;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "retrofit"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LH5/b;->b:LH5/e;

    invoke-virtual {p2, p1}, LH5/e;->c(Ljava/lang/reflect/Type;)LVi/b;

    move-result-object p1

    new-instance p2, LH5/a;

    iget-object p3, p0, LH5/b;->b:LH5/e;

    invoke-direct {p2, p1, p3}, LH5/a;-><init>(LVi/a;LH5/e;)V

    return-object p2
.end method
