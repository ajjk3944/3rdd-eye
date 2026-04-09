.class final Landroidx/compose/ui/focus/FocusOwnerImpl$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusOwnerImpl;-><init>(Lmh/l;Lmh/p;Lmh/l;Lmh/a;Lmh/a;Lmh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/focus/FocusOwnerImpl$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$e;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusOwnerImpl$e;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusOwnerImpl$e;->a:Landroidx/compose/ui/focus/FocusOwnerImpl$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/focus/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/k;->w(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/k;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$e;->a(Landroidx/compose/ui/focus/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
