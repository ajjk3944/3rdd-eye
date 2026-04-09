.class public final synthetic LBe/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/h0;

.field public final synthetic b:LL0/d;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/I0;->a:Landroidx/compose/ui/platform/h0;

    iput-object p2, p0, LBe/I0;->b:LL0/d;

    iput-object p3, p0, LBe/I0;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LBe/I0;->a:Landroidx/compose/ui/platform/h0;

    iget-object v1, p0, LBe/I0;->b:LL0/d;

    iget-object v2, p0, LBe/I0;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2}, LBe/H0$b;->a(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)LYg/J;

    move-result-object v0

    return-object v0
.end method
