.class final LY6/d;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY6/d$b;
    }
.end annotation


# static fields
.field public static final d:LY6/h$d;


# instance fields
.field private final a:LY6/c;

.field private final b:[LY6/d$b;

.field private final c:LY6/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY6/d$a;

    invoke-direct {v0}, LY6/d$a;-><init>()V

    sput-object v0, LY6/d;->d:LY6/h$d;

    return-void
.end method

.method constructor <init>(LY6/c;Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, LY6/h;-><init>()V

    iput-object p1, p0, LY6/d;->a:LY6/c;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [LY6/d$b;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LY6/d$b;

    iput-object p1, p0, LY6/d;->b:[LY6/d$b;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object p1

    iput-object p1, p0, LY6/d;->c:LY6/k$b;

    return-void
.end method


# virtual methods
.method public b(LY6/k;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, LY6/d;->a:LY6/c;

    invoke-virtual {v0}, LY6/c;->b()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-virtual {p1}, LY6/k;->g()V

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LY6/d;->c:LY6/k$b;

    invoke-virtual {p1, v1}, LY6/k;->p0(LY6/k$b;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_0
    iget-object v2, p0, LY6/d;->b:[LY6/d$b;

    aget-object v1, v2, v1

    invoke-virtual {v1, p1, v0}, LY6/d$b;->a(LY6/k;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LY6/k;->j()V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :goto_1
    invoke-static {p1}, La7/c;->t(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public j(LY6/o;Ljava/lang/Object;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    iget-object v0, p0, LY6/d;->b:[LY6/d$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, v3, LY6/d$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v4}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    invoke-virtual {v3, p1, p2}, LY6/d$b;->b(LY6/o;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LY6/o;->v()LY6/o;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "JsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY6/d;->a:LY6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
