.class public abstract LBh/r;
.super LBh/u;
.source "SourceFile"


# instance fields
.field private final a:LBh/w0;


# direct methods
.method public constructor <init>(LBh/w0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LBh/u;-><init>()V

    iput-object p1, p0, LBh/r;->a:LBh/w0;

    return-void
.end method


# virtual methods
.method public b()LBh/w0;
    .locals 1

    iget-object v0, p0, LBh/r;->a:LBh/w0;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LBh/r;->b()LBh/w0;

    move-result-object v0

    invoke-virtual {v0}, LBh/w0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()LBh/u;
    .locals 2

    invoke-virtual {p0}, LBh/r;->b()LBh/w0;

    move-result-object v0

    invoke-virtual {v0}, LBh/w0;->d()LBh/w0;

    move-result-object v0

    invoke-static {v0}, LBh/t;->j(LBh/w0;)LBh/u;

    move-result-object v0

    const-string v1, "toDescriptorVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
