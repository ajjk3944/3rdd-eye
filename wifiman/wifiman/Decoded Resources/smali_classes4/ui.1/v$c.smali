.class public final Lui/v$c;
.super Lui/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lui/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lui/v$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/v$c;

    invoke-direct {v0}, Lui/v$c;-><init>()V

    sput-object v0, Lui/v$c;->d:Lui/v$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Lui/x;->a:Lui/x;

    const/4 v1, 0x0

    const-string v2, "Unit"

    invoke-direct {p0, v2, v0, v1}, Lui/v;-><init>(Ljava/lang/String;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private static final d(Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->Z()Lpi/d0;

    move-result-object p0

    const-string v0, "getUnitType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method static synthetic e(Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lpi/S;
    .locals 0

    invoke-static {p0}, Lui/v$c;->d(Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lpi/S;

    move-result-object p0

    return-object p0
.end method
