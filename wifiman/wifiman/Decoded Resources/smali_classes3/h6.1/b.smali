.class public abstract Lh6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm6/a;Lu6/b;FFF)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float v3, p2, p4

    sub-float v4, p3, p4

    add-float v5, p2, p4

    add-float v6, p3, p4

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lm6/a;->b(Lu6/b;FFFF)V

    return-void
.end method
