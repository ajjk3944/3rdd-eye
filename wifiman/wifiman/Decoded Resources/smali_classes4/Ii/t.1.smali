.class final LIi/t;
.super LIi/C0;
.source "SourceFile"


# instance fields
.field public final e:LIi/p;


# direct methods
.method public constructor <init>(LIi/p;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/t;->e:LIi/p;

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LIi/t;->e:LIi/p;

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    invoke-virtual {p1, v0}, LIi/p;->s(LIi/y0;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LIi/p;->I(Ljava/lang/Throwable;)V

    return-void
.end method
