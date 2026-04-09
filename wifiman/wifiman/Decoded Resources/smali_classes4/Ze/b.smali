.class public final synthetic LZe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LZe/a;

.field public final synthetic c:Lof/a$c;

.field public final synthetic d:Lcom/ui/wifiman/ui/component/network/c$b;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZe/b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LZe/b;->b:LZe/a;

    iput-object p3, p0, LZe/b;->c:Lof/a$c;

    iput-object p4, p0, LZe/b;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iput p5, p0, LZe/b;->e:I

    iput p6, p0, LZe/b;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LZe/b;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LZe/b;->b:LZe/a;

    iget-object v2, p0, LZe/b;->c:Lof/a$c;

    iget-object v3, p0, LZe/b;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iget v4, p0, LZe/b;->e:I

    iget v5, p0, LZe/b;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LZe/c;->a(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
