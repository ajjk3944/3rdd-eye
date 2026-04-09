.class public final LY/r;
.super LZg/b;
.source "SourceFile"

# interfaces
.implements LW/b;


# instance fields
.field private final a:LY/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/d;)V
    .locals 0

    invoke-direct {p0}, LZg/b;-><init>()V

    iput-object p1, p0, LY/r;->a:LY/d;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LY/r;->a:LY/d;

    invoke-virtual {v0, p1}, LZg/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LY/s;

    iget-object v1, p0, LY/r;->a:LY/d;

    invoke-virtual {v1}, LY/d;->s()LY/t;

    move-result-object v1

    invoke-direct {v0, v1}, LY/s;-><init>(LY/t;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LY/r;->a:LY/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method
