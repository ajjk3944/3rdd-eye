.class Lzj/j$c;
.super Ljava/util/AbstractMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzj/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:[Lyj/u;


# direct methods
.method public constructor <init>([Lyj/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    iput-object p1, p0, Lzj/j$c;->a:[Lyj/u;

    return-void
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 2

    new-instance v0, Lzj/j$a;

    iget-object v1, p0, Lzj/j$c;->a:[Lyj/u;

    invoke-direct {v0, v1}, Lzj/j$a;-><init>([Lyj/u;)V

    return-object v0
.end method
