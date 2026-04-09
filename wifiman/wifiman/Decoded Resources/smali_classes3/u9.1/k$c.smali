.class final Lu9/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu9/k;->j(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lu9/k$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu9/k$c;

    invoke-direct {v0}, Lu9/k$c;-><init>()V

    sput-object v0, Lu9/k$c;->a:Lu9/k$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/focus/k;)V
    .locals 1

    const-string v0, "$this$focusProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/k;->w(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/k;

    invoke-virtual {p0, p1}, Lu9/k$c;->a(Landroidx/compose/ui/focus/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
