.class public final synthetic LKe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/h0;

.field public final synthetic b:LL0/d;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/h0;LL0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKe/d;->a:Landroidx/compose/ui/platform/h0;

    iput-object p2, p0, LKe/d;->b:LL0/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKe/d;->a:Landroidx/compose/ui/platform/h0;

    iget-object v1, p0, LKe/d;->b:LL0/d;

    invoke-static {v0, v1}, LKe/i;->e(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;

    move-result-object v0

    return-object v0
.end method
