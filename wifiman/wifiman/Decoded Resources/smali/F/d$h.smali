.class public final LF/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/q1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d;->d(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Landroidx/compose/ui/platform/q1;

.field final synthetic b:Landroidx/compose/ui/platform/q1;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/q1;)V
    .locals 0

    iput-object p1, p0, LF/d$h;->b:Landroidx/compose/ui/platform/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/d$h;->a:Landroidx/compose/ui/platform/q1;

    return-void
.end method


# virtual methods
.method public a()Landroidx/compose/ui/platform/s1;
    .locals 1

    iget-object v0, p0, LF/d$h;->a:Landroidx/compose/ui/platform/q1;

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->a()Landroidx/compose/ui/platform/s1;

    move-result-object v0

    return-object v0
.end method

.method public b(Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 6

    iget-object v0, p0, LF/d$h;->b:Landroidx/compose/ui/platform/q1;

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/platform/q1;->b(Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LF/d$h;->a:Landroidx/compose/ui/platform/q1;

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->c()V

    return-void
.end method
