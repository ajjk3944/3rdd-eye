.class Lui/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lui/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/x;

    invoke-direct {v0}, Lui/x;-><init>()V

    sput-object v0, Lui/x;->a:Lui/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/builtins/i;

    invoke-static {p1}, Lui/v$c;->e(Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
