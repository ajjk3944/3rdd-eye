.class final LDc/p$f;
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
.field public static final a:LDc/p$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/p$f;

    invoke-direct {v0}, LDc/p$f;-><init>()V

    sput-object v0, LDc/p$f;->a:LDc/p$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LDc/p$f;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Discovery Engines DISPOSED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LDc/p$f;->b(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)Lgg/f;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDc/p$c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LDc/p$c;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEc/t;

    invoke-interface {v2}, LEc/t;->b()Lgg/i;

    move-result-object v2

    new-instance v3, LDc/p$f$a;

    invoke-direct {v3, p1}, LDc/p$f$a;-><init>(LDc/p$c;)V

    invoke-virtual {v2, v3}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object v0

    new-instance v1, LDc/p$f$b;

    invoke-direct {v1, p1}, LDc/p$f$b;-><init>(LDc/p$c;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LDc/q;

    invoke-direct {v0}, LDc/q;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->y(Lkg/a;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    sget-object v0, LDc/p$f$c;->a:LDc/p$f$c;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method
