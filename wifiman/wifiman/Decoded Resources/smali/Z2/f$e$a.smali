.class final LZ2/f$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LZ2/h;


# direct methods
.method constructor <init>(LZ2/h;)V
    .locals 0

    iput-object p1, p0, LZ2/f$e$a;->a:LZ2/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LZ2/d;
    .locals 1

    iget-object v0, p0, LZ2/f$e$a;->a:LZ2/h;

    invoke-virtual {v0}, LZ2/h;->a()LZ2/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ2/f$e$a;->a()LZ2/d;

    move-result-object v0

    return-object v0
.end method
