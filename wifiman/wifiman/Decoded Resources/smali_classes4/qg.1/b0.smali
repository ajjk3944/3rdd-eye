.class public final Lqg/b0;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/b0$b;,
        Lqg/b0$c;,
        Lqg/b0$a;
    }
.end annotation


# instance fields
.field final b:I

.field final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput p1, p0, Lqg/b0;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lqg/b0;->c:I

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 4

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    new-instance v0, Lqg/b0$b;

    move-object v1, p1

    check-cast v1, LDg/a;

    iget v2, p0, Lqg/b0;->b:I

    iget v3, p0, Lqg/b0;->c:I

    invoke-direct {v0, v1, v2, v3}, Lqg/b0$b;-><init>(LDg/a;II)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lqg/b0$c;

    iget v1, p0, Lqg/b0;->b:I

    iget v2, p0, Lqg/b0;->c:I

    invoke-direct {v0, p1, v1, v2}, Lqg/b0$c;-><init>(LDj/b;II)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    :goto_0
    return-void
.end method
