.class final LF2/i$b;
.super LF2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
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

    invoke-virtual {p0}, LF2/i$b;->d()LF2/i$a;

    move-result-object v0

    return-object v0
.end method

.method protected d()LF2/i$a;
    .locals 1

    new-instance v0, LF2/i$a;

    invoke-direct {v0, p0}, LF2/i$a;-><init>(LF2/i$b;)V

    return-object v0
.end method

.method e(ILjava/lang/Class;)LF2/i$a;
    .locals 1

    invoke-virtual {p0}, LF2/c;->b()LF2/l;

    move-result-object v0

    check-cast v0, LF2/i$a;

    invoke-virtual {v0, p1, p2}, LF2/i$a;->b(ILjava/lang/Class;)V

    return-object v0
.end method
