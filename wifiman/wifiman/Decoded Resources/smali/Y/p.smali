.class public final LY/p;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LW/d;


# instance fields
.field private final b:LY/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/d;)V
    .locals 0

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LY/p;->b:LY/d;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LY/p;->b:LY/d;

    invoke-virtual {v0, p1}, LY/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LY/q;

    iget-object v1, p0, LY/p;->b:LY/d;

    invoke-virtual {v1}, LY/d;->s()LY/t;

    move-result-object v1

    invoke-direct {v0, v1}, LY/q;-><init>(LY/t;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LY/p;->b:LY/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method
