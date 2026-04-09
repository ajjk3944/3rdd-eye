.class public final LA8/r;
.super Ll7/g;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll7/g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LW7/d;)Ll7/i;
    .locals 0

    invoke-virtual {p0, p1}, LA8/r;->e(LW7/d;)Lod/g;

    move-result-object p1

    return-object p1
.end method

.method protected e(LW7/d;)Lod/g;
    .locals 5

    const-string/jumbo v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/g;

    new-instance v1, Lod/g$b;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lod/g$b;-><init>(ZJ)V

    invoke-direct {v0, p1, v1}, Lod/g;-><init>(LW7/d;Lod/g$b;)V

    return-object v0
.end method
