.class public final Lkotlin/reflect/jvm/internal/impl/types/checker/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/types/checker/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/t;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/t;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/t;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/t;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpi/M0;Lpi/M0;)Z
    .locals 2

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/d;->a:Lpi/d;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    invoke-virtual {v0, v1, p1, p2}, Lpi/d;->b(Lri/o;Lri/i;Lri/i;)Z

    move-result p1

    return p1
.end method
