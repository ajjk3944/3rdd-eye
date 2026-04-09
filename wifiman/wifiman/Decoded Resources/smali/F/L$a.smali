.class final LF/L$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/L;-><init>(LT/z1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/L;


# direct methods
.method constructor <init>(LF/L;)V
    .locals 0

    iput-object p1, p0, LF/L$a;->a:LF/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lk0/l;)V
    .locals 0

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LF/L$a;->a:LF/L;

    invoke-virtual {p1}, LF/L;->f()LF/J;

    move-result-object p1

    invoke-virtual {p1}, LF/J;->d()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk0/l;

    invoke-virtual {p0, p1}, LF/L$a;->a(Lk0/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
