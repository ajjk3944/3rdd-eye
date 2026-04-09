.class final LRh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;


# static fields
.field public static final a:LRh/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LRh/e;

    invoke-direct {v0}, LRh/e;-><init>()V

    sput-object v0, LRh/e;->a:LRh/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, LRh/e;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public e()LZh/c;
    .locals 1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c$a;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)LZh/c;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lpi/S;
    .locals 1

    invoke-direct {p0}, LRh/e;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public j()LBh/g0;
    .locals 1

    invoke-direct {p0}, LRh/e;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "[EnhancedType]"

    return-object v0
.end method
