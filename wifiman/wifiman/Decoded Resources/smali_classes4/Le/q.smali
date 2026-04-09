.class public final synthetic LLe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lof/a$c;

.field public final synthetic c:Lcom/ui/wifiman/ui/component/network/c$b;

.field public final synthetic d:LBe/b0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/q;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LLe/q;->b:Lof/a$c;

    iput-object p3, p0, LLe/q;->c:Lcom/ui/wifiman/ui/component/network/c$b;

    iput-object p4, p0, LLe/q;->d:LBe/b0;

    iput p5, p0, LLe/q;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LLe/q;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LLe/q;->b:Lof/a$c;

    iget-object v2, p0, LLe/q;->c:Lcom/ui/wifiman/ui/component/network/c$b;

    iget-object v3, p0, LLe/q;->d:LBe/b0;

    iget v4, p0, LLe/q;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LLe/s;->a(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
