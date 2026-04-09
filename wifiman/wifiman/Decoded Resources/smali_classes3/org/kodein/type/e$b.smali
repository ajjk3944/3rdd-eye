.class final Lorg/kodein/type/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/type/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lorg/kodein/type/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/type/e$b;

    invoke-direct {v0}, Lorg/kodein/type/e$b;-><init>()V

    sput-object v0, Lorg/kodein/type/e$b;->a:Lorg/kodein/type/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    new-instance v0, Lorg/kodein/type/e$b$a;

    invoke-direct {v0}, Lorg/kodein/type/e$b$a;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/e$a$a;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.reflect.GenericArrayType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    new-instance v2, Lorg/kodein/type/e$b$b;

    invoke-direct {v2}, Lorg/kodein/type/e$b$b;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/e$a$a;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/reflect/GenericArrayType;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/type/e$b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
