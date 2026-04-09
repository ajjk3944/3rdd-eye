.class public final synthetic LF9/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/a;

.field public final synthetic b:Landroidx/compose/ui/focus/o;


# direct methods
.method public synthetic constructor <init>(Lmh/a;Landroidx/compose/ui/focus/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/e0;->a:Lmh/a;

    iput-object p2, p0, LF9/e0;->b:Landroidx/compose/ui/focus/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF9/e0;->a:Lmh/a;

    iget-object v1, p0, LF9/e0;->b:Landroidx/compose/ui/focus/o;

    invoke-static {v0, v1}, LF9/k0;->b(Lmh/a;Landroidx/compose/ui/focus/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
