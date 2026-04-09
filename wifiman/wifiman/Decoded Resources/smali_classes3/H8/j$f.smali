.class final LH8/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/j;->w0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/j;


# direct methods
.method constructor <init>(LH8/j;)V
    .locals 0

    iput-object p1, p0, LH8/j$f;->a:LH8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/h;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH8/j$f;->a:LH8/j;

    invoke-static {v0}, LH8/j;->x0(LH8/j;)Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$E$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Li8/a$b$E$a;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p0, p1}, LH8/j$f;->a(Lcom/ui/wifiman/model/teleport/h;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
