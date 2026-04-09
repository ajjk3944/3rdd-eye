.class public final synthetic LM9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lk0/e;

.field public final synthetic b:Landroidx/compose/ui/focus/o;


# direct methods
.method public synthetic constructor <init>(Lk0/e;Landroidx/compose/ui/focus/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/f;->a:Lk0/e;

    iput-object p2, p0, LM9/f;->b:Landroidx/compose/ui/focus/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM9/f;->a:Lk0/e;

    iget-object v1, p0, LM9/f;->b:Landroidx/compose/ui/focus/o;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-static {v0, v1, p1}, LM9/i;->b(Lk0/e;Landroidx/compose/ui/focus/o;Landroid/view/MotionEvent;)LYg/J;

    move-result-object p1

    return-object p1
.end method
