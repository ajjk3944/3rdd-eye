.class final LDc/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/p;-><init>(LZc/f;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field static final synthetic b:[Lth/l;


# instance fields
.field final synthetic a:LDc/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#5>"

    const/4 v2, 0x0

    const-class v3, LDc/p;

    const-string v4, "combiner"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LDc/p$h;->b:[Lth/l;

    return-void
.end method

.method constructor <init>(LDc/p;)V
    .locals 0

    iput-object p1, p0, LDc/p$h;->a:LDc/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final b(LYg/m;)LDc/k;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDc/k;

    return-object p0
.end method


# virtual methods
.method public final a(LDc/p$b;)Ll9/a;
    .locals 8

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LDc/p$b$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, LDc/p$h;->a:LDc/p;

    invoke-static {v0}, LDc/p;->e(LDc/p;)Lorg/kodein/di/DI;

    move-result-object v0

    check-cast p1, LDc/p$b$b;

    invoke-virtual {p1}, LDc/p$b$b;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "noConnection"

    :cond_0
    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, LDc/p$h$a;

    invoke-direct {v4}, LDc/p$h$a;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Ljava/lang/String;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v4, Lorg/kodein/type/d;

    new-instance v6, LDc/p$h$b;

    invoke-direct {v6}, LDc/p$h$b;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LDc/k;

    invoke-direct {v4, v6, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v5, LDc/p$h$c;

    invoke-direct {v5, v2}, LDc/p$h$c;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v3, v4, v1, v5}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object v0

    sget-object v2, LDc/p$h;->b:[Lth/l;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, LDc/p$h;->b(LYg/m;)LDc/k;

    move-result-object v2

    invoke-virtual {p1}, LDc/p$b$b;->c()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    iget-object v4, p0, LDc/p$h;->a:LDc/p;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LEc/t$c;

    invoke-static {v0}, LDc/p$h;->b(LYg/m;)LDc/k;

    move-result-object v7

    invoke-static {v4, p1, v6, v7}, LDc/p;->h(LDc/p;LDc/p$b$b;LEc/t$c;LDc/k;)LEc/t;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-static {v6, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    if-eqz v6, :cond_1

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v5}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, LDc/p$c;

    invoke-direct {v0, v2, p1}, LDc/p$c;-><init>(LDc/k;Ljava/util/Map;)V

    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of p1, p1, LDc/p$b$a;

    if-eqz p1, :cond_5

    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_2
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDc/p$b;

    invoke-virtual {p0, p1}, LDc/p$h;->a(LDc/p$b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
