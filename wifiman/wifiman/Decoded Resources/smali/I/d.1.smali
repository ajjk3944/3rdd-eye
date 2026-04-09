.class public final synthetic LI/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/L0;


# instance fields
.field public final synthetic a:LI/o1;

.field public final synthetic b:LR0/s;

.field public final synthetic c:LI/q;

.field public final synthetic d:Lmh/l;

.field public final synthetic e:LI/F;

.field public final synthetic f:LI/l1;

.field public final synthetic g:Landroidx/compose/ui/platform/w1;


# direct methods
.method public synthetic constructor <init>(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/d;->a:LI/o1;

    iput-object p2, p0, LI/d;->b:LR0/s;

    iput-object p4, p0, LI/d;->c:LI/q;

    iput-object p5, p0, LI/d;->d:Lmh/l;

    iput-object p6, p0, LI/d;->e:LI/F;

    iput-object p7, p0, LI/d;->f:LI/l1;

    iput-object p8, p0, LI/d;->g:Landroidx/compose/ui/platform/w1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 9

    iget-object v0, p0, LI/d;->a:LI/o1;

    iget-object v1, p0, LI/d;->b:LR0/s;

    iget-object v3, p0, LI/d;->c:LI/q;

    iget-object v4, p0, LI/d;->d:Lmh/l;

    iget-object v5, p0, LI/d;->e:LI/F;

    iget-object v6, p0, LI/d;->f:LI/l1;

    iget-object v7, p0, LI/d;->g:Landroidx/compose/ui/platform/w1;

    const/4 v2, 0x0

    move-object v8, p1

    invoke-static/range {v0 .. v8}, LI/c$c;->n(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method
