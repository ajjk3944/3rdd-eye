.class final LI/P0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/P0;-><init>(Landroid/view/View;Lmh/l;LI/I0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI/P0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/P0$c;

    invoke-direct {v0}, LI/P0$c;-><init>()V

    sput-object v0, LI/P0$c;->a:LI/P0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LI/P0$c;->a(Ljava/util/List;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
