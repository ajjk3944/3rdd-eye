.class final LLg/k$b;
.super LLg/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(LLg/l;)V
    .locals 0

    invoke-direct {p0}, LLg/i$b;-><init>()V

    invoke-virtual {p0, p1}, LLg/i$b;->y(LLg/l;)V

    return-void
.end method
