.class Lkotlin/reflect/jvm/internal/impl/renderer/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/renderer/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/r;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/r;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/r;->a:Lkotlin/reflect/jvm/internal/impl/renderer/r;

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

    check-cast p1, LBh/s0;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->l0(LBh/s0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
