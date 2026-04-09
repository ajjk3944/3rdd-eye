.class Lzj/j$a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzj/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:[Lyj/u;


# direct methods
.method constructor <init>([Lyj/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    iput-object p1, p0, Lzj/j$a;->a:[Lyj/u;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lzj/j$b;

    iget-object v1, p0, Lzj/j$a;->a:[Lyj/u;

    invoke-direct {v0, v1}, Lzj/j$b;-><init>([Lyj/u;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lzj/j$a;->a:[Lyj/u;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method
