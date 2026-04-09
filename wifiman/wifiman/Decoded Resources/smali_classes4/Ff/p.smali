.class public final synthetic LFf/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LFf/d$a;

.field public final synthetic c:LFf/e;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LFf/d$a;LFf/e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFf/p;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LFf/p;->b:LFf/d$a;

    iput-object p3, p0, LFf/p;->c:LFf/e;

    iput p4, p0, LFf/p;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LFf/p;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LFf/p;->b:LFf/d$a;

    iget-object v2, p0, LFf/p;->c:LFf/e;

    iget v3, p0, LFf/p;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LFf/q;->a(Landroidx/compose/ui/e;LFf/d$a;LFf/e;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
