.class public final LFi/n;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LCi/e;


# instance fields
.field private final b:LFi/c;


# direct methods
.method public constructor <init>(LFi/c;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LFi/n;->b:LFi/c;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LFi/n;->b:LFi/c;

    invoke-virtual {v0, p1}, LFi/c;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LFi/o;

    iget-object v1, p0, LFi/n;->b:LFi/c;

    invoke-direct {v0, v1}, LFi/o;-><init>(LFi/c;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LFi/n;->b:LFi/c;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method
