.class final LIi/D0$d;
.super LIi/C0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic e:LIi/D0;


# direct methods
.method public constructor <init>(LIi/D0;LSi/e;)V
    .locals 0

    iput-object p1, p0, LIi/D0$d;->e:LIi/D0;

    invoke-direct {p0}, LIi/C0;-><init>()V

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LIi/D0$d;->e:LIi/D0;

    invoke-virtual {p1}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIi/C;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const/4 p1, 0x0

    throw p1
.end method
