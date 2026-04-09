.class public abstract LN4/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/G$a;,
        LN4/G$c;,
        LN4/G$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(LN4/G$a;LN4/G$c;LN4/G$b;)LN4/G;
    .locals 1

    new-instance v0, LN4/B;

    invoke-direct {v0, p0, p1, p2}, LN4/B;-><init>(LN4/G$a;LN4/G$c;LN4/G$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()LN4/G$a;
.end method

.method public abstract c()LN4/G$b;
.end method

.method public abstract d()LN4/G$c;
.end method
