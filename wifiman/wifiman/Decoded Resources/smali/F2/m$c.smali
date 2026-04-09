.class LF2/m$c;
.super LF2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF2/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a()LF2/l;
    .locals 1

    invoke-virtual {p0}, LF2/m$c;->d()LF2/m$b;

    move-result-object v0

    return-object v0
.end method

.method protected d()LF2/m$b;
    .locals 1

    new-instance v0, LF2/m$b;

    invoke-direct {v0, p0}, LF2/m$b;-><init>(LF2/m$c;)V

    return-object v0
.end method

.method public e(ILandroid/graphics/Bitmap$Config;)LF2/m$b;
    .locals 1

    invoke-virtual {p0}, LF2/c;->b()LF2/l;

    move-result-object v0

    check-cast v0, LF2/m$b;

    invoke-virtual {v0, p1, p2}, LF2/m$b;->b(ILandroid/graphics/Bitmap$Config;)V

    return-object v0
.end method
