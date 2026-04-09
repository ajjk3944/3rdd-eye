.class public abstract LVh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/io/InputStream;)LYg/s;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, LVh/a;->g:LVh/a$a;

    invoke-virtual {v0, p0}, LVh/a$a;->a(Ljava/io/InputStream;)LVh/a;

    move-result-object v0

    invoke-virtual {v0}, LVh/a;->h()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/f;->d()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v1

    invoke-static {v1}, LVh/b;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    invoke-static {p0, v1}, LUh/m;->g1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/m;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v2}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p0, v0}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
