.class public abstract LJb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# instance fields
.field private final a:Lth/d;

.field private final b:Ljava/lang/Enum;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:LXi/f;


# direct methods
.method public constructor <init>(Lth/d;Lmh/a;Ljava/lang/Enum;)V
    .locals 6

    const-string/jumbo v0, "enumClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "getValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "default"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJb/a;->a:Lth/d;

    iput-object p3, p0, LJb/a;->b:Ljava/lang/Enum;

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length p3, p1

    invoke-static {p3}, LZg/U;->d(I)I

    move-result p3

    const/16 v0, 0x10

    invoke-static {p3, v0}, Lsh/m;->d(II)I

    move-result p3

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p3, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p3, :cond_0

    aget-object v4, p1, v3

    check-cast v4, Ljava/lang/Enum;

    invoke-direct {p0, v4}, LJb/a;->h(Ljava/lang/Enum;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, LJb/a;->c:Ljava/util/Map;

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length p2, p1

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    invoke-static {p2, v0}, Lsh/m;->d(II)I

    move-result p2

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p2, p1

    :goto_1
    if-ge v2, p2, :cond_1

    aget-object v0, p1, v2

    move-object v1, v0

    check-cast v1, Ljava/lang/Enum;

    invoke-direct {p0, v1}, LJb/a;->h(Ljava/lang/Enum;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iput-object p3, p0, LJb/a;->d:Ljava/util/Map;

    iget-object p1, p0, LJb/a;->a:Lth/d;

    invoke-interface {p1}, Lth/d;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object p2, LXi/e$i;->a:LXi/e$i;

    invoke-static {p1, p2}, LXi/l;->b(Ljava/lang/String;LXi/e;)LXi/f;

    move-result-object p1

    iput-object p1, p0, LJb/a;->e:LXi/f;

    return-void
.end method

.method private final h(Ljava/lang/Enum;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const-class v0, LVi/m;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LVi/m;

    invoke-interface {p1}, LVi/m;->value()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a()LXi/f;
    .locals 1

    iget-object v0, p0, LJb/a;->e:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LJb/a;->g(LYi/e;)Ljava/lang/Enum;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p0, p1, p2}, LJb/a;->i(LYi/f;Ljava/lang/Enum;)V

    return-void
.end method

.method public final g(LYi/e;)Ljava/lang/Enum;
    .locals 6

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/e;->s()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LJb/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-nez v0, :cond_0

    iget-object v0, p0, LJb/a;->b:Ljava/lang/Enum;

    sget-object v1, LSj/a;->a:LSj/a$b;

    iget-object v2, p0, LJb/a;->a:Lth/d;

    invoke-interface {v2}, Lth/d;->l()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LJb/a;->b:Ljava/lang/Enum;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Fallback `"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "` to default `"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "` with value `"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "`"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final i(LYi/f;Ljava/lang/Enum;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJb/a;->c:Ljava/util/Map;

    invoke-static {v0, p2}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void
.end method
