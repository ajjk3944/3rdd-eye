.class public final Lorg/kodein/di/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/di/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lorg/kodein/di/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/di/f$a;

    invoke-direct {v0}, Lorg/kodein/di/f$a;-><init>()V

    sput-object v0, Lorg/kodein/di/f$a;->a:Lorg/kodein/di/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/f$b;

    invoke-direct {v0, p1, p2}, Lorg/kodein/di/f$b;-><init>(Lorg/kodein/type/q;Ljava/lang/Object;)V

    return-object v0
.end method
