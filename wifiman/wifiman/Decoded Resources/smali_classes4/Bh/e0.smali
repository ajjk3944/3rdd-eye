.class public final LBh/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBh/e0$a;
    }
.end annotation


# static fields
.field public static final e:LBh/e0$a;

.field static final synthetic f:[Lth/l;


# instance fields
.field private final a:LBh/e;

.field private final b:Lmh/l;

.field private final c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

.field private final d:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LBh/e0;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "scopeForOwnerModule"

    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LBh/e0;->f:[Lth/l;

    new-instance v0, LBh/e0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBh/e0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LBh/e0;->e:LBh/e0$a;

    return-void
.end method

.method private constructor <init>(LBh/e;Loi/n;Lmh/l;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LBh/e0;->a:LBh/e;

    .line 4
    iput-object p3, p0, LBh/e0;->b:Lmh/l;

    .line 5
    iput-object p4, p0, LBh/e0;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    .line 6
    new-instance p1, LBh/c0;

    invoke-direct {p1, p0}, LBh/c0;-><init>(LBh/e0;)V

    invoke-interface {p2, p1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LBh/e0;->d:Loi/i;

    return-void
.end method

.method public synthetic constructor <init>(LBh/e;Loi/n;Lmh/l;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LBh/e0;-><init>(LBh/e;Loi/n;Lmh/l;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V

    return-void
.end method

.method static synthetic a(LBh/e0;)Lii/k;
    .locals 0

    invoke-static {p0}, LBh/e0;->f(LBh/e0;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 0

    invoke-static {p0, p1}, LBh/e0;->d(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 0

    iget-object p0, p0, LBh/e0;->b:Lmh/l;

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lii/k;

    return-object p0
.end method

.method private final e()Lii/k;
    .locals 3

    iget-object v0, p0, LBh/e0;->d:Loi/i;

    sget-object v1, LBh/e0;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii/k;

    return-object v0
.end method

.method private static final f(LBh/e0;)Lii/k;
    .locals 1

    iget-object v0, p0, LBh/e0;->b:Lmh/l;

    iget-object p0, p0, LBh/e0;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-interface {v0, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lii/k;

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 2

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBh/e0;->a:LBh/e;

    invoke-static {v0}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->d(LBh/G;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, LBh/e0;->e()Lii/k;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LBh/e0;->a:LBh/e;

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->e(Lpi/v0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LBh/e0;->e()Lii/k;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, LBh/e0;->a:LBh/e;

    new-instance v1, LBh/d0;

    invoke-direct {v1, p0, p1}, LBh/d0;-><init>(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->c(LBh/e;Lmh/a;)Lii/k;

    move-result-object p1

    return-object p1
.end method
