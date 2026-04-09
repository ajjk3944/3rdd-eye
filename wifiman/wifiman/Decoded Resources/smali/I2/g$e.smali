.class public LI2/g$e;
.super LI2/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, LI2/g$e$a;

    invoke-direct {v0}, LI2/g$e$a;-><init>()V

    invoke-direct {p0, v0}, LI2/g$a;-><init>(LI2/g$d;)V

    return-void
.end method
