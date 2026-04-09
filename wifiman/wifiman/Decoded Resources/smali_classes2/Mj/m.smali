.class abstract LMj/m;
.super LMj/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/m$b;,
        LMj/m$c;,
        LMj/m$a;
    }
.end annotation


# instance fields
.field private final a:LMj/v;

.field private final b:Lokhttp3/Call$Factory;

.field private final c:LMj/h;


# direct methods
.method constructor <init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;)V
    .locals 0

    invoke-direct {p0}, LMj/y;-><init>()V

    iput-object p1, p0, LMj/m;->a:LMj/v;

    iput-object p2, p0, LMj/m;->b:Lokhttp3/Call$Factory;

    iput-object p3, p0, LMj/m;->c:LMj/h;

    return-void
.end method

.method private static d(LMj/x;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LMj/e;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p2, p3}, LMj/x;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LMj/e;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p3, "Unable to create call adapter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, p3, p2}, LMj/B;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static e(LMj/x;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)LMj/h;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, p2, v0}, LMj/x;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LMj/h;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "Unable to create converter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, v0, p2}, LMj/B;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static f(LMj/x;Ljava/lang/reflect/Method;LMj/v;)LMj/m;
    .locals 12

    const/4 v0, 0x1

    iget-boolean v1, p2, LMj/v;->l:Z

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-class v3, LMj/w;

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v5

    array-length v6, v5

    sub-int/2addr v6, v0

    aget-object v5, v5, v6

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, v5}, LMj/B;->f(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, LMj/B;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    const-class v7, LMj/d;

    if-ne v6, v3, :cond_0

    instance-of v6, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_0

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, v5}, LMj/B;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v5

    move v8, v0

    move v6, v4

    goto :goto_0

    :cond_0
    invoke-static {v5}, LMj/B;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    if-eq v6, v7, :cond_1

    invoke-static {v5}, LMj/B;->m(Ljava/lang/reflect/Type;)Z

    move-result v6

    move v8, v4

    :goto_0
    new-instance v9, LMj/B$b;

    const/4 v10, 0x0

    new-array v0, v0, [Ljava/lang/reflect/Type;

    aput-object v5, v0, v4

    invoke-direct {v9, v10, v7, v0}, LMj/B$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    invoke-static {v2}, LMj/A;->a([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object v2

    move v11, v6

    goto :goto_1

    :cond_1
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, v5}, LMj/B;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    invoke-static {p1, p2, p0}, LMj/B;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v9

    move v8, v4

    move v11, v8

    :goto_1
    invoke-static {p0, p1, v9, v2}, LMj/m;->d(LMj/x;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LMj/e;

    move-result-object v9

    invoke-interface {v9}, LMj/e;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    const-class v2, Lokhttp3/Response;

    if-eq v0, v2, :cond_8

    if-eq v0, v3, :cond_7

    iget-object v2, p2, LMj/v;->d:Ljava/lang/String;

    const-string v3, "HEAD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-class v2, Ljava/lang/Void;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v0}, LMj/B;->m(Ljava/lang/reflect/Type;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string p0, "HEAD method must use Void or Unit as response type."

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LMj/B;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_2
    invoke-static {p0, p1, v0}, LMj/m;->e(LMj/x;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)LMj/h;

    move-result-object p1

    iget-object v7, p0, LMj/x;->b:Lokhttp3/Call$Factory;

    if-nez v1, :cond_5

    new-instance p0, LMj/m$a;

    invoke-direct {p0, p2, v7, p1, v9}, LMj/m$a;-><init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;LMj/e;)V

    return-object p0

    :cond_5
    if-eqz v8, :cond_6

    new-instance p0, LMj/m$c;

    invoke-direct {p0, p2, v7, p1, v9}, LMj/m$c;-><init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;LMj/e;)V

    return-object p0

    :cond_6
    new-instance p0, LMj/m$b;

    const/4 v10, 0x0

    move-object v5, p0

    move-object v6, p2

    move-object v8, p1

    invoke-direct/range {v5 .. v11}, LMj/m$b;-><init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;LMj/e;ZZ)V

    return-object p0

    :cond_7
    const-string p0, "Response must include generic type (e.g., Response<String>)"

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LMj/B;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\'"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LMj/B;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LMj/B;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method final a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    new-instance v6, LMj/p;

    iget-object v1, p0, LMj/m;->a:LMj/v;

    iget-object v4, p0, LMj/m;->b:Lokhttp3/Call$Factory;

    iget-object v5, p0, LMj/m;->c:LMj/h;

    move-object v0, v6

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, LMj/p;-><init>(LMj/v;Ljava/lang/Object;[Ljava/lang/Object;Lokhttp3/Call$Factory;LMj/h;)V

    invoke-virtual {p0, v6, p2}, LMj/m;->c(LMj/d;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract c(LMj/d;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
