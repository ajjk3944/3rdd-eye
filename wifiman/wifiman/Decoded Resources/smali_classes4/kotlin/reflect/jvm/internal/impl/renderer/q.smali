.class Lkotlin/reflect/jvm/internal/impl/renderer/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/renderer/u;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/renderer/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/renderer/q;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/q;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    check-cast p1, Lpi/B0;

    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->k0(Lkotlin/reflect/jvm/internal/impl/renderer/u;Lpi/B0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
