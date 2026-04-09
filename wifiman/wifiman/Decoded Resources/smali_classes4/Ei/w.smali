.class public final LEi/w;
.super LEi/u;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEi/u;-><init>()V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LEi/u;->h()Z

    move-result v0

    invoke-static {v0}, LHi/a;->a(Z)V

    invoke-virtual {p0}, LEi/u;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, LEi/u;->q(I)V

    invoke-virtual {p0}, LEi/u;->f()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LEi/u;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    aget-object v0, v0, v1

    return-object v0
.end method
