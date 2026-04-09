.class public final synthetic LLe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LLe/d;

.field public final synthetic c:Lof/a$c;

.field public final synthetic d:Lcom/ui/wifiman/ui/component/network/c$b;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/p;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LLe/p;->b:LLe/d;

    iput-object p3, p0, LLe/p;->c:Lof/a$c;

    iput-object p4, p0, LLe/p;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iput p5, p0, LLe/p;->e:I

    iput p6, p0, LLe/p;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LLe/p;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LLe/p;->b:LLe/d;

    iget-object v2, p0, LLe/p;->c:Lof/a$c;

    iget-object v3, p0, LLe/p;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iget v4, p0, LLe/p;->e:I

    iget v5, p0, LLe/p;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LLe/s;->b(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
