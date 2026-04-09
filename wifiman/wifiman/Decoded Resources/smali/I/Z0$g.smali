.class final LI/Z0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/Z0;->performContextMenuAction(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/Z0;


# direct methods
.method constructor <init>(LI/Z0;)V
    .locals 0

    iput-object p1, p0, LI/Z0$g;->a:LI/Z0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LI/I;)V
    .locals 2

    iget-object v0, p0, LI/Z0$g;->a:LI/Z0;

    invoke-static {v0}, LI/Z0;->d(LI/Z0;)LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, LI/I;->u(II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI/I;

    invoke-virtual {p0, p1}, LI/Z0$g;->a(LI/I;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
