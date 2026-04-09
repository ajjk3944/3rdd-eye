.class public final Lo/Y$a;
.super LZg/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/Y;->a(Lo/W;)LZg/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lo/W;


# direct methods
.method constructor <init>(Lo/W;)V
    .locals 0

    iput-object p1, p0, Lo/Y$a;->b:Lo/W;

    invoke-direct {p0}, LZg/Q;-><init>()V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 3

    iget-object v0, p0, Lo/Y$a;->b:Lo/W;

    iget v1, p0, Lo/Y$a;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/Y$a;->a:I

    invoke-virtual {v0, v1}, Lo/W;->k(I)I

    move-result v0

    return v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lo/Y$a;->a:I

    iget-object v1, p0, Lo/Y$a;->b:Lo/W;

    invoke-virtual {v1}, Lo/W;->p()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
