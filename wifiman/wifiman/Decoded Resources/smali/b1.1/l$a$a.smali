.class public final Lb1/l$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/l$a;-><init>(Lb1/f;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/f;

.field final synthetic b:Lmh/l;


# direct methods
.method public constructor <init>(Lb1/f;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lb1/l$a$a;->a:Lb1/f;

    iput-object p2, p0, Lb1/l$a$a;->b:Lmh/l;

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

    invoke-virtual {p0, p1}, Lb1/l$a$a;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
