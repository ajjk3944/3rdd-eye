.class public final synthetic LLe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:LLe/d;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLLe/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/l;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LLe/l;->b:Z

    iput-object p3, p0, LLe/l;->c:LLe/d;

    iput p4, p0, LLe/l;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LLe/l;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LLe/l;->b:Z

    iget-object v2, p0, LLe/l;->c:LLe/d;

    iget v3, p0, LLe/l;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LLe/m;->a(Landroidx/compose/ui/e;ZLLe/d;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
