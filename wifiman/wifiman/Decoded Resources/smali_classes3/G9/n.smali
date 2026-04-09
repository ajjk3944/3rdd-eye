.class public final synthetic LG9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/n;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LG9/n;->b:Ljava/lang/String;

    iput p3, p0, LG9/n;->c:I

    iput p4, p0, LG9/n;->d:I

    iput p5, p0, LG9/n;->e:I

    iput p6, p0, LG9/n;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LG9/n;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LG9/n;->b:Ljava/lang/String;

    iget v2, p0, LG9/n;->c:I

    iget v3, p0, LG9/n;->d:I

    iget v4, p0, LG9/n;->e:I

    iget v5, p0, LG9/n;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LG9/o;->a(Landroidx/compose/ui/e;Ljava/lang/String;IIIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
