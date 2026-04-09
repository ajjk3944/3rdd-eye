.class public final LEi/m;
.super LEi/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(LEi/f;)V
    .locals 4

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    new-array v1, v0, [LEi/u;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, LEi/z;

    invoke-direct {v3}, LEi/z;-><init>()V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v1}, LEi/g;-><init>(LEi/f;[LEi/u;)V

    return-void
.end method
