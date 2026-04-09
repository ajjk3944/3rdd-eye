.class final Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;
.super Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(Lpi/M0;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;
    .locals 1

    const-string v0, "nextType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic combine(Lpi/M0;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;->a(Lpi/M0;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;

    move-result-object p1

    return-object p1
.end method
