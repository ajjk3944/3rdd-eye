.class final Ls0/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/l;-><init>(Ls0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/l;


# direct methods
.method constructor <init>(Ls0/l;)V
    .locals 0

    iput-object p1, p0, Ls0/l$a;->a:Ls0/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls0/k;)V
    .locals 0

    iget-object p1, p0, Ls0/l$a;->a:Ls0/l;

    invoke-static {p1}, Ls0/l;->e(Ls0/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls0/k;

    invoke-virtual {p0, p1}, Ls0/l$a;->a(Ls0/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
