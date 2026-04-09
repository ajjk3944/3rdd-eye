.class public LP6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP6/o;

.field private final b:[[Ljava/lang/String;


# direct methods
.method constructor <init>(LP6/o;[[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/j;->a:LP6/o;

    iput-object p2, p0, LP6/j;->b:[[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6

    iget-object v0, p0, LP6/j;->b:[[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-object v5, p0, LP6/j;->a:LP6/o;

    invoke-virtual {v5, v4}, LP6/o;->a([Ljava/lang/String;)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method
