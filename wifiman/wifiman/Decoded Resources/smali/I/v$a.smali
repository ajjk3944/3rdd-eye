.class final LI/v$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/v$a;

    invoke-direct {v0}, LI/v$a;-><init>()V

    sput-object v0, LI/v$a;->a:LI/v$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)LI/q;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LI/u;

    invoke-direct {v0, p1}, LI/u;-><init>(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    new-instance v0, LI/t;

    invoke-direct {v0, p1}, LI/t;-><init>(Landroid/view/View;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LI/v$a;->a(Landroid/view/View;)LI/q;

    move-result-object p1

    return-object p1
.end method
