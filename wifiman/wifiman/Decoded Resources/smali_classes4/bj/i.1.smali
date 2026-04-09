.class public final Lbj/i;
.super Lbj/h;
.source "SourceFile"


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Lbj/o;Z)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lbj/h;-><init>(Lbj/o;)V

    iput-boolean p2, p0, Lbj/i;->c:Z

    return-void
.end method


# virtual methods
.method public n(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lbj/i;->c:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lbj/h;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
