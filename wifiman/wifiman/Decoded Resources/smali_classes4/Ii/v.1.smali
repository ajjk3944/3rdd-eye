.class final LIi/v;
.super LIi/C0;
.source "SourceFile"

# interfaces
.implements LIi/u;


# instance fields
.field public final e:LIi/w;


# direct methods
.method public constructor <init>(LIi/w;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/v;->e:LIi/w;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    invoke-virtual {v0, p1}, LIi/D0;->I(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()LIi/y0;
    .locals 1

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LIi/v;->e:LIi/w;

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    invoke-interface {p1, v0}, LIi/w;->h(LIi/M0;)V

    return-void
.end method
