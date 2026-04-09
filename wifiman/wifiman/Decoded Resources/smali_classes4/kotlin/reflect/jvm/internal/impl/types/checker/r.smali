.class public final Lkotlin/reflect/jvm/internal/impl/types/checker/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/types/checker/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/r;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/r;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/r;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpi/M0;)Z
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/c;->a:Lpi/c;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->I0(ZZ)Lpi/u0;

    move-result-object v1

    invoke-static {p1}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object p1

    sget-object v2, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    invoke-virtual {v0, v1, p1, v2}, Lpi/c;->a(Lpi/u0;Lri/j;Lpi/u0$c;)Z

    move-result p1

    return p1
.end method
