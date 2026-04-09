.class Lw5/a$a;
.super Lt5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt5/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw5/a;)V
    .locals 2

    iget v0, p1, Lw5/a;->h:I

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lw5/a;->s()I

    move-result v0

    :cond_0
    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    const/16 v0, 0x9

    iput v0, p1, Lw5/a;->h:I

    goto :goto_0

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    const/16 v0, 0x8

    iput v0, p1, Lw5/a;->h:I

    goto :goto_0

    :cond_2
    const/16 v1, 0xe

    if-ne v0, v1, :cond_3

    const/16 v0, 0xa

    iput v0, p1, Lw5/a;->h:I

    :goto_0
    return-void

    :cond_3
    const-string/jumbo v0, "a name"

    invoke-static {p1, v0}, Lw5/a;->a(Lw5/a;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1
.end method
