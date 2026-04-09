.class public final LPj/a;
.super LMj/h$a;
.source "SourceFile"


# instance fields
.field private final a:LY6/r;

.field private final b:Z

.field private final c:Z

.field private final d:Z


# direct methods
.method private constructor <init>(LY6/r;ZZZ)V
    .locals 0

    invoke-direct {p0}, LMj/h$a;-><init>()V

    iput-object p1, p0, LPj/a;->a:LY6/r;

    iput-boolean p2, p0, LPj/a;->b:Z

    iput-boolean p3, p0, LPj/a;->c:Z

    iput-boolean p4, p0, LPj/a;->d:Z

    return-void
.end method

.method public static f()LPj/a;
    .locals 1

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    invoke-static {v0}, LPj/a;->g(LY6/r;)LPj/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(LY6/r;)LPj/a;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, LPj/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1, v1}, LPj/a;-><init>(LY6/r;ZZZ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "moshi == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static h([Ljava/lang/annotation/Annotation;)Ljava/util/Set;
    .locals 6

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, LY6/j;

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    :cond_0
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    iget-object p3, p0, LPj/a;->a:LY6/r;

    invoke-static {p2}, LPj/a;->h([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LY6/r;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)LY6/h;

    move-result-object p1

    iget-boolean p2, p0, LPj/a;->b:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/h;->e()LY6/h;

    move-result-object p1

    :cond_0
    iget-boolean p2, p0, LPj/a;->c:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LY6/h;->a()LY6/h;

    move-result-object p1

    :cond_1
    iget-boolean p2, p0, LPj/a;->d:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LY6/h;->h()LY6/h;

    move-result-object p1

    :cond_2
    new-instance p2, LPj/b;

    invoke-direct {p2, p1}, LPj/b;-><init>(LY6/h;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    iget-object p3, p0, LPj/a;->a:LY6/r;

    invoke-static {p2}, LPj/a;->h([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LY6/r;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)LY6/h;

    move-result-object p1

    iget-boolean p2, p0, LPj/a;->b:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/h;->e()LY6/h;

    move-result-object p1

    :cond_0
    iget-boolean p2, p0, LPj/a;->c:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LY6/h;->a()LY6/h;

    move-result-object p1

    :cond_1
    iget-boolean p2, p0, LPj/a;->d:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LY6/h;->h()LY6/h;

    move-result-object p1

    :cond_2
    new-instance p2, LPj/c;

    invoke-direct {p2, p1}, LPj/c;-><init>(LY6/h;)V

    return-object p2
.end method
