.class public final synthetic LKe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/compose/ui/platform/t1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/platform/t1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKe/q;->a:Ljava/lang/String;

    iput-object p2, p0, LKe/q;->b:Landroidx/compose/ui/platform/t1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKe/q;->a:Ljava/lang/String;

    iget-object v1, p0, LKe/q;->b:Landroidx/compose/ui/platform/t1;

    invoke-static {v0, v1}, LKe/s;->e(Ljava/lang/String;Landroidx/compose/ui/platform/t1;)LYg/J;

    move-result-object v0

    return-object v0
.end method
