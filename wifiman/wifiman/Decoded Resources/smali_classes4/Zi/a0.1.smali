.class public final LZi/a0;
.super LZi/k0;
.source "SourceFile"


# direct methods
.method public constructor <init>(LXi/f;LXi/f;)V
    .locals 2

    const-string v0, "keyDesc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.collections.LinkedHashMap"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, LZi/k0;-><init>(Ljava/lang/String;LXi/f;LXi/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
