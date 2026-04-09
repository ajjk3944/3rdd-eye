.class final LNh/G$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNh/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LZh/f;

.field private final b:LQh/g;


# direct methods
.method public constructor <init>(LZh/f;LQh/g;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/G$a;->a:LZh/f;

    iput-object p2, p0, LNh/G$a;->b:LQh/g;

    return-void
.end method


# virtual methods
.method public final a()LQh/g;
    .locals 1

    iget-object v0, p0, LNh/G$a;->b:LQh/g;

    return-object v0
.end method

.method public final b()LZh/f;
    .locals 1

    iget-object v0, p0, LNh/G$a;->a:LZh/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LNh/G$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, LNh/G$a;->a:LZh/f;

    check-cast p1, LNh/G$a;

    iget-object p1, p1, LNh/G$a;->a:LZh/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LNh/G$a;->a:LZh/f;

    invoke-virtual {v0}, LZh/f;->hashCode()I

    move-result v0

    return v0
.end method
