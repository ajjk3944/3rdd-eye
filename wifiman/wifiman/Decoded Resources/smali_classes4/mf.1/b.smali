.class public final synthetic Lmf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmf/a$a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmf/a$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lmf/b;->b:Lmf/a$a;

    iput p3, p0, Lmf/b;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmf/b;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lmf/b;->b:Lmf/a$a;

    iget v2, p0, Lmf/b;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lmf/d;->a(Landroidx/compose/ui/e;Lmf/a$a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
