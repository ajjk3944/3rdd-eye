.class Lpi/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/A0;


# direct methods
.method public constructor <init>(Lpi/A0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/y0;->a:Lpi/A0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/y0;->a:Lpi/A0;

    invoke-static {v0}, Lpi/A0;->a(Lpi/A0;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v0

    return-object v0
.end method
