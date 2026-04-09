.class public final LY/v;
.super LY/u;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LY/u;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY/v;->r()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/util/Map$Entry;
    .locals 4

    invoke-virtual {p0}, LY/u;->h()Z

    move-result v0

    invoke-static {v0}, La0/a;->a(Z)V

    invoke-virtual {p0}, LY/u;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, LY/u;->q(I)V

    new-instance v0, LY/b;

    invoke-virtual {p0}, LY/u;->f()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LY/u;->g()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    aget-object v1, v1, v2

    invoke-virtual {p0}, LY/u;->f()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LY/u;->g()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, LY/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
