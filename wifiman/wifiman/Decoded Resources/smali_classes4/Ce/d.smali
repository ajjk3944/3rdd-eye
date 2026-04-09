.class public final synthetic LCe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LCe/a$e;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LCe/a$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCe/d;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LCe/d;->b:LCe/a$e;

    iput p3, p0, LCe/d;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LCe/d;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LCe/d;->b:LCe/a$e;

    iget v2, p0, LCe/d;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LCe/j;->f(Landroidx/compose/ui/e;LCe/a$e;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
