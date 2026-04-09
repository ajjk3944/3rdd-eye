.class final LMj/b;
.super LMj/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/b$d;,
        LMj/b$a;,
        LMj/b$c;,
        LMj/b$b;,
        LMj/b$e;,
        LMj/b$f;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LMj/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    const-class p2, Lokhttp3/RequestBody;

    invoke-static {p1}, LMj/B;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LMj/b$b;->a:LMj/b$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    const-class p3, Lokhttp3/ResponseBody;

    if-ne p1, p3, :cond_1

    const-class p1, LRj/w;

    invoke-static {p2, p1}, LMj/B;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LMj/b$c;->a:LMj/b$c;

    goto :goto_0

    :cond_0
    sget-object p1, LMj/b$a;->a:LMj/b$a;

    :goto_0
    return-object p1

    :cond_1
    const-class p2, Ljava/lang/Void;

    if-ne p1, p2, :cond_2

    sget-object p1, LMj/b$f;->a:LMj/b$f;

    return-object p1

    :cond_2
    invoke-static {p1}, LMj/B;->m(Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LMj/b$e;->a:LMj/b$e;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
