.class Lkotlin/reflect/jvm/internal/impl/renderer/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/renderer/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/x;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/x;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/x;->a:Lkotlin/reflect/jvm/internal/impl/renderer/x;

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

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/renderer/z;->s(Lpi/S;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
