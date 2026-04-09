.class public abstract LPi/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[LPi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LPi/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [LPi/a;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPi/a;

    sput-object v0, LPi/e;->a:[LPi/a;

    return-void
.end method

.method public static final a(LDj/a;)LLi/g;
    .locals 8

    new-instance v7, LPi/d;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LPi/d;-><init>(LDj/a;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static final b(LLi/g;Ldh/i;)LDj/a;
    .locals 2

    new-instance v0, LPi/b;

    invoke-static {}, LIi/c0;->d()LIi/J;

    move-result-object v1

    invoke-virtual {v1, p1}, Ldh/a;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LPi/b;-><init>(LLi/g;Ldh/i;)V

    return-object v0
.end method

.method public static final c(LDj/a;Ldh/i;)LDj/a;
    .locals 1

    sget-object p1, LPi/e;->a:[LPi/a;

    array-length v0, p1

    if-gtz v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    aget-object p0, p1, p0

    const/4 p0, 0x0

    throw p0
.end method
