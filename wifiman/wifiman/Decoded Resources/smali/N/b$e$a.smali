.class final LN/b$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 0

    iput-object p1, p0, LN/b$e$a;->a:LN/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LYg/s;
    .locals 2

    iget-object v0, p0, LN/b$e$a;->a:LN/b;

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    iget-object v1, p0, LN/b$e$a;->a:LN/b;

    invoke-virtual {v1}, LN/b;->x()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/b$e$a;->a()LYg/s;

    move-result-object v0

    return-object v0
.end method
