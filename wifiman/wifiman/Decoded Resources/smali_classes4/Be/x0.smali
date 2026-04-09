.class public final synthetic LBe/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/h0;

.field public final synthetic b:LL0/d;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/x0;->a:Landroidx/compose/ui/platform/h0;

    iput-object p2, p0, LBe/x0;->b:LL0/d;

    iput-object p3, p0, LBe/x0;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LBe/x0;->a:Landroidx/compose/ui/platform/h0;

    iget-object v1, p0, LBe/x0;->b:LL0/d;

    iget-object v2, p0, LBe/x0;->c:Landroid/content/Context;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, LBe/z0$a;->b(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
