.class final LZg/d$d;
.super LZg/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final b:LZg/d;

.field private final c:I

.field private d:I


# direct methods
.method public constructor <init>(LZg/d;II)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/d;-><init>()V

    iput-object p1, p0, LZg/d$d;->b:LZg/d;

    iput p2, p0, LZg/d$d;->c:I

    sget-object v0, LZg/d;->a:LZg/d$a;

    invoke-virtual {p1}, LZg/b;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LZg/d$a;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LZg/d$d;->d:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    sget-object v0, LZg/d;->a:LZg/d$a;

    iget v1, p0, LZg/d$d;->d:I

    invoke-virtual {v0, p1, v1}, LZg/d$a;->b(II)V

    iget-object v0, p0, LZg/d$d;->b:LZg/d;

    iget v1, p0, LZg/d$d;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, LZg/d;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget v0, p0, LZg/d$d;->d:I

    return v0
.end method
