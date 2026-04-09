.class final LIi/G0;
.super LIi/Q0;
.source "SourceFile"


# instance fields
.field private final d:Ldh/e;


# direct methods
.method public constructor <init>(Ldh/i;Lmh/p;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LIi/Q0;-><init>(Ldh/i;Z)V

    invoke-static {p2, p0, p0}, Leh/b;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    iput-object p1, p0, LIi/G0;->d:Ldh/e;

    return-void
.end method


# virtual methods
.method protected w0()V
    .locals 1

    iget-object v0, p0, LIi/G0;->d:Ldh/e;

    invoke-static {v0, p0}, LOi/a;->b(Ldh/e;Ldh/e;)V

    return-void
.end method
