.class final LIi/V0;
.super LNi/y;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final e:J


# direct methods
.method public constructor <init>(JLdh/e;)V
    .locals 1

    invoke-interface {p3}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-direct {p0, v0, p3}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    iput-wide p1, p0, LIi/V0;->e:J

    return-void
.end method


# virtual methods
.method public o0()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LIi/a;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LIi/V0;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 3

    iget-wide v0, p0, LIi/V0;->e:J

    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object v2

    invoke-static {v2}, LIi/Y;->b(Ldh/i;)LIi/X;

    move-result-object v2

    invoke-static {v0, v1, v2, p0}, LIi/W0;->a(JLIi/X;LIi/y0;)Lkotlinx/coroutines/TimeoutCancellationException;

    move-result-object v0

    invoke-virtual {p0, v0}, LIi/D0;->A(Ljava/lang/Throwable;)Z

    return-void
.end method
