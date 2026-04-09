.class final LI/F$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/F$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/F;


# direct methods
.method constructor <init>(LI/F;)V
    .locals 0

    iput-object p1, p0, LI/F$a$b;->a:LI/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/inputmethod/CursorAnchorInfo;

    invoke-virtual {p0, p1, p2}, LI/F$a$b;->b(Landroid/view/inputmethod/CursorAnchorInfo;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/view/inputmethod/CursorAnchorInfo;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LI/F$a$b;->a:LI/F;

    invoke-static {p2}, LI/F;->b(LI/F;)LI/q;

    move-result-object p2

    invoke-interface {p2, p1}, LI/q;->c(Landroid/view/inputmethod/CursorAnchorInfo;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
