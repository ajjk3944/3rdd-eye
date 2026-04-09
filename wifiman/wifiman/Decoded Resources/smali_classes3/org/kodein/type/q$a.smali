.class public final Lorg/kodein/type/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/type/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lorg/kodein/type/q$a;

.field private static final b:Lorg/kodein/type/q;

.field private static final c:Lorg/kodein/type/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/type/q$a;

    invoke-direct {v0}, Lorg/kodein/type/q$a;-><init>()V

    sput-object v0, Lorg/kodein/type/q$a;->a:Lorg/kodein/type/q$a;

    const-class v0, LYg/J;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->b(Lth/d;)Lorg/kodein/type/q;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/q$a;->b:Lorg/kodein/type/q;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->b(Lth/d;)Lorg/kodein/type/q;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/q$a;->c:Lorg/kodein/type/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/kodein/type/q;
    .locals 1

    sget-object v0, Lorg/kodein/type/q$a;->c:Lorg/kodein/type/q;

    return-object v0
.end method

.method public final b()Lorg/kodein/type/q;
    .locals 1

    sget-object v0, Lorg/kodein/type/q$a;->b:Lorg/kodein/type/q;

    return-object v0
.end method
