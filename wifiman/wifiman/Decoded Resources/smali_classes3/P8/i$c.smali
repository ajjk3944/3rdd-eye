.class final LP8/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/i;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/i;


# direct methods
.method constructor <init>(LP8/i;)V
    .locals 0

    iput-object p1, p0, LP8/i$c;->a:LP8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LP8/i$c;->a:LP8/i;

    invoke-virtual {p1}, LP8/i;->s0()LLi/y;

    move-result-object p1

    sget-object v0, LIf/B$a$a;->a:LIf/B$a$a;

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LP8/i$c;->a(Ljava/lang/Integer;)V

    return-void
.end method
