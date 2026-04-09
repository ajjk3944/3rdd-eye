.class Lui/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lui/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/w;

    invoke-direct {v0}, Lui/w;-><init>()V

    sput-object v0, Lui/w;->a:Lui/w;

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

    invoke-static {p1}, Lui/v$b;->e(Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
