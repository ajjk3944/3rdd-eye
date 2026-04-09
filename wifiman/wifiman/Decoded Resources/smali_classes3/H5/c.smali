.class public abstract LH5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LVi/A;Lokhttp3/MediaType;)LMj/h$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH5/b;

    new-instance v1, LH5/e$a;

    invoke-direct {v1, p0}, LH5/e$a;-><init>(LVi/A;)V

    invoke-direct {v0, p1, v1}, LH5/b;-><init>(Lokhttp3/MediaType;LH5/e;)V

    return-object v0
.end method
