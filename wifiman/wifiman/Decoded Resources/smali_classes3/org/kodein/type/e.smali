.class public abstract Lorg/kodein/type/e;
.super Lorg/kodein/type/a;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/type/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/kodein/type/e$a;
    }
.end annotation


# static fields
.field public static final e:Lorg/kodein/type/e$a;

.field private static final f:LYg/m;

.field private static final g:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/kodein/type/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/kodein/type/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/kodein/type/e;->e:Lorg/kodein/type/e$a;

    sget-object v0, Lorg/kodein/type/e$c;->a:Lorg/kodein/type/e$c;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/e;->f:LYg/m;

    sget-object v0, Lorg/kodein/type/e$b;->a:Lorg/kodein/type/e$b;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/e;->g:LYg/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/kodein/type/a;-><init>()V

    return-void
.end method

.method public static final synthetic l()LYg/m;
    .locals 1

    sget-object v0, Lorg/kodein/type/e;->g:LYg/m;

    return-object v0
.end method

.method public static final synthetic m()LYg/m;
    .locals 1

    sget-object v0, Lorg/kodein/type/e;->f:LYg/m;

    return-object v0
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/b;->g(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/b;->h(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lorg/kodein/type/q;)Z
    .locals 2

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lorg/kodein/type/i;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/kodein/type/e;->e:Lorg/kodein/type/e$a;

    invoke-interface {p0}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    check-cast p1, Lorg/kodein/type/i;

    invoke-interface {p1}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/kodein/type/e$a;->a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k()I
    .locals 2

    sget-object v0, Lorg/kodein/type/e;->e:Lorg/kodein/type/e$a;

    invoke-interface {p0}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/kodein/type/e$a;->c(Ljava/lang/reflect/Type;)I

    move-result v0

    return v0
.end method
