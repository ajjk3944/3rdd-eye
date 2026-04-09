.class public final LJh/U$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/U$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJh/U$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LJh/U$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LJh/U$a$a;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LJh/U$a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LJh/U$a$a;

    move-result-object p0

    return-object p0
.end method

.method private final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LJh/U$a$a;
    .locals 2

    new-instance v0, LJh/U$a$a;

    invoke-static {p2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p2

    const-string v1, "identifier(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, p3, p4}, LJh/U$a$a;-><init>(Ljava/lang/String;LZh/f;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(LZh/f;)LZh/f;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJh/U$a;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/f;

    return-object p1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    invoke-static {}, LJh/U;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    invoke-static {}, LJh/U;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    invoke-static {}, LJh/U;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    invoke-static {}, LJh/U;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    invoke-static {}, LJh/U;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final h()LJh/U$a$a;
    .locals 1

    invoke-static {}, LJh/U;->f()LJh/U$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 1

    invoke-static {}, LJh/U;->g()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    invoke-static {}, LJh/U;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final k(LZh/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJh/U$a;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(Ljava/lang/String;)LJh/U$b;
    .locals 1

    const-string v0, "builtinSignature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJh/U$a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LJh/U$b;->ONE_COLLECTION_PARAMETER:LJh/U$b;

    return-object p1

    :cond_0
    invoke-virtual {p0}, LJh/U$a;->i()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJh/U$c;

    sget-object v0, LJh/U$c;->NULL:LJh/U$c;

    if-ne p1, v0, :cond_1

    sget-object p1, LJh/U$b;->OBJECT_PARAMETER_GENERIC:LJh/U$b;

    goto :goto_0

    :cond_1
    sget-object p1, LJh/U$b;->OBJECT_PARAMETER_NON_GENERIC:LJh/U$b;

    :goto_0
    return-object p1
.end method
