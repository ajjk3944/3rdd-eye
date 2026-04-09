.class final Lo8/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/d;->l(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo8/d;


# direct methods
.method constructor <init>(Lo8/d;)V
    .locals 0

    iput-object p1, p0, Lo8/d$c;->a:Lo8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgd/g$b;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo8/d$c;->a:Lo8/d;

    invoke-static {v0}, Lo8/d;->k(Lo8/d;)LFg/a;

    move-result-object v0

    new-instance v1, Ll9/a;

    invoke-direct {v1, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lgd/g$b;

    invoke-virtual {p0, p1}, Lo8/d$c;->a(Lgd/g$b;)V

    return-void
.end method
