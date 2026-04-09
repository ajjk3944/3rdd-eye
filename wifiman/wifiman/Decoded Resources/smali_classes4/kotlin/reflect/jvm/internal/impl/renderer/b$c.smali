.class public final Lkotlin/reflect/jvm/internal/impl/renderer/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/renderer/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/renderer/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/renderer/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;->a:Lkotlin/reflect/jvm/internal/impl/renderer/b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(LBh/h;)Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/G;->b(LZh/f;)Ljava/lang/String;

    move-result-object v0

    instance-of v1, p1, LBh/l0;

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;->c(LBh/m;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final c(LBh/m;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, LBh/e;

    if-eqz v0, :cond_0

    check-cast p1, LBh/h;

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;->b(LBh/h;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LBh/M;

    if-eqz v0, :cond_1

    check-cast p1, LBh/M;

    invoke-interface {p1}, LBh/M;->e()LZh/c;

    move-result-object p1

    invoke-virtual {p1}, LZh/c;->j()LZh/d;

    move-result-object p1

    const-string v0, "toUnsafe(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/renderer/G;->a(LZh/d;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(LBh/h;Lkotlin/reflect/jvm/internal/impl/renderer/n;)Ljava/lang/String;
    .locals 1

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/renderer/b$c;->b(LBh/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
