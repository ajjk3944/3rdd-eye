.class LIi/Q0;
.super LIi/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ldh/i;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LIi/a;-><init>(Ldh/i;ZZ)V

    return-void
.end method


# virtual methods
.method protected c0(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0, p1}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
