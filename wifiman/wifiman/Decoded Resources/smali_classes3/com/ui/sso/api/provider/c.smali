.class public final Lcom/ui/sso/api/provider/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Landroid/database/Cursor;)Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;
    .locals 13

    :try_start_0
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const/4 v1, 0x2

    :try_start_1
    sget-object v3, Lcom/ui/sso/api/provider/c$a;->UUID:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v3}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    sget-object v4, Lcom/ui/sso/api/provider/c$a;->USERNAME:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v4}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    sget-object v5, Lcom/ui/sso/api/provider/c$a;->EMAIL:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v5}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    sget-object v6, Lcom/ui/sso/api/provider/c$a;->AVATAR:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v6}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v7, Lkotlin/jvm/internal/N;

    invoke-direct {v7}, Lkotlin/jvm/internal/N;-><init>()V

    :cond_0
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    iput-object v8, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v8}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    new-instance v12, LNa/b;

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v12, v8, v10, v9, v11}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    new-instance v8, Lcom/ui/sso/api/provider/c$b;

    invoke-direct {v8, v7}, Lcom/ui/sso/api/provider/c$b;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v8, v2, v1, v2}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    const-string/jumbo v3, "Email unavailable"

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_3
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    const-string/jumbo v3, "Username unavailable"

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :catch_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    const-string/jumbo v3, "UUID in invalid format"

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    const-string/jumbo v3, "UUID unavailable"

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v3, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cursor doesn\'t contain required field: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v3

    :cond_5
    :goto_1
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-direct {v1, v0}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;-><init>(Ljava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {p1, v2}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :goto_2
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private final e(Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;)Landroid/database/Cursor;
    .locals 5

    sget-object v0, Lcom/ui/sso/api/provider/c$a;->UUID:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/ui/sso/api/provider/c$a;->USERNAME:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v1}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/ui/sso/api/provider/c$a;->EMAIL:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v2}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/ui/sso/api/provider/c$a;->AVATAR:Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v3}, Lcom/ui/sso/api/provider/c$a;->getId()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ui/sso/api/provider/c;->d([Ljava/lang/String;)Landroid/database/MatrixCursor;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNa/b;

    invoke-virtual {v1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, LNa/b;->a()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v2, v3, v4, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, v1}, Landroid/database/MatrixCursor;->addRow(Ljava/lang/Iterable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-object v0

    :goto_1
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    const-string/jumbo v1, "Failed to serialize accounts"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a(Landroid/database/Cursor;Lth/d;)Lcom/ui/sso/api/provider/UiAccountProviderCursor;
    .locals 2

    const-string/jumbo v0, "cursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/c;->c(Landroid/database/Cursor;)Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    move-result-object p1

    const-string/jumbo p2, "null cannot be cast to non-null type TT of com.ui.sso.api.provider.UiAccountProviderCursorSerializerImpl.deserialize"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;

    invoke-interface {p2}, Lth/d;->l()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "unable to deserialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public b(Lcom/ui/sso/api/provider/UiAccountProviderCursor;)Landroid/database/Cursor;
    .locals 1

    const-string/jumbo v0, "cursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/c;->e(Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d([Ljava/lang/String;)Landroid/database/MatrixCursor;
    .locals 1

    const-string/jumbo v0, "columnNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/database/MatrixCursor;

    invoke-direct {v0, p1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    return-object v0
.end method
