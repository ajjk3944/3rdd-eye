.class final LF/m$e$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$e$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;


# direct methods
.method constructor <init>(LF/E;)V
    .locals 0

    iput-object p1, p0, LF/m$e$a$b;->a:LF/E;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF/j0;
    .locals 1

    iget-object v0, p0, LF/m$e$a$b;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/m$e$a$b;->a()LF/j0;

    move-result-object v0

    return-object v0
.end method
