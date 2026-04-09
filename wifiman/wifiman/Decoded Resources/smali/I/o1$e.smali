.class final LI/o1$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/o1;->g(LH/l$a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/o1;

.field final synthetic b:LH/l$a;


# direct methods
.method constructor <init>(LI/o1;LH/l$a;)V
    .locals 0

    iput-object p1, p0, LI/o1$e;->a:LI/o1;

    iput-object p2, p0, LI/o1$e;->b:LH/l$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LI/o1$e;->a:LI/o1;

    invoke-static {p1}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object p1

    iget-object v0, p0, LI/o1$e;->b:LH/l$a;

    invoke-virtual {p1, v0}, LH/l;->o(LH/l$a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI/o1$e;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
