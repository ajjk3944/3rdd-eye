.class final LIi/g0;
.super LIi/C0;
.source "SourceFile"


# instance fields
.field private final e:LIi/e0;


# direct methods
.method public constructor <init>(LIi/e0;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/g0;->e:LIi/e0;

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LIi/g0;->e:LIi/e0;

    invoke-interface {p1}, LIi/e0;->dispose()V

    return-void
.end method
