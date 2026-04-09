.class public final Lorg/kodein/di/DI$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/di/DI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field static final synthetic a:Lorg/kodein/di/DI$c;

.field private static b:Z

.field private static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/di/DI$c;

    invoke-direct {v0}, Lorg/kodein/di/DI$c;-><init>()V

    sput-object v0, Lorg/kodein/di/DI$c;->a:Lorg/kodein/di/DI$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Lorg/kodein/di/DI$c;ZLmh/l;ILjava/lang/Object;)Lorg/kodein/di/j;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/kodein/di/DI$c;->c(ZLmh/l;)Lorg/kodein/di/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    sget-boolean v0, Lorg/kodein/di/DI$c;->c:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    sget-boolean v0, Lorg/kodein/di/DI$c;->b:Z

    return v0
.end method

.method public final c(ZLmh/l;)Lorg/kodein/di/j;
    .locals 2

    const-string v0, "init"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/j;

    new-instance v1, Lorg/kodein/di/DI$c$a;

    invoke-direct {v1, p1, p2}, Lorg/kodein/di/DI$c$a;-><init>(ZLmh/l;)V

    invoke-direct {v0, v1}, Lorg/kodein/di/j;-><init>(Lmh/a;)V

    return-object v0
.end method
