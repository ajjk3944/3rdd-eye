.class final synthetic LI/O0$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/O0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:LI/O0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/O0$a;

    invoke-direct {v0}, LI/O0$a;-><init>()V

    sput-object v0, LI/O0$a;->a:LI/O0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "<init>(Landroid/view/View;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, LI/J0;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)LI/J0;
    .locals 1

    new-instance v0, LI/J0;

    invoke-direct {v0, p1}, LI/J0;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LI/O0$a;->a(Landroid/view/View;)LI/J0;

    move-result-object p1

    return-object p1
.end method
