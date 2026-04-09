.class public final LZg/c0$a;
.super LZg/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZg/c0;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private c:I

.field private d:I

.field final synthetic e:LZg/c0;


# direct methods
.method constructor <init>(LZg/c0;)V
    .locals 1

    iput-object p1, p0, LZg/c0$a;->e:LZg/c0;

    invoke-direct {p0}, LZg/c;-><init>()V

    invoke-virtual {p1}, LZg/b;->size()I

    move-result v0

    iput v0, p0, LZg/c0$a;->c:I

    invoke-static {p1}, LZg/c0;->C(LZg/c0;)I

    move-result p1

    iput p1, p0, LZg/c0$a;->d:I

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 2

    iget v0, p0, LZg/c0$a;->c:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LZg/c;->e()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZg/c0$a;->e:LZg/c0;

    invoke-static {v0}, LZg/c0;->v(LZg/c0;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZg/c0$a;->d:I

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, LZg/c;->f(Ljava/lang/Object;)V

    iget-object v0, p0, LZg/c0$a;->e:LZg/c0;

    iget v1, p0, LZg/c0$a;->d:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, LZg/c0;->y(LZg/c0;)I

    move-result v0

    rem-int/2addr v1, v0

    iput v1, p0, LZg/c0$a;->d:I

    iget v0, p0, LZg/c0$a;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LZg/c0$a;->c:I

    :goto_0
    return-void
.end method
