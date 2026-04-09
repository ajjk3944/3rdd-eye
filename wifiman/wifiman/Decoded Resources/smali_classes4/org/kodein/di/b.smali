.class final Lorg/kodein/di/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/kodein/di/b;

.field private static final b:Lorg/kodein/di/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/kodein/di/b;

    invoke-direct {v0}, Lorg/kodein/di/b;-><init>()V

    sput-object v0, Lorg/kodein/di/b;->a:Lorg/kodein/di/b;

    sget-object v0, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    sget-object v1, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v1}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v1

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Lorg/kodein/di/f$a;->a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object v0

    sput-object v0, Lorg/kodein/di/b;->b:Lorg/kodein/di/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/kodein/di/f;
    .locals 1

    sget-object v0, Lorg/kodein/di/b;->b:Lorg/kodein/di/f;

    return-object v0
.end method
