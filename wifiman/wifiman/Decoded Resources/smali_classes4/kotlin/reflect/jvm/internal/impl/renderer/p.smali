.class Lkotlin/reflect/jvm/internal/impl/renderer/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/renderer/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/p;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/p;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/p;->a:Lkotlin/reflect/jvm/internal/impl/renderer/p;

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

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->j0(Lpi/S;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
