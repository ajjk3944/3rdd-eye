.class public final Laa/c$b$h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b$h;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/z;

.field final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lb1/z;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$h$a;->a:Lb1/z;

    iput-object p2, p0, Laa/c$b$h$a;->b:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 2

    iget-object v0, p0, Laa/c$b$h$a;->a:Lb1/z;

    iget-object v1, p0, Laa/c$b$h$a;->b:Ljava/util/List;

    invoke-virtual {v0, p1, v1}, Lb1/z;->h(Landroidx/compose/ui/layout/t$a;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Laa/c$b$h$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
