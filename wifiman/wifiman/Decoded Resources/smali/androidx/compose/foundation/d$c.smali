.class public final Landroidx/compose/foundation/d$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LJ0/g;

.field final synthetic d:Lmh/a;


# direct methods
.method public constructor <init>(ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$c;->a:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$c;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$c;->c:LJ0/g;

    iput-object p4, p0, Landroidx/compose/foundation/d$c;->d:Lmh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/B0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/d$c;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
